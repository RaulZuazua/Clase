package Bases_Elias;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
//PASO 1. Importar los paquetes necesarios
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;

public class VentanaPrincipal {

	private JFrame frame;
	private JPanel panelPrincipal;
	private JPanel pnNorte;
	private JPanel pnCentro;
	private JPanel pnSur;
	private JLabel lblIntroduzca;
	private static JTextField tfParam;
	private JScrollPane cPTabla;
	private static JTable tablaConsultas;
	private JButton btnSalir;
	private JButton btnEjecutar;
	// Nombre driver JDBC y URL de Base de Datos
	static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	// Credenciales de la base de datos
	static final String USER = "hr";
	static final String PASS = "oracle";
	private JPanel pnNNorte;
	private JPanel pnNCenter;
	private static JTextPane tpEstado;
	private JButton btnLimpiarTabla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		});

	}// fin main

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		initialize();
	}

	private static JTextPane getTpEstado() {
		if (tpEstado == null) {
			tpEstado = new JTextPane();
			tpEstado.setEditable(false);

		}
		return tpEstado;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 782, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(getPanelPrincipal(), BorderLayout.CENTER);
	}

	private JPanel getPanelPrincipal() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setLayout(new BorderLayout(0, 0));
			panelPrincipal.add(getPnNorte(), BorderLayout.NORTH);
			panelPrincipal.add(getPnCentro(), BorderLayout.CENTER);
			panelPrincipal.add(getPnSur(), BorderLayout.SOUTH);
		}
		return panelPrincipal;
	}

	private JPanel getPnNorte() {
		if (pnNorte == null) {
			pnNorte = new JPanel();
			pnNorte.setLayout(new BorderLayout(0, 0));
			pnNorte.add(getPnNNorte(), BorderLayout.NORTH);
			pnNorte.add(getPnNCenter(), BorderLayout.SOUTH);
		}
		return pnNorte;
	}

	private JPanel getPnCentro() {
		if (pnCentro == null) {
			pnCentro = new JPanel();
			pnCentro.setLayout(new BorderLayout(0, 0));
			pnCentro.add(getCPTabla(), BorderLayout.CENTER);
		}
		return pnCentro;
	}

	private JPanel getPnSur() {
		if (pnSur == null) {
			pnSur = new JPanel();
			pnSur.add(getBtnSalir());
			pnSur.add(getBtnLimpiarTabla());
		}
		return pnSur;
	}

	private JLabel getLblIntroduzca() {
		if (lblIntroduzca == null) {
			lblIntroduzca = new JLabel("Inztroduzca par\u00E1metro de consulta");
			lblIntroduzca.setFont(new Font("Tahoma", Font.BOLD, 16));
			lblIntroduzca.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
			lblIntroduzca.setForeground(new Color(0, 0, 128));
			lblIntroduzca.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblIntroduzca;
	}

	private static JTextField getTfParam() {
		if (tfParam == null) {
			tfParam = new JTextField();
			tfParam.setFont(new Font("Tahoma", Font.BOLD, 16));
			tfParam.setBackground(UIManager.getColor("InternalFrame.activeTitleBackground"));
			tfParam.setForeground(new Color(0, 0, 128));
			tfParam.setHorizontalAlignment(SwingConstants.RIGHT);
			tfParam.setColumns(10);
		}
		return tfParam;
	}

	private JScrollPane getCPTabla() {
		if (cPTabla == null) {
			cPTabla = new JScrollPane();
			cPTabla.setViewportView(getTablaConsultas());
		}
		return cPTabla;
	}

	// TODO: tabla
	private JTable getTablaConsultas() {
		if (tablaConsultas == null) {
			tablaConsultas = new JTable();
			tablaConsultas.setModel(
					new DefaultTableModel(new Object[][] {}, new String[] {  "Pais ID", "Pais","Region ID:"}) {
						Class[] columnTypes = new Class[] { String.class, Integer.class, String.class };

						public Class getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
					}

			);
			tablaConsultas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			centrar_datos(0);
			centrar_datos(1);
			centrar_datos(2);

		}
		return tablaConsultas;
	}

	public void centrar_datos(int col) {
		DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
		modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
		tablaConsultas.getColumnModel().getColumn(col).setCellRenderer(modelocentrar);
	}

	private JButton getBtnSalir() {
		if (btnSalir == null) {
			btnSalir = new JButton("Salir");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					System.exit(0);
				}
			});
		}
		return btnSalir;
	}

	private JButton getBtnEjecutar() {
		if (btnEjecutar == null) {
			btnEjecutar = new JButton("Ejecutar");
			btnEjecutar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					DefaultTableModel modeloTabla = (DefaultTableModel) tablaConsultas.getModel();
					Scanner teclado = new Scanner(System.in);
					Connection conn = null;
					Statement stmt = null;
					PreparedStatement pstmt = null;
					try {

						// PASO 2: Registrar driver JDBC oracle
						Class.forName("oracle.jdbc.driver.OracleDriver");
						Class.forName("com.mysql.jdbc.Driver");

						// PASO 3: Abrir una conexion
						tpEstado.setText("Conectando a la Base de Datos...");
						conn = DriverManager.getConnection(DB_URL, USER, PASS);

						// PASO 4: Ejecutar una consulta
						tpEstado.setText("Creando sentencia...");
						stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

						String sql;
						tpEstado.setText("Introduce la region");
						tfParam.getFocusListeners();

						String region = tfParam.getText();
						sql = "SELECT * from countries where region_id='" + region + "'";
						ResultSet rs = stmt.executeQuery(sql);
						// 'OR 'A'='A
						// PASO 5: Extraer los datos del result set
						while (rs.next()) {

							// Recuperamos por nombre de columna
							String pais_id = rs.getString(1);
							int region_id = rs.getInt(3);
							String pais = rs.getString(2);

							modeloTabla.addRow(new Object[] { pais_id, region_id, pais });

							// Display valores
							// System.out.print("Region ID: " + region_id);
							// System.out.print(" Pais " + pais);
							// System.out.print(" Pais ID: " + pais_id);
							// System.out.println();
						}

						// PASO 6: Limpiar el entorno
						rs.close();
						stmt.close();
						// conn.close();
						// CON SENTENCIAS PRECOMPILADAS
						pstmt = conn.prepareStatement("SELECT * FROM countries WHERE region_id = ?");
						pstmt.setString(1, region);
						ResultSet prs = pstmt.executeQuery();
						while (prs.next()) {
							// Recuperamos por nombre de columna
							String regions_id = prs.getString("region_id");
							String coutry_name = prs.getString("country_name");
							String country_id = prs.getString("country_id");

							// Display valores
							System.out.print("Region ID: " + regions_id);
							System.out.print(", Pais: " + coutry_name);
							System.out.print(", Pais ID : " + country_id);
							System.out.println();
						}

					} catch (SQLException se) {
						// Manejar errores de JDBC
						se.printStackTrace();
					} catch (Exception e) {
						// Manejar errores de Class.forName
						e.printStackTrace();
					} finally {
						// cerrar los recursos
						try {
							if (stmt != null)
								stmt.close();
						} catch (SQLException se2) {
						} // no se hace nada
						try {
							if (conn != null)
								conn.close();
						} catch (SQLException se) {
							se.printStackTrace();
						} // fin finally try
					} // fin try
					System.out.println("Adios!");

					tfParam.setText("");

				}
			});
		}
		return btnEjecutar;
	}

	private JPanel getPnNNorte() {
		if (pnNNorte == null) {
			pnNNorte = new JPanel();
			pnNNorte.add(getBtnEjecutar());
			pnNNorte.add(getTfParam());
			pnNNorte.add(getLblIntroduzca());
		}
		return pnNNorte;
	}

	private JPanel getPnNCenter() {
		if (pnNCenter == null) {
			pnNCenter = new JPanel();
			pnNCenter.setLayout(new BorderLayout(0, 0));
			pnNCenter.add(getTpEstado());
		}
		return pnNCenter;
	}

	private void Clear_Table() {
		DefaultTableModel modeloTabla = (DefaultTableModel) tablaConsultas.getModel();
		for (int i = 0; i < tablaConsultas.getRowCount(); i++) {
			modeloTabla.removeRow(i);
			i -= 1;
		}
	}

	private JButton getBtnLimpiarTabla() {
		if (btnLimpiarTabla == null) {
			btnLimpiarTabla = new JButton("Limpiar Tabla");
			btnLimpiarTabla.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					Clear_Table();
				}
			});
		}
		return btnLimpiarTabla;
	}
}
