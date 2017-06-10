package componentes;

import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class Mimodelodetabla extends DefaultTableModel {
	public Mimodelodetabla() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mimodelodetabla(int rowCount, int columnCount) {
		super(rowCount, columnCount);
		// TODO Auto-generated constructor stub
	}

	public Mimodelodetabla(Object[] columnNames, int rowCount) {
		super(columnNames, rowCount);
		// TODO Auto-generated constructor stub
	}

	public Mimodelodetabla(Object[][] data, Object[] columnNames) {
		super(data, columnNames);
		// TODO Auto-generated constructor stub
	}

	public Mimodelodetabla(Vector columnNames, int rowCount) {
		super(columnNames, rowCount);
		// TODO Auto-generated constructor stub
	}

	public Mimodelodetabla(Vector data, Vector columnNames) {
		super(data, columnNames);
		// TODO Auto-generated constructor stub
	}

	Class[] columnTypes = new Class[] { String.class, Object.class, Integer.class,Boolean.class };

	public Class getColumnClass(int columnIndex) {
		return columnTypes[columnIndex];
	}

	// Indica que columnas son editables o no
	boolean[] columnEditables = new boolean[] { true, false, false,true };

	public boolean isCellEditable(int row, int column) {
		return columnEditables[column];
	}
}
