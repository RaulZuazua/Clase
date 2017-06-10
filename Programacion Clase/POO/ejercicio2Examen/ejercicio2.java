package ejercicio2Examen;

import java.util.Scanner;

public class ejercicio2 {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String [] vector = new String [3];
		
		String contraPuesta;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Elige cual va a ser tu contraseña");
		contraPuesta=teclado.nextLine();
		
		
		
		String contraseña;
		System.out.println("Por favor inserta tu contraseña");
		contraseña=teclado.nextLine();
		
		
		int contador=0;
		//String correcto ="si";
		boolean correcto=true;
		
		while(contador<2){
			
			
		
		if (contraPuesta.equalsIgnoreCase(contraseña)){
			
			System.out.println("CONTRASEÑA CORRECTA");
			break;
		
		}
			
		
		if (!(contraPuesta.equalsIgnoreCase(contraseña))){
			
			System.out.println("Contraeña incorrecta intentelo de nuevo");
			correcto=false;
			contraseña=teclado.nextLine();
			vector[contador]=contraseña;
			contador++;
		}
			
			
		
		
		}
		
		
		if (correcto=true)
			System.out.println("Ha llegado al numero maximo de intentos, gracias");
			
		
		
		
	}

	
	
	
	
}
