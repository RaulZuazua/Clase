package BufferReadeer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFileChooser archivo = new JFileChooser(".");
		archivo.showOpenDialog(null);
		
		
		try {
			
			BufferedReader leer = new BufferedReader(new FileReader(archivo.getSelectedFile())); // creamos un objeto buffer leer a partir de un objeto filereader
			
			
			String texto="";  
			String linea= leer.readLine(); // leemos una linea y la almacenamos en linea
			
			
			
			while (linea !=null){  // mientras la linea no sea nula ( no existe)
				
				texto=texto+linea+ "\n"; // concatenamos texto 
				linea=leer.readLine(); // antes de salir del bucle volvemos a leer otra linea
				
			}
				
			
			System.out.println(texto);
			
			
		
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}

}
