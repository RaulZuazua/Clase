package contenedores;

import java.awt.Dimension;
import javax.swing.*;

public class JSplitPaneTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JSplitPaneTest");
		f.setSize(600, 600);
		
		JLabel l1 = new JLabel(new ImageIcon("bitmap.png"));
		l1.setMinimumSize(new Dimension(500, 500));
		JLabel l2 = new JLabel(new ImageIcon("bitmap2.png"));
		l2.setMinimumSize(new Dimension(500, 500));
		
		JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, l1, l2);
		sp.setContinuousLayout(true);
		sp.setOneTouchExpandable(true);
		sp.setDividerLocation(100);
		f.getContentPane().add(sp);
		f.setVisible(true);
	}

}
