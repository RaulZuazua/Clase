package Arrays;

import java.util.Scanner;

public class Ejercicio_601 {
	
	
	public static void cargar_array (int vector []){
		
		Scanner teclado=new Scanner(System.in);
		
		for (int i=0; i<vector.length; i++){
			
			System.out.println("Introduce el valor para la posicion " + (i+1));
			vector[i]=teclado.nextInt();
			
		}
		
		
	}
	
	
	
	public static void media_pares (int vector []){
		
		int aux = 0;
		double media = 0;
		int contador=0;
		
		for (int i=0; i<vector.length;i++){
			
			if (i%2==0){
			aux=aux+vector[i];
			contador++;
			
			}
		
			
		}
		
		media=aux/contador;
		System.out.println("La media del las posiciones pares es de " + media);
		
	}
	
	
	
	public static void media_impares (int vector []){
		
		int aux = 0;
		double media = 0;
		int contador=0;
		
		for (int i=0; i<vector.length;i++){
			
			if (!(i%2==0)){
			aux=aux+vector[i];
			contador++;
			
			}
		
		}
		
		media=aux/contador;
		System.out.println("La media del las posiciones impares es de " + media);
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vector=new int [10];
		
		cargar_array(vector);
		media_pares(vector);
		media_impares(vector);
		
		
		
		
		

	}

}
