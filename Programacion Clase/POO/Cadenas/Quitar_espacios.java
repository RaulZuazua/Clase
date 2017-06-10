package Cadenas;

import java.util.Scanner;

public class Quitar_espacios {
	
	
	public static String leerCadena(){
		
		String cadena;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce tu cadena de texto");
		cadena=teclado.nextLine();
		return cadena;
	}
	
	
	public static void eliminar_espacios(){
		String nueva_cadena;
		nueva_cadena=leerCadena().replaceAll(" ", "");
		System.out.println(nueva_cadena);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		eliminar_espacios();
		
		
		
	}

}
