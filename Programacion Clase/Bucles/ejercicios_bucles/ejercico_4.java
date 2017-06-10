package ejercicios_bucles;

import java.util.Scanner;

public class ejercico_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*4.	 Escribe un programa que te pida dos números con la condición de que el segundo
		sea mayor que el primero, en caso contrario te pregunta de nuevo el número hasta que
		sea correcto. Si los números son correctos, escribe todos los números comprendidos 
		entre el primer y el segundo número (ambos inclusive).*/ 
		
		
		
		int a,b;
		System.out.println("Introduzca cual es el primer numero");
		Scanner teclado=new Scanner(System.in);
		a=teclado.nextInt();
		
		
		System.out.println("Introduzca cual es el segundo numero");
		Scanner teclado1=new Scanner(System.in);
		b=teclado.nextInt();
		
		
					
			
		while ( a>b ){
			
			
			System.out.println("El numero A es menor que el B, vuelva a intentarlo \n");
			
			
			System.out.println("Introduzca cual es el primer numero");
			a=teclado.nextInt();
			
			
			System.out.println("Introduzca cual es el segundo numero");
			b=teclado.nextInt();
			
				
			
		}
		
		for (int i=a; i<b+1; i++ ){	
		
			System.out.println(i);
	
}
		
		

}

}
	



