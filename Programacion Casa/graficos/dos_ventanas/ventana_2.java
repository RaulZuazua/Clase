package dos_ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class ventana_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_2 frame = new ventana_2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana_2() {
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				
				addKeyListener(this);
				char tecla=(char) e.getKeyCode();
				//if(tecla == KeyEvent.VK_F1){
					
					//JOptionPane.showMessageDialog(null, "HA PRESIONADO LA TECLA F1");
					

				//}
				
				
				
				 if(tecla==KeyEvent.VK_ENTER){
					 
					 System.out.println("dferghjtukyijtyhrgefdwefgnhmj");
					 
				 }
			
			}
		
		
		
		
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEstaEsLa = new JLabel("ESTA ES LA VENTANA 2");
		lblEstaEsLa.setBounds(134, 107, 131, 43);
		contentPane.add(lblEstaEsLa);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
			
				char tecla=(char) e.getKeyCode();
				if(tecla==KeyEvent.VK_ENTER){
					 
					 JOptionPane.showMessageDialog(null, "Ha presionado la tecla ENTER");
					 
				 }
			
			
			}
		
		
		});
		textField.setBounds(40, 191, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}
}
