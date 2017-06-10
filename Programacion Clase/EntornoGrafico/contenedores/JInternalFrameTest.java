package contenedores;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JInternalFrameTest
{
	public static void main(String[] args) {
	try {
	 		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JFrame f = new JFrame();
		f.setTitle("JInternalFrameTest");
		f.getContentPane().setLayout(null);
		f.setSize(600, 400);
		f.setLocationRelativeTo(null);
		
		
		JInternalFrame f1 = new JInternalFrame("InternalFrame 1");
		f1.setBounds(10, 10, 150, 100);
		f1.setVisible(true);
		
		JInternalFrame f2 = new JInternalFrame("InternalFrame 2");
		f2.setBounds(100, 100, 150, 100);
		f2.setVisible(true);
		
		
		f.getContentPane().add(f2);
		f.getContentPane().add(f1);
		f.setVisible(true);
	}

}
