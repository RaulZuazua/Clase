package componentes;

import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTextFieldTest {

	public static void main(String[] args)

	{

		JFrame f = new JFrame();
		f.setTitle("JTextFieldTest");
		f.setSize(400, 400);
		f.getContentPane().setLayout(new FlowLayout());

		JTextField tf = new JTextField(15);
		JTextArea ta = new JTextArea(15, 20);
		ta.setLineWrap(true);
		ta.setEditable(false);

		tf.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				ta.append(String.valueOf(e.getKeyChar()));

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (KeyEvent.VK_F1 == e.getKeyCode()) {
					JOptionPane.showMessageDialog(null, "Ha pulsado F1");
				}

			}

		});
		f.getContentPane().add(tf);
		f.getContentPane().add(ta);
		f.setVisible(true);

	}

}
