package componentes;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class JCheckBoxTest {

	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setTitle("JCheckBoxTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		JCheckBox c = new JCheckBox("Mayor de 18 años");
		f.getContentPane().add(c);
		f.setVisible(true);
	}
}
