package ejercicio_10_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class actividad_10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFileChooser archivo=new JFileChooser(".");   // CREO EL OBJETO TIPO FILE DESDE LA RUTA "."
		archivo.showOpenDialog(null);  // SELECCIONA LA VENTANA DE ABRIR
		
		
		try {
			
			FileReader leer=new FileReader(archivo.getSelectedFile()); // CREO EL FILEREADER LEER CON LA RUTA DEL OBJETO ARCHIVO
			
			String texto=""; // CREO UN STRING
			int contador=leer.read();  // CREO UN CONTADOR QUE SERA IGUAL AL VALOR EN DECIMAL DE EL CARACTER A LEER
			
 			while (contador != -1){  // MIENTRAS EL CONTADOR NO DEVUELVA -1 ( SE ACABO EL ARCHIVO)
				
				texto=texto+(char)contador; // CONCATENO LOS CARACTERA EN LA VARIABLE TEXTO
				contador=leer.read(); // Y VUELVO A LEER
			}
			
 			System.out.print(texto.toUpperCase().replaceAll(" ", "_"));  // IMPRIMO LA VARIABLE TEXTO
			leer.close(); // CIERRO EL FILEREADER CUANDO SALGO DEL BUCLE
			
			
		} catch (FileNotFoundException e) {
			
		
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		
	}

}
