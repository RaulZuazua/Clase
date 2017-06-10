package componentes;

/*import java.awt.Dimension;
import java.awt.Toolkit;*/

import javax.swing.*;

import java.awt.event.*;

// Extends JFrame so it can create frames

public class EjemploEventos extends JFrame {

	JButton button1;
	JTextField textField1;
	private JTextArea textArea1;
	int buttonClicked;

	public static void main(String[] args) {

		new EjemploEventos();

	}

	public EjemploEventos() {
		// Definir el tamaño del frame
		this.setSize(400, 400);

		// Define si el usuario puede cambiar el tamaño del frame (true por
		// defecto)
		this.setResizable(false);

		// Define como se sale del frame (Click Boton Cerrar)
		// Sin esto Java cerraria la App

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Define el titulo de la frame

		this.setTitle("La segunda Frame");

		// El JPanel contiene todos los componentes del Frame

		JPanel thePanel = new JPanel();

		// Crear un boton con su texto

		button1 = new JButton("Click Aqui");

		// Crear una instancia de ListenForEvents para manejar los eventos

		ListenForButton lForButton = new ListenForButton();

		// Decir a java que quieres que se avise 
		// cuando ocurre un evento en el boton
		
		button1.addActionListener(lForButton);

		thePanel.add(button1);

		// Añadir un campo de texto

		textField1 = new JTextField("Escribir aqui", 15);

		ListenForKeys lForKeys = new ListenForKeys();

		textField1.addKeyListener(lForKeys);

		thePanel.add(textField1);

		// Añadir un area de texto

		textArea1 = new JTextArea(15, 20);

		// Asignar el texto por defecto al area

		textArea1.setText("Control de eventos\n");

		// Si el texto no cabe en una linea saltar a la siguiente

		textArea1.setLineWrap(true);

		// Asegurarse de que las palabras quedan completas al salta de linea

		textArea1.setWrapStyleWord(true);

		// Añadir barras de scroll al area dew texto

		JScrollPane scrollbar1 = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		 
		thePanel.add(scrollbar1);

		this.add(thePanel);

		ListenForWindow lForWindow = new ListenForWindow();

		this.addWindowListener(lForWindow);

		this.setVisible(true);

		// Controlar el raton si esta dentro del panel

		ListenForMouse lForMouse = new ListenForMouse();

		thePanel.addMouseListener(lForMouse);

	}

	//  Clase que implementa el ActionListener de manera que pueda reaccionar a eventos

	private class ListenForButton implements ActionListener {

		// A este metodo se le llama cuando ocurre un evento
		// El parametro e, contiene la informacion del evento que se ha producido

		public void actionPerformed(ActionEvent e) {

			// Cheque si el evento que se ha producido es el del boton

			if (e.getSource() == button1) {

				buttonClicked++;

				// Cambia el texto de la etiqueta

				textArea1.append("Boton pulsado  " + buttonClicked + " veces\n");

				// e.getSource().toString() devuelve informacion del  boton y del evento
				// que ha ocurrido

			}

		}

	}

	// Cun un KeyListener se pueden capturar las teclas pulsadas en el teclado

	private class ListenForKeys implements KeyListener {

		// Gestiona la tecla pulsada en el campo de texto 
		// FUNCIONA PARA LAS TECLAS QUE GENERAN CODIGO UNICODE (A-Z,a-z,0-9 etc) .
		// NO FUNCIONAN PARA EL RESTO 
		// POR EJEMPLO CTRL, SHIFT F1,F2 ...  FLECHAS DEL CURSOR ETC.
		public void keyTyped(KeyEvent e) {
			textArea1.append("Tecla pulsada : " + e.getKeyChar() + "\n");
		}

		// Gestiona la tecla presionada en el campo de texto (CUALQUIER TECLA)

		public void keyPressed(KeyEvent e) {
		 textArea1.append("Tecla presionada : " + e.getKeyCode() + "\n");

		}

		// Gestiona la tecla despresionada en el campo de texto (CUALQUIER TECLA)
		public void keyReleased(KeyEvent e) {
			textArea1.append("Tecla soltada : " + e.getKeyCode() + "\n");

		}

	}

	private class ListenForMouse implements MouseListener {

		// sE USA CUANDO SE PULSA UN BOTON DEL RATON

		public void mouseClicked(MouseEvent e) {

			textArea1.append("Posicion del raton en el panel: " + e.getX() + " " + e.getY() + "\n");
			textArea1.append("Posicion del raton en pantalla: " + e.getXOnScreen() + " " + e.getYOnScreen() + "\n");
			textArea1.append("Boton del raton: " + e.getButton() + "\n");
			textArea1.append("Clicks del raton: " + e.getClickCount() + "\n");

		}

		// Se llama cuando el raton entra al componente que tiene asignado
		// el MouseListener

		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			textArea1.append("Entrando con el raton en el panel \n");
			
		}

		// Se llama cuando el raton sale del componente al que esta asociado
		// el MouseListener

		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			textArea1.append("Saliendo con el raton del panel \n");
		}

		// Se ha presionado el boton del raton

		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

		// Se ha soltado el boton del raton

		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	private class ListenForWindow implements WindowListener {

		// Se llama cuando la ventana es la venta activa

		public void windowActivated(WindowEvent e) {
			textArea1.append("Ventana activada\n");

		}

		// Se llama cuando la ventana se cierra usando dispose
		// this.dispose(); se usa para cerrar la ventana

		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub

		}

		// Se llama cuando la ventana se cierra desde el menu
		
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub

		}

		// Se llama cuando la ventana dej de ser la ventana activa

		public void windowDeactivated(WindowEvent e) {
			textArea1.append("Ventana desactivada\n");

		}

		// Se llama cuando la ventana pasa de minimizada a estado normal

		public void windowDeiconified(WindowEvent arg0) {
			textArea1.append("Ventana en estado normal\n");

		}

		// Se llama cuando la ventana se minimiza

		public void windowIconified(WindowEvent arg0) {
			textArea1.append("Ventana minimizada\n");

		}

		//Se llama cuando la ventana se crea por primera vez

		public void windowOpened(WindowEvent arg0) {
			textArea1.append("Ventana creada\n");

		}

	}

}