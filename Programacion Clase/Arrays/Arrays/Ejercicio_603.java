package Arrays;

import java.util.Scanner;

public class Ejercicio_603 {
	
	
	public static void cargarVector ( int vector[] ){
		
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0; i<vector.length; i++){
			
			System.out.println("Introduce el valor para la posicion " + (i+1));
			vector[i]=teclado.nextInt();
			
		}
		
		
	}
	
	
	
	public static int [] vector_rotado (int vector []){
		
		
		int [] rotado=new int [vector.length];
		
		for (int o=0; o<vector.length; o++){
		
			rotado[o]=vector[vector.length-1-o];
	
		}
		
		return rotado;
		
	}
	
	
	
	public static void impirmirVector (int vector []){
		
		
		for(int i=0; i<vector.length; i++){
			
			System.out.println("Posicion " + (i+1) + " del vector es " + vector[i]);
			
		}
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] vector=new int [4];
		cargarVector(vector);
		vector=vector_rotado(vector);
		impirmirVector(vector);
		
		
		
		
	}

}
