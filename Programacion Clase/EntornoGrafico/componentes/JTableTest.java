package componentes;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class JTableTest
{
	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setTitle("JTableTest");
		f.setSize(600, 650);
		f.getContentPane().setLayout(new FlowLayout());
		
		JTextArea ta = new JTextArea(10,40);
		
		JScrollPane panel=new JScrollPane(ta);
		
		f.add(panel);
		
	
		
		// Define el contenido inicial de la tabla con los datos
		// y los nombres de las cabeceras

		Object[][] datos = new Object[][] { 
			    { "Nombre1", "Apellido1", new Integer(911234567), true },
				{ "Nombre2", "Apellido2", new Integer(917463527), true },
				{ "Nombre3", "Apellido3", new Integer(912494735), false },
				{ "Nombre4", "Apellido4", new Integer(912387448), false } };

		String[] cabeceras = new String[] { "Nombre", "Apellidos", "Tfno", "¿Carnet?" };
		
		// Crea la tabla con los valores iniciales 
		JTable t = new JTable(datos,cabeceras);
		// Asigna el modelo de datos de la tabla 
	//	t.setModel(new Mimodelodetabla(datos, cabeceras));
		
		// Añade lineas a la tabla
		// Para trabajar con los datos de la tabla tenemos que acceder a su
		// modelo de datos
		// Este lo obtenemos del metodo getModel() de la tabla

	/*	DefaultTableModel tablemode = (DefaultTableModel) t.getModel();
		tablemode.addRow(new Object[] { "Nombre5", "Apellido5", new Integer(93232323),false });

		// getValueAt(Fila,columna) devuelve el valor de la celda asociada
		ta.append("El valor de la celda 1,1 antes de modificar es " + tablemode.getValueAt(1, 1) + "\n");

		// setValueAt(Objeto , Fila,columna) asigna a la celda indicada por
		// fila y columna el valor contenido en objeto
		// devuelve el valor de la celda asociada

		tablemode.setValueAt("Apellido Modificado", 1, 1);
		ta.append("El valor de la celda 1,1 despues de modificar es " + tablemode.getValueAt(1, 1) + "\n");

		// Borra las filas desde la posición indicada
	/*	tablemode.setRowCount(2);
		// Borra una determinada fila
		tablemode.removeRow(0);
		// Podemos iterar a traves de la tabla
	
		for (int i = 0; i < t.getRowCount(); i++) {
			for (int j = 0; j < t.getColumnCount(); j++) {
				ta.append("El valor de la posicion [" + i + "," + j + "] es :" + t.getValueAt(i, j) + "\n");
			} 
		}
*/
		JScrollPane sp = new JScrollPane(t);
		f.getContentPane().add(sp);
		
		
	
		ta.setLineWrap(true);
		ta.setWrapStyleWord(true);
		ta.setEditable(false);
		
		f.setVisible(true);
		
		/*
		t.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent event) {
				if (event.getValueIsAdjusting()==false)
				ta.append("Se ha selecionado la fila :" + t.getSelectedRow()+"\n");
			}

		}); */
	}

}
