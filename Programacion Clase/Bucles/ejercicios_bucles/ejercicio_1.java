package ejercicios_bucles;

import java.util.Random;
import java.util.Scanner;

public class ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Escribe un programa en el que tenemos que acertar un número entre 1 y 10.
		Si no acertamos, nos vuelve a preguntar otro número. Si acertamos, nos felicita
		por nuestra hazaña. El número que hay que acertar será constante (hasta que aprendamos 
		a usar los números aleatorios). */
		
		
		Random aleatorio=new Random();
		int ale=aleatorio.nextInt(10)+1;
		
		System.out.println("Introduce un numero");
		Scanner teclado=new Scanner(System.in);
		int numero_introducido=teclado.nextInt();
		
		
		while (ale!=numero_introducido){
			System.out.println("Has fallado!");
			System.out.println("Introduce un numero");
			numero_introducido=teclado.nextInt();
			
		}
		
		System.out.println("Felicidades, has acertado el numero!");
		

	}

}
