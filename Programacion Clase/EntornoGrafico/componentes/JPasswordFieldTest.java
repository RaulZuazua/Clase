package componentes;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class JPasswordFieldTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JPasswordFieldTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		JPasswordField pf = new JPasswordField("miPassword");
		f.getContentPane().add(pf);
		f.setVisible(true);

	}
}