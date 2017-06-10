package componentes;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JTreeTest");
		f.setSize(200, 150);
		f.getContentPane().setLayout(new FlowLayout());
		DefaultMutableTreeNode titulo =	new DefaultMutableTreeNode("Programación en Java");
		DefaultMutableTreeNode capitulo = new DefaultMutableTreeNode("AWT");
		titulo.add(capitulo);
		capitulo = new DefaultMutableTreeNode("JFC");
		titulo.add(capitulo);
		JTree tree = new JTree(titulo);
		JScrollPane sp = new JScrollPane(tree);
		f.getContentPane().add(sp);
		f.setVisible(true);
	}

}
