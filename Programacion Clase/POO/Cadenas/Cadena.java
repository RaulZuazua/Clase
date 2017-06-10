package Cadenas;

import java.util.Scanner;

public class Cadena {
	
	
	public static String leerCadena(){
		
		String S;
		Scanner teclado=new Scanner(System.in);
		System.out.println("INTRODUCE TU CADENA DE TEXTO");
		return S=teclado.nextLine();
	}
	
	
	public static char  leerCaracter() {
		
		char X;
		Scanner teclado=new Scanner(System.in);
		System.out.println("INTRODUCE TU CARACTER A CAMBIAR POR MAYUSCULAS");
		X=teclado.next().charAt(0);
		return X;
	}
	
	
	public static 	void mayusculas (String S, char X){
		
		char nuevo_caracter='a'; 
		String nueva_cadena ="";
	
		for(int i=0; i<S.length();i++){
			
			
			if(X==S.charAt(i)){
				
			nuevo_caracter=Character.toUpperCase(X);
			
			nueva_cadena=nueva_cadena+nuevo_caracter;
				
			}
			if(!(X==S.charAt(i)))
			nueva_cadena=nueva_cadena+S.charAt(i);
			
		}
			
		System.out.println(nueva_cadena);
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mayusculas(leerCadena(), leerCaracter());
		
		
		
		
		
	}

	

	
	
	
	
}
