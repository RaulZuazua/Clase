package contenedores;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JScrollPaneTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JScrollPaneTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());

		JTextArea ta = new JTextArea("Escribe aquí...", 5, 15);
		JScrollPane p = new JScrollPane(ta);
		f.getContentPane().add(p);
		f.setVisible(true);

	}

}
