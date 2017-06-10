package DAO_AVANZADO;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;import javax.xml.bind.ParseConversionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.UIManager;

public class EntornoGrafico {

	private JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_NombrePais;
	private JTextField textField_Region_ID;


	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EntornoGrafico window = new EntornoGrafico();
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
	public EntornoGrafico() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		
		DAOpaises dao= new DAOpaises();   // Crear un Objeto DAO
		
		ArrayList<Pais>lista = new ArrayList<>();
		lista=dao.listar(); // Llamo al metodo listar() del DAO y guarrdo el arrayList que retorna
		
		frame = new JFrame();
		frame.setBounds(100, 100, 718, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 153, 644, 219);
		frame.getContentPane().add(scrollPane);
		
		//:TODO TABLA
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Pais_ID", "Nombre_Pais", "Region_ID"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Integer.class
				
		
			};
			

			
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		
		
		scrollPane.setViewportView(table);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addFocusListener(new FocusAdapter() {
			
			
			
			
			
			//TODO: ( REALIZAR CONSULTA) Accion al perder el foco 
			
			@Override
			public void focusLost(FocusEvent arg0) {
				
				
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();
				
				if(comboBox.getSelectedItem()!=null){
				
				//TODO: LIMPIAR TABLA
				
				for ( int i=0; i<modelo.getRowCount();i++){
					
					modelo.removeRow(i);
					i -= 1;
				}
			
				
				
				ArrayList<Pais>resultado_consulta = new ArrayList<>();
				
				resultado_consulta =dao.Consulta_Paises(comboBox.getSelectedItem().toString());
				
				
				// MUESTRO EL RESULTADO DE LA CONSULTA EN LA TABLA
				 
				for(int i=0; i<resultado_consulta.size();i++){
					
					Pais p= new Pais(); // me creo un objeto Pais
					
					p=resultado_consulta.get(i);	//Guarda en p el pais correspondiente al ArrayList iterado con i
					
					modelo.addRow(new Object[] {p.getPais_id(),p.getNombre_pais(),p.getRegion_id() });  // Añado a la fila las caracteristicas del pais
					
					}

				}
				
				
				if (modelo.getRowCount()<1){
					
					JOptionPane.showMessageDialog(null, "No se ha encontrado ningun resultado para esta consulta");
					
				}
				
			}
			
			
			
			
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox.setBounds(295, 44, 122, 20);
		frame.getContentPane().add(comboBox);
		
		
		
		// TODO: Añadir paises al COMBOBOX
		
		comboBox.addItem(null);
			
		for(int i=0;i<lista.size();i++){  //Recorro el ArrayList que contiene los objetos Paises
			
			Pais p= new Pais(); // me creo un objeto Pais
			
			String nombre_pais;
			
			p=lista.get(i);    // Guardo cada pais (obj) en P
			
			nombre_pais=p.getNombre_pais(); // saco del pais solo el nombre
			
			comboBox.addItem(nombre_pais);  // añado el nombre del pais al combobox

		}
		
		
		
		
		JLabel lblSeleccionElNombre = new JLabel("Selecciona el Nombre del pais");
		lblSeleccionElNombre.setBounds(55, 47, 174, 14);
		frame.getContentPane().add(lblSeleccionElNombre);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(566, 43, 89, 23);
		frame.getContentPane().add(btnBuscar);
		
		
		//:TODO ACCION AL PRESIONAR EL BOTON RESET (MUESTRA TODOS LOS DATOS DE NUEVO)
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			
			
			
			public void actionPerformed(ActionEvent arg0) {
				

			
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();
				ArrayList<Pais>reset = new ArrayList<>();
				reset=dao.listar(); // LLAMO AL METODO LISTAR
				
				
				// LIMPIO LA TABLA
				
				for (int i = 0; i < modelo.getRowCount(); i++) {

					modelo.removeRow(i);
					i -= 1;
				}
				
				
				//VUELCO A LA TABLA  LOS RESULTADOS (TO DO)
				
				for(int i=0; i<reset.size();i++){
					
					Pais p= new Pais(); // me creo un objeto Pais
					
					p=reset.get(i);	//Guarda en p el pais correspondiente al ArrayList iterado con i
					
					modelo.addRow(new Object[] {p.getPais_id(),p.getNombre_pais(),p.getRegion_id() });  // Añado a la fila las caracteristicas del pais
					
	
				}
				

			
			}
		});
		btnReset.setBounds(309, 401, 89, 23);
		frame.getContentPane().add(btnReset);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			
			//TODO:Cuando pierda el foco de PAIS_ID Compruebo si existe y si es asi autocompleto
			
			@Override
			public void focusLost(FocusEvent arg0) {
				
				
				Pais p= new Pais();
				p=dao.Consulta_PAIS_ID(textField.getText());
				
				if(p.getPais_id()!=null){
					
					textField.setText(p.getPais_id());
					textField_NombrePais.setText(p.getNombre_pais());
					textField_Region_ID.setText(Integer.toString(p.getRegion_id()));
				}
				
			}
			
			
			
		});
		textField.setOpaque(false);
		textField.setBorder(new TitledBorder(null, "Pais_ID", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLUE));
		textField.setBounds(75, 104, 96, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_NombrePais = new JTextField();
		textField_NombrePais.setOpaque(false);
		textField_NombrePais.setColumns(10);
		textField_NombrePais.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Nombre Pais", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		textField_NombrePais.setBounds(232, 104, 96, 38);
		frame.getContentPane().add(textField_NombrePais);
		
		textField_Region_ID = new JTextField();
		textField_Region_ID.setOpaque(false);
		textField_Region_ID.setColumns(10);
		textField_Region_ID.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Region_ID", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		textField_Region_ID.setBounds(386, 104, 96, 38);
		frame.getContentPane().add(textField_Region_ID);
		
		JButton btnInsertar = new JButton("Insertar");
		btnInsertar.addActionListener(new ActionListener() {
			
			//TODO: BOTON INSERTAR
			
			public void actionPerformed(ActionEvent e) {
				
				
				try{
				
				Pais p = new Pais();
				p.setPais_id(textField.getText());
				p.setNombre_pais(textField_NombrePais.getText());
				p.setRegion_id(Integer.parseInt(textField_Region_ID.getText()));
				
				dao.insertar(p);
				
				}catch (Exception e1) {
					
					JOptionPane.showMessageDialog(null, "El formato de los datos introducidos no es valido");
				
				}
				
			}
			
	
			
		});
		btnInsertar.setBounds(563, 104, 89, 23);
		frame.getContentPane().add(btnInsertar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			
			
			//TODO:BOTON ELIMINAR
			
			
			public void actionPerformed(ActionEvent arg0) {
			
			
			dao.eliminar(dao.Consulta_PAIS_ID(textField.getText()));
			
			
			
			
			
			
			
			
			}
			

			
		});
		btnEliminar.setBounds(63, 401, 89, 23);
		frame.getContentPane().add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			
			
			
			//TODO: BOTON MODIFICAR
			
			public void actionPerformed(ActionEvent e) {
			
			Pais p = new Pais();
			
			p.setPais_id(textField.getText());
			p.setNombre_pais(textField_NombrePais.getText());
			p.setRegion_id(Integer.parseInt(textField_Region_ID.getText()));
			
			dao.MODIFICAR(p);
			
			}
		
		
		
		});
		btnModificar.setBounds(532, 401, 89, 23);
		frame.getContentPane().add(btnModificar);
		
		
		
		
		//TODO: Inicializar la tabla con todos los datos ( ¿ Esta bien ? )
		
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		
		for(int i=0; i<lista.size();i++){
			
			Pais p= new Pais(); // me creo un objeto Pais
			
			p=lista.get(i);	//Guarda en p el pais correspondiente al ArrayList iterado con i
			
			modelo.addRow(new Object[] {p.getPais_id(),p.getNombre_pais(),p.getRegion_id() });  // Añado a la fila las caracteristicas del pais
			
			
			
		}
		
		
		
	}
}
