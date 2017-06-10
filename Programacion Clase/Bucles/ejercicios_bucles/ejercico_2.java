package ejercicios_bucles;

import java.util.Scanner;

public class ejercico_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*2.	 Escribe un programa que te pregunte si quieres números pares o impares. 
		Si te dice pares, escribe los números pares del 1 al 10 y si te dice impares, 
		escribe los números impares del 1 al 10. */
		
		
		String paresimpares;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Que desea, numero pares o impares?");
		paresimpares=teclado.nextLine();
		
		
		if (paresimpares.equals("pares")) {
			
			for (int i=2;i<11;i=i+2){
				
				System.out.println("Los numeros pares del 1 al 10 son..." + i);
				
				
			}
			
			
		}
		
		else{
		
		for (int x=1;x<11;x=x+2){
			
			System.out.println("Los numeros impares del uno al 10 son..." + x);
			
			
		}
		
		}
		
		

	}

}
