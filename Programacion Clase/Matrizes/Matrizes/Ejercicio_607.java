package Matrizes;

import java.util.Scanner;

public class Ejercicio_607 {
	
	
	public static int[][] cargarMatriz (int Matriz[][]){
		
		Scanner teclado=new Scanner(System.in);
		
		
		for (int i=0; i<Matriz.length; i++){
			
			for (int o=0; o<Matriz[i].length; o++){
				
				System.out.println("Introduce el valor para [" + i + "]" + "[" + o + "] ");
				Matriz[i][o]=teclado.nextInt();
				
			} //fin for
			
			
		}	//fin for
		
		return Matriz;
		
		
	}	//fin metodo
	
	
	
	
	
	public static int[][] SumaMatriz (int matrizA [][], int [][] matrizB){
		
		int [][] vector=new int [2][4];
		
		for(int i=0; i<matrizA.length; i++){
			
			for (int o=0; o<matrizB[i].length; o++){
				
				
				vector[i][o]=matrizA[i][o]+matrizB[i][o];
				
			}	//FIN FOR
			
			
		}	//FIN FOR
		
		return vector;
		
		
	}	//FIN METODO
	
	
	
	
	public static void imprimirMatriz (int Matriz [][]){
		
		for (int i=0; i<2; i++){
			
			for (int o=0; o<4; o++){
				
				System.out.println("El valor para la posicion [" + i + "]" + "[" + o + "] : " + Matriz[i][o]);
				
			}
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] matriz_A=new int[2][4];
		int [][] matriz_B=new int [2][4];
		
		matriz_A=cargarMatriz(matriz_A);
		
		//imprimirMatriz(matriz_A);
		
	System.out.println(SumaMatriz (matriz_A, matriz_B));	
		
		
	}

}
