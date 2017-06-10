package componentes;

import javax.swing.*;

public class JOptionPaneTest

{

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JOptionPaneTest");
		f.setSize(200, 150);
		f.setVisible(true);
		JOptionPane.showMessageDialog(f, "MessageDialog");
		Object[] opciones = { "Aceptar", "Cancelar" };
		int i = JOptionPane.showOptionDialog(f, "OptionDialog", "Option", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		i = JOptionPane.showConfirmDialog(f, "ConfirmDialog");
		String s = JOptionPane.showInputDialog(f, "InputDialog");
	}

}
