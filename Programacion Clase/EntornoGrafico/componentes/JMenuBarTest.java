package componentes;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JMenuBarTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame("JMenuBarTest");
		f.setSize(200, 150);

		JMenuBar mb = new JMenuBar();

		JMenu m1 = new JMenu("Menu 1");
		m1.add(new JMenuItem("Opción 1"));
		m1.add(new JMenuItem("Opción 2"));

		JMenu m2 = new JMenu("Menu 2");
		m2.add(new JCheckBoxMenuItem("Opción 1"));
		m2.add(new JCheckBoxMenuItem("Opción 2", true));
		m2.addSeparator();

		ButtonGroup bg = new ButtonGroup();
		JRadioButtonMenuItem mrb1 = new JRadioButtonMenuItem("Opción 3", true);
		bg.add(mrb1);
		m2.add(mrb1);
		JRadioButtonMenuItem mrb2 = new JRadioButtonMenuItem("Opción 4", true);
		bg.add(mrb2);
		m2.add(mrb2);

		mb.add(m1);
		mb.add(m2);
		f.setJMenuBar(mb);
		f.setVisible(true);
	
	
	}

}

