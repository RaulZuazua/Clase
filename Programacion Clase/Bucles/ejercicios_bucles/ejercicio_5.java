package ejercicios_bucles;

import java.util.Scanner;

public class ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Escribe un programa que te pide dos números. Si el primero es menor que el segundo, 
		escribe todos los números comprendidos entre ambos en orden ascendente. Si el primero
		es mayor que el segundo, escribe todos los números comprendidos entre ambos en orden 
		descendente.*/ 
		
		
		
		int a,b;
		
		
		 System.out.println("Introduzca el primer numero");
		 Scanner teclado=new Scanner(System.in);
		 a=teclado.nextInt();
		 
		 
		 System.out.println("Introduzca el primer numero");
		 Scanner teclado1=new Scanner(System.in);
		 b=teclado1.nextInt();
		 
		 
		if (a<b){
			
			
			for (int i=a; i<b+1; i++)
			System.out.println(i);
		
			
		}
		

		else{
			
			
			for (int i=a; i>=b; i--)
				System.out.println(i);
				
		}
		
		
		
		
	}

}
