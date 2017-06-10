package componentes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class JListTest {

	public static void main(String[] args)
	{
		JFrame f = new JFrame();
		f.setTitle("JListTest");
		f.setSize(400, 450);
		f.getContentPane().setLayout(new FlowLayout());
		String[] list = { "Primero", "Segundo", "Tercero", "Cuarto" };

		JList l = new JList(list);
		l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		f.getContentPane().add(l);

		JTextArea ta = new JTextArea(10, 30);
		ta.setLineWrap(true);
		JScrollPane sp = new JScrollPane(ta);
		f.getContentPane().add(sp, BorderLayout.CENTER);

		l.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				boolean isAdjusting = e.getValueIsAdjusting();
				// IsAdjusting indica si esta pendiente de gestionar algun
				// evento previo relacionado
				// Cuando es false indica que ya se ha acabado el proceso de
				// seleccion

				if (isAdjusting == false) {
					ta.append("Se ha cambiado la seleciòn. El valor selecionado ahora es :"
							+ l.getModel().getElementAt(l.getSelectedIndex()) + "\n");
				}
			}
		});
		f.setVisible(true);
	}

}
