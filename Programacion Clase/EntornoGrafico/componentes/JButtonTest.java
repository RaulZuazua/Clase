package componentes;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class JButtonTest {
	public static void main(String[] args) {
		JFrame f = new JFrame();

		f.setTitle("JButtonTest");
		f.setSize(300, 350);
		f.getContentPane().setLayout(new BorderLayout());
		
		JButton b = new JButton("Ok");
		
		JTextArea ta = new JTextArea(10,80);
		ta.setLineWrap(true);
		JScrollPane sp=new JScrollPane(ta);
		f.getContentPane().add(sp,BorderLayout.CENTER);
		f.getContentPane().add(b, BorderLayout.NORTH);
		f.setVisible(true);
		
		b.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			 
				ta.append(" Mouse Released\n");
				 
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				ta.append(  " Mouse Pressed\n");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				ta.append(  " Mouse Exited\n");
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				ta.append( " Mouse Entered\n");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				ta.append(  " MouseClicked\n");
			}
		}); 
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append(" Action Performed \n" );
			}
		});
	}
}
