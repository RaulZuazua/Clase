package dos_ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Frame;

public class Ventana_1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_1 window = new Ventana_1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana_1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButtonIRVENTANA2 = new JButton("IR A VENTANA 2");
		btnNewButtonIRVENTANA2.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
			
				ventana_2 nuevaVentana = new ventana_2();
				nuevaVentana.setVisible(true);
				
			
			
			}
		});
		btnNewButtonIRVENTANA2.setBounds(118, 101, 208, 59);
		frame.getContentPane().add(btnNewButtonIRVENTANA2);
	}
}
