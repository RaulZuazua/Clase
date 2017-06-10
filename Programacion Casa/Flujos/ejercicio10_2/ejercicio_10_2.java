package ejercicio10_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ejercicio_10_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner ( System.in);
		int edad;
		String nombre;
		
		System.out.println("Introduce tu nombre");
		nombre= teclado.nextLine();
		
		System.out.println("Introduce tu edad");
		edad= teclado.nextInt();
	
		
		try (BufferedWriter salida = new BufferedWriter(new FileWriter("prueba.txt", true));){
			
			
	
			String texto="Nombre:" + nombre + " Edad: " + edad ;
			salida.write(texto);
			salida.newLine();
			
		} catch (IOException e) {
			
			System.out.println(e.getMessage());
			
		}
		
		
		
	}

}
