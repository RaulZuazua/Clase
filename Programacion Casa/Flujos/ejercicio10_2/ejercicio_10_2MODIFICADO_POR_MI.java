package ejercicio10_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ejercicio_10_2MODIFICADO_POR_MI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion = 0;

		do {
			
			System.out.println("--------- MENU --------" + "\n 1- Leer con FileReader." + "\n 2- Leer con BufferReader."
					+ "\n 3- Escribir con FileWriter." + "\n 4- Escribir con BufferWriter."
					+ "\n 5- Salir del programa.");

			switch (opcion) {
			case 1:
				FileReaderr();
				break;

			case 2:
				BufferReaderr();
				break;

			case 3:
				FileWriterr();
				break;

			case 4:
				BufferWriterr();
				break;
				
			
			case 5:
				System.out.println("\n Saliendo del programa");;
				break;

			}
			
			Scanner teclado= new Scanner(System.in);
			System.out.println("Introduce la opcion deseada");
			opcion=teclado.nextInt();

		} while (opcion > 0 && opcion < 6);
		
		System.out.println("Opcion no valida, vuelva a ejecutar el programa si lo desea");
	}
	
	
	
	

	private static void BufferWriterr() {
		
		try (BufferedWriter escritura= new BufferedWriter(new FileWriter("prueba.txt",true));){
			
			
			
			escritura.write("hola");
			escritura.newLine();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

	private static void FileWriterr() {
		

		try {
			
			FileWriter escritura=new FileWriter(".");
			String texto;
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	

	private static void BufferReaderr() {
		
		try (BufferedReader leer=new BufferedReader(new FileReader("prueba.txt"));){
			
						
			String texto="";
			String linea=leer.readLine();
			
			
			while(linea!= null){
				
				texto=texto+linea+ "\n";
				linea=leer.readLine();
				
				
			}
			
			System.out.print(texto);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

	private static void FileReaderr() {

		JFileChooser archivo = new JFileChooser(".");
		archivo.showOpenDialog(null);
		

		try (FileReader leer = new FileReader(archivo.getSelectedFile());){
				

			int iterador;
			String texto = "";
			iterador = leer.read();

			
			while (iterador != -1) {

				texto = texto + (char) iterador;
				iterador = leer.read();
				
			}
			
			
			System.out.println(texto);
			
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
