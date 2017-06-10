package componentes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class JComboBoxTest {

	public static void main(String[] args)
	{

		JFrame f = new JFrame();
		f.setTitle("JComboBoxTest");
		f.setSize(800, 350);
		f.setLayout(new FlowLayout());
		
		String[] list = { "Rojo", "Amarillo", "Blanco" };
		JComboBox c = new JComboBox(list);
		c.setActionCommand("Color Selecionado");
		f.getContentPane().add(c);
		
		JTextArea ta = new JTextArea(10,70);
		ta.setLineWrap(true);
		JScrollPane sp=new JScrollPane(ta);
		f.getContentPane().add(sp,BorderLayout.CENTER);
		f.setVisible(true);
		
		c.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				if (arg0.getStateChange() == ItemEvent.SELECTED) {
					String item =  (String) arg0.getItem();
					ta.append("Elemento selecionado :" + item +"\n");
				
				}
				if (arg0.getStateChange() == ItemEvent.DESELECTED) {
					String item =  (String) arg0.getItem();
					ta.append("Elemento deselecionado :" + item +"\n");
				}
			}
		});
		c.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(" Action Command  " + e.getActionCommand() + "\n");
				ta.append(e.getSource() +"\n");
			}
		});
	}

}
