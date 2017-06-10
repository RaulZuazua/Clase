package componentes;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class JRadioButtonTest {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("JRadioButtonTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		// Hay que agrupar los radiobutton para poder cambiar la seleccion
		ButtonGroup bg = new ButtonGroup();
		JRadioButton c1 = new JRadioButton("Hombre", true);
		JRadioButton c2 = new JRadioButton("Mujer", false);
		bg.add(c1);
		bg.add(c2);
		f.getContentPane().add(c1);
		f.getContentPane().add(c2);
		f.setVisible(true);
	}

}
