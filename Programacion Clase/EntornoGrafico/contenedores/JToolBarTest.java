package contenedores;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import javax.swing.*;

public class JToolBarTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.icons");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		f.setTitle("JToolBarTest");
		f.setSize(600, 450);
		JToolBar tb = new JToolBar();
		tb.setSize(200, 150);
		
		JButton b = new JButton(new ImageIcon(" "));
			b.setSize(50,50);
			tb.add(b);
	
		b = new JButton(new ImageIcon(" "));
			b.setSize(50,50);
			tb.add(b);
	
		/*
		 * b = new JButton(new ImageIcon("Save24.gif")); tb.add(b); b = new
		 * JButton(new ImageIcon("Print24.gif"));
		 */
		tb.add(b);
		f.getContentPane().add(tb, BorderLayout.NORTH);
		f.setVisible(true);
	}

}
