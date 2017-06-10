package ejercicio_10_4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ejercicio_10_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFileChooser ficheroIn = new JFileChooser(".");
		ficheroIn.showOpenDialog(null);
		
		
		try (BufferedReader br=new BufferedReader(new FileReader(ficheroIn.getSelectedFile()))) {
			
			String texto="";
			String linea;
			
			int contador_lineas = 0;
			int contador_caracteres = 0;
			int contador_palabras = 0;
			
			while ((linea=br.readLine())!=null){   // mientras la lectura de la lina no sea null
				
				texto=texto+linea+ "\n";  // concateno el texto con la linea leida
				contador_lineas++;	// y sumo una al contador de lineas
				contador_caracteres=contador_caracteres+linea.length();	// calculo los caracteres de la linea ya que si calculo el texto completo me cuenta los espacios como caracter			
			}
			
			
			String texto_sin_intros=texto.replaceAll("\n", " ");
			
			Scanner sc=new Scanner (texto_sin_intros);		// escaneo el texto
			sc.useDelimiter(" ");  // uso el delimitador del espacio en blanco (token)
			
			
			while(sc.hasNext()) {	// mientras encuentre un espacio en blanco (token)
					
					sc.next();	// pasa al siguiete delimitador (token)
					contador_palabras ++; // y suma uno al contador
					
			}
			
			sc.close(); // cierro el scanner
			
			
			
					
			
			System.out.println("El numero de palabras en esta carta es de " + contador_palabras  );
			System.out.println("El numero de lineas en esta carta es de " + contador_lineas  );
			System.out.println("El numero de caracteres en esta carta es de " + contador_caracteres  );
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
			
		
		
		
	}

}
