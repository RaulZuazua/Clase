package Arrays;

import java.util.Scanner;

public class Ejercicio_602 {
	
	
	public static void cargar_array (int vector []){
		
		int posicion=-1;
		int valor;
		Scanner teclado=new Scanner(System.in);
		
		
		for ( int numeros:vector){
			
			posicion++;
			System.out.println("Introduce el valor para la posicion " + (posicion));
			vector[posicion]=teclado.nextInt();
			
		}
		
		
	}
	
	
	
	
	public static void numeroMayor (int vector[]){
		
		int posicion=-1;
		int mayor=-2;//Integer.MIN_VALUE;
		int contador_repetidos = 0;
		boolean repetidos=false;
		String posicion_repetidos="";
		
		
		for (int numeros:vector){
			
			posicion++;
			
			if(vector[posicion]==mayor){
				
				repetidos=true;
				contador_repetidos++;
				posicion_repetidos=posicion_repetidos+Integer.toString(posicion) + " ";
				
			}
			
			else if (vector[posicion]>mayor){
				
				mayor=vector[posicion];
				
			}
				
			
		}
		
		System.out.println("El numero mayor es : " + mayor);
		
		if (repetidos=true)
		System.out.println("El numero mayor se repite " + (contador_repetidos+1) + " veces en la posicion " + posicion_repetidos );
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] vector=new int [5];
		cargar_array(vector);
		numeroMayor(vector);
		
		
		
		
	}

}
