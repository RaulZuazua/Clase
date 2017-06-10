package DAO;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EntornoGrafico {

	private JFrame frame;
	private JTable table;


	
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
		scrollPane.setBounds(28, 128, 644, 293);
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
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {}));
		comboBox.setBounds(309, 44, 122, 20);
		frame.getContentPane().add(comboBox);
		
		
		
		// TODO: Añadir paises al COMBOBOX
		
		
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
				
				
				//VUELCO A LA TABLA  LOS RESULTADOS (TODO)
				
				for(int i=0; i<reset.size();i++){
					
					Pais p= new Pais(); // me creo un objeto Pais
					
					p=reset.get(i);	//Guarda en p el pais correspondiente al ArrayList iterado con i
					
					modelo.addRow(new Object[] {p.getPais_id(),p.getNombre_pais(),p.getRegion_id() });  // Añado a la fila las caracteristicas del pais
					
	
				}
			
			
			}
		});
		btnReset.setBounds(322, 94, 89, 23);
		frame.getContentPane().add(btnReset);
		
		
		
		
		//TODO: Inicializar la tabla con todos los datos ( ¿ Esta bien ? )
		
		DefaultTableModel modelo = (DefaultTableModel)table.getModel();
		
		for(int i=0; i<lista.size();i++){
			
			Pais p= new Pais(); // me creo un objeto Pais
			
			p=lista.get(i);	//Guarda en p el pais correspondiente al ArrayList iterado con i
			
			modelo.addRow(new Object[] {p.getPais_id(),p.getNombre_pais(),p.getRegion_id() });  // Añado a la fila las caracteristicas del pais
			
			
			
		}
		
		
		
	}
}
