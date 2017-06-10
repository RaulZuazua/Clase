package pruebas;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Checkbox;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Pruebas1 {

	private JFrame frame;
	private JTable table;
	private JTextField textKM;
	private JTextField textEtapa;
	private JTextField textTipo;
	private JTextField textFecha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruebas1 window = new Pruebas1();
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
	public Pruebas1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1011, 553);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 995, 21);
		frame.getContentPane().add(menuBar);

		JMenu mnDatos = new JMenu("Datos");
		menuBar.add(mnDatos);

		
		//TODO: IMPORTAR DATOS
		
		
		JMenuItem mntmImportar = new JMenuItem("Importar");
		mntmImportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
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

		
		
		//TODO: EXPORTAR
		
		JMenuItem mntmExportar = new JMenuItem("Exportar");
		mntmExportar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			JFileChooser out = new JFileChooser(".");
			out.setFileSelectionMode(JFileChooser.FILES_ONLY);
			int result = out.showSaveDialog(null);
			
			if (result== JFileChooser.APPROVE_OPTION){
				
				
				DefaultTableModel modelo = (DefaultTableModel)table.getModel();

				File Datos1 = new File(out.getSelectedFile() + ".dat");
				
				try (DataOutputStream dataOut = new DataOutputStream (new FileOutputStream(out.getSelectedFile()))) {
					
					
					
					 for (int i=0;i< table.getRowCount();i++){
				    	   
				    	   for ( int j=0;j<table.getColumnCount();j++){
				    		   
				    		   if (j==0)
				    		   dataOut.writeInt((int)table.getValueAt(i, j));
				    		   if (j==1)
				    		   dataOut.writeDouble((double) table.getValueAt(i, j));
				    		   if (j==2)
				    		   dataOut.writeUTF( table.getValueAt(i, j).toString());
				    		   if (j==3)
				    		   dataOut.writeUTF( table.getValueAt(i, j).toString());
				    		   if (j==4)
				    		   dataOut.writeBoolean((boolean) table.getValueAt(i, j));
				    
   
				    	   }
						 

						 
					 }
					
					

					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				

				
			}
				

			
			}
			
			
			
		});
		mnDatos.add(mntmExportar);

		JPanel panel = new JPanel();
		panel.setBounds(0, 21, 995, 493);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(34, 42, 531, 415);
		panel.add(scrollPane);

		// TODO: TABLA

		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Etapa", "KM", "Tipo Etapa", "Fecha", "Alto?"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, Integer.class, String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		}

		);
		
		
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				//
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				int row = table.getSelectedRow();
				if (row != -1) {
					for (int i = 0; i < modelo.getColumnCount(); i++) {


						if (modelo.getColumnName(i).equals("Etapa"))
							textEtapa.setText(String.valueOf(modelo.getValueAt(row, i)));
						if (modelo.getColumnName(i).equals("KM"))
							textKM.setText(String.valueOf(modelo.getValueAt(row, i)));
						if (modelo.getColumnName(i).equals("Fecha"))
							textFecha.setText(String.valueOf(modelo.getValueAt(row, i)));
						if (modelo.getColumnName(i).equals("Tipo Etapa"))
							textTipo.setText(String.valueOf(modelo.getValueAt(row, i)));

					}
				}

			}

			
		});


		
		
		

		// TODO: NO REORDENAR COLUMNAS

		// table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); //Evito que se
		// redimendione la tabla
		table.getTableHeader().setReorderingAllowed(false); // Evito que se
															// reordenen las
															// columnas

		textKM = new JTextField();
		textKM.setBounds(830, 147, 114, 20);
		panel.add(textKM);
		textKM.setColumns(10);

		textEtapa = new JTextField();
		
		//TODO: Si pierdo foco compurebo que la etapa esta repedia o no
		
		textEtapa.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				
				if (!(textEtapa.getText().length()==0)){  //Primero compuebo que el valor no este vacio

				for (int i = 0; i < modelo.getRowCount(); i++) {
					if (modelo.getValueAt(i, 0).equals(Integer.parseInt(textEtapa.getText()))) {
						JOptionPane.showMessageDialog(null, "Etapada ya existe");
						textEtapa.requestFocusInWindow();

					}
				}
			}

			}
			
		});
		textEtapa.setColumns(10);
		textEtapa.setBounds(830, 74, 114, 20);
		panel.add(textEtapa);

		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(830, 216, 114, 20);
		panel.add(textTipo);

		textFecha = new JTextField();
		textFecha.setColumns(10);
		textFecha.setBounds(830, 288, 114, 20);
		panel.add(textFecha);

		Checkbox checkboxFinal_Alto = new Checkbox("Final en Alto?");
		checkboxFinal_Alto.setBounds(743, 361, 101, 23);
		panel.add(checkboxFinal_Alto);

		JLabel lblNEtapa = new JLabel("N\u00BA Etapa");
		lblNEtapa.setBounds(678, 76, 55, 16);
		panel.add(lblNEtapa);

		JLabel lblKm = new JLabel("KM");
		lblKm.setBounds(678, 149, 55, 16);
		panel.add(lblKm);

		JLabel lblTipoEtapa = new JLabel("Tipo Etapa");
		lblTipoEtapa.setBounds(678, 218, 55, 16);
		panel.add(lblTipoEtapa);

		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(678, 290, 55, 16);
		panel.add(lblFecha);

		// :TODO : BOTON CREAR

		Button buttonCrear = new Button("Crear");
		buttonCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				DefaultTableModel modelo = (DefaultTableModel) table.getModel();

				try {	//Creamos una fila con los fdatos recogijos del los texfield
				
				modelo.addRow(new Object[] { Integer.parseInt(textEtapa.getText()),
						Double.parseDouble(textKM.getText()), (String) textTipo.getText(), (String) textFecha.getText(),
						(boolean) checkboxFinal_Alto.getState() });
				
				
				}catch (NumberFormatException e) {
				 JOptionPane.showMessageDialog(null, "Los datos introducidos no son validos, compruebe el formato de estos"); // si no hay datos o se introducen mal
				}
				

			}
		});
		buttonCrear.setBounds(633, 434, 76, 23);
		panel.add(buttonCrear);

		// TODO:BOTON BORRAR

		Button buttonBorrar = new Button("Borrar");
		buttonBorrar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				int fila = table.getSelectedRow();   // Guardo en fila el numero de fila seleccionada

				
				
				if (fila!=-1) {  // si HAY fila seleccionada
					
					DefaultTableModel modelo = (DefaultTableModel) table.getModel();
					modelo.removeRow(fila);

				}


				else  //Si NO HAY fila seleccionada
					
					JOptionPane.showMessageDialog(null, "Seleccione la columna a borrar.");
			}
		});
		buttonBorrar.setBounds(857, 434, 76, 23);
		panel.add(buttonBorrar);
		
		Button buttonActualizar = new Button("Actualizar");
		buttonActualizar.addActionListener(new ActionListener() {
			
			//TODO:BOTON ACTUALIZAR
			
			
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel modelo = (DefaultTableModel) table.getModel();
				// "Etapa", "KM", "Fecha", "Tipo Etapa", "Alto?"
				
				int fila = table.getSelectedRow();
				
				if (fila != -1) {  // Mientra tengamos una fila seleccionada
					
					for (int i = 0; i < modelo.getColumnCount(); i++) {   // Recorremos las columnas
						
						
						
						if (table.getColumnName(i).equals("Etapa"))
							modelo.setValueAt(	Integer.valueOf(textEtapa.getText()), fila,i);
						
						if (table.getColumnName(i).equals("KM"))
							modelo.setValueAt(Double.valueOf(textKM.getText()),fila,i);
						
						if (table.getColumnName(i).equals("Fecha"))
							modelo.setValueAt(textFecha.getText(),fila, i);
						
						if (table.getColumnName(i).equals("Tipo Etapa"))
							modelo.setValueAt(textTipo.getText(),fila, i);
						
						if (table.getColumnName(i).equals("Alto?"))
							modelo.setValueAt( (boolean) checkboxFinal_Alto.getState(), fila, i);

					}
					
					
				} else
					JOptionPane.showMessageDialog(null, "Selecciona una fila");  // Si no se selecciona ninguna columna
			}

				
				
				
				
				
			
			
			
			
			
			
		});
		buttonActualizar.setBounds(747, 434, 76, 23);
		panel.add(buttonActualizar);
	}
}
