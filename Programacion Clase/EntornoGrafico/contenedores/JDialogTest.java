package contenedores;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JFrameTest");
		f.setLayout(new FlowLayout());
		f.setSize(600, 450);
		f.setVisible(true);
		
		JButton button = new JButton("OK");
		JDialog d = new JDialog(f);
		d.getContentPane().add(button);
		d.setTitle("JDialogTest");
		d.setBounds(250, 50, 170, 150);
		d.setLayout(new FlowLayout());
		d.setVisible(true);
	}

}
