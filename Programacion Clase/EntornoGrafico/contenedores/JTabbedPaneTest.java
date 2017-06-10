package contenedores;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JTabbedPaneTest");
		f.setSize(200, 150);
		
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JButton btnpanel1=new JButton("Panel1");
		JButton btnpanel2=new JButton("Panel2");
		
		panel1.add(btnpanel1);
		tabbedPane.addTab("Pestaña 1", panel1);
		
		panel2.add(btnpanel2);
		tabbedPane.addTab("Pestaña 2", panel2);
		f.getContentPane().add(tabbedPane);
		f.setVisible(true);
	}

}
