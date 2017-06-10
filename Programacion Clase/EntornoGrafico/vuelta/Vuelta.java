package vuelta;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Checkbox;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vuelta {

	private JFrame frame;
	private JTextField textFieldEtapa;
	private JTextField textFieldKM;
	private JTextField textFieldFecha;
	private JTable table;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vuelta window = new Vuelta();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vuelta() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 856, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnDatos = new JMenu("Datos");
		menuBar.add(mnDatos);
		
		JMenuItem mntmImportar = new JMenuItem("Importar");
		mntmImportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				JFileChooser in = new JFileChooser(".");
				in.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int result=in.showOpenDialog(null);
				
				if (result == JFileChooser.APPROVE_OPTION) {
					
					DefaultTableModel modelo = (DefaultTableModel)table.getModel();


					try (DataInputStream dataIn = new DataInputStream (new FileInputStream(in.getSelectedFile()))) {
						
						try{
						
							while(true){   // Mientras Siga habiendo datos en el archivo


								modelo.addRow(new Object[] { dataIn.readInt(), dataIn.readDouble(), dataIn.readUTF(),dataIn.readUTF(),dataIn.readBoolean() });  // Introduco una linea con los datos

						}
						
						
					
						}catch(EOFException e2) {
							JOptionPane.showMessageDialog(null, "Datos importados correctamente");  // Cuando acaba el Archivo Los datos fueron importados
						}
						

					} catch (FileNotFoundException e2) {
						JOptionPane.showMessageDialog(null, "Archivo No encontrado");
						
					} catch (IOException e1) {
						JOptionPane.showMessageDialog(null, "ERROR en la Importacion");

				}
					

			}
				
			}
		});
		mnDatos.add(mntmImportar);
		
		
		
		JMenuItem mntmE = new JMenuItem("Exportar");
		mntmE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				JFileChooser FicheroOut = new JFileChooser(".");
				FicheroOut.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int result =FicheroOut.showSaveDialog(null);
				
				
				if(result==JFileChooser.APPROVE_OPTION){
					
					File Datos1 = new File(FicheroOut.getSelectedFile() +".dat");
					
					try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(FicheroOut.getSelectedFile()))) {

						
						 
					        //Sección 2
					       //bject [] datos=new Object[6]; 
					 

					        //Sección 5
					       //table.setModel(modelo); 
					
					       for (int i=0;i< table.getRowCount();i++){
					    	   
					    	   for ( int j=0;j<table.getColumnCount();j++){
					    		   
					    		   Object objeto = table.getValueAt(j, i);
					    		   
					    		   dataOut.writeInt((int)objeto);
					    	   }
					    	   
					    
					       }
					 
					 
						

					} catch (FileNotFoundException e2) {
						
						e2.printStackTrace();
					} catch (IOException e1) {
						
						e1.printStackTrace();
					}
					
					
					
					
					
					
					
					
					
				}
				
				
				
			}
		});
		mnDatos.add(mntmE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		tabbedPane.setOpaque(true);
		tabbedPane.setBounds(10, 11, 820, 416);
		frame.getContentPane().add(tabbedPane);
		
		JLayeredPane layeredPane_NUEVAETAPA = new JLayeredPane();
		layeredPane_NUEVAETAPA.setOpaque(true);
		layeredPane_NUEVAETAPA.setForeground(SystemColor.control);
		layeredPane_NUEVAETAPA.setBackground(SystemColor.control);
		tabbedPane.addTab("Nueva Etapa", null, layeredPane_NUEVAETAPA, null);
		
		JLabel lblAltaDeEtapas = new JLabel("ALTA DE ETAPAS");
		lblAltaDeEtapas.setOpaque(true);
		lblAltaDeEtapas.setHorizontalAlignment(SwingConstants.CENTER);
		lblAltaDeEtapas.setBackground(Color.GREEN);
		lblAltaDeEtapas.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAltaDeEtapas.setBounds(261, 38, 244, 42);
		layeredPane_NUEVAETAPA.add(lblAltaDeEtapas);
		
		JLabel lblNEtapa = new JLabel("N\u00BA Etapa");
		lblNEtapa.setBounds(220, 118, 55, 16);
		layeredPane_NUEVAETAPA.add(lblNEtapa);
		
		JLabel lblKilometros = new JLabel("Kilometros");
		lblKilometros.setBounds(220, 165, 68, 16);
		layeredPane_NUEVAETAPA.add(lblKilometros);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(220, 214, 55, 16);
		layeredPane_NUEVAETAPA.add(lblFecha);
		
		JLabel lblTipoEtapa = new JLabel("Tipo Etapa");
		lblTipoEtapa.setBounds(220, 270, 82, 16);
		layeredPane_NUEVAETAPA.add(lblTipoEtapa);
		
		textFieldEtapa = new JTextField();
		textFieldEtapa.setBounds(500, 116, 114, 20);
		layeredPane_NUEVAETAPA.add(textFieldEtapa);
		textFieldEtapa.setColumns(10);
		
		textFieldKM = new JTextField();
		textFieldKM.setColumns(10);
		textFieldKM.setBounds(500, 163, 114, 20);
		layeredPane_NUEVAETAPA.add(textFieldKM);
		
		textFieldFecha = new JTextField();
		textFieldFecha.setColumns(10);
		textFieldFecha.setBounds(500, 212, 114, 20);
		layeredPane_NUEVAETAPA.add(textFieldFecha);
		
		JComboBox comboBox_TipoEtapa = new JComboBox();
		comboBox_TipoEtapa.setModel(new DefaultComboBoxModel(new String[] {"En Linea", "Contrarreloj"}));
		comboBox_TipoEtapa.setBounds(500, 266, 114, 25);
		layeredPane_NUEVAETAPA.add(comboBox_TipoEtapa);
		
		JCheckBox chckbxFinalEnAlto = new JCheckBox("Final en Alto");
		chckbxFinalEnAlto.setBounds(327, 309, 112, 24);
		layeredPane_NUEVAETAPA.add(chckbxFinalEnAlto);
		
		//TODO:BOTON CREAR
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();
				
				try{
				
				modelo.addRow(new Object[] {Integer.parseInt(textFieldEtapa.getText()), Double.parseDouble(textFieldKM.getText()),textFieldFecha.getText(),(String)comboBox_TipoEtapa.getSelectedItem(),(boolean)chckbxFinalEnAlto.isSelected()});

				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "El formato numerico no es valido");
					
				}
				
			}
		});
		btnCrear.setBounds(327, 345, 98, 26);
		layeredPane_NUEVAETAPA.add(btnCrear);
		
		JLayeredPane layeredPane_ETAPAS = new JLayeredPane();
		layeredPane_ETAPAS.setOpaque(true);
		layeredPane_ETAPAS.setBackground(SystemColor.control);
		layeredPane_ETAPAS.setForeground(SystemColor.control);
		tabbedPane.addTab("Etapas", null, layeredPane_ETAPAS, null);
		layeredPane_ETAPAS.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 23, 464, 343);
		scrollPane.setBorder(new TitledBorder(null, "Seleccione una etapa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		layeredPane_ETAPAS.add(scrollPane);
		
		//TODO: TABLA
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{new Integer(1), new Double(214.0), "01-05-2017", "Contrareloj", Boolean.TRUE},
			},
			new String[] {
				"Etapa", "KM", "Fecha", "Tipo Etapa", "Alto?"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Double.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		panel.setBorder(new TitledBorder(null, "Kilometros", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		panel.setBounds(573, 75, 140, 68);
		layeredPane_ETAPAS.add(panel);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(0, 0, 999, 1));
		panel.add(spinner);
		
		JPanel panel_1 = new JPanel();
		panel_1.setOpaque(false);
		panel_1.setBorder(new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBounds(573, 155, 140, 68);
		layeredPane_ETAPAS.add(panel_1);
		
		textField_3 = new JTextField();
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Etapa");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(532, 23, 55, 16);
		layeredPane_ETAPAS.add(lblNewLabel);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.GREEN);
		textField_4.setForeground(Color.WHITE);
		textField_4.setBounds(632, 17, 140, 28);
		layeredPane_ETAPAS.add(textField_4);
		textField_4.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setOpaque(false);
		panel_2.setBorder(new TitledBorder(null, "Fecha", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_2.setBounds(573, 237, 140, 68);
		layeredPane_ETAPAS.add(panel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"En Linea", "Contrarreloj"}));
		panel_2.add(comboBox_1);
		
		JCheckBox chckbxTerminaEnAlto = new JCheckBox("Termina en Alto");
		chckbxTerminaEnAlto.setBounds(584, 317, 129, 18);
		layeredPane_ETAPAS.add(chckbxTerminaEnAlto);
		
		JButton btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(524, 347, 101, 28);
		layeredPane_ETAPAS.add(btnActualizar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(673, 347, 101, 28);
		layeredPane_ETAPAS.add(btnBorrar);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(482, 23, 9, 343);
		layeredPane_ETAPAS.add(separator);
	}
}
