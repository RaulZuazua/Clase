package Arrays;

import java.util.Scanner;

public class Ejercicio_605 {

	
	public static int dni (){
		
		Integer dni = null;
		
		try{
			
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero de DNI");	
		dni=teclado.nextInt();
		System.out.println("El DNI es correcto \n");
		System.out.println("Calculando letra . . . .\n");

		
		} //FINAL TRY
		
		catch (Exception e){
			
			System.out.println("El dni debe contener como maximo 9 digitos");
			return 0;
			
			
		}	//FINAL CATCH
		
	
		return dni ;
		
	} //FINAL METODO
	
	
	
	public static void calcularLetra (int dni){
		
		int cociente;
		int valor_Array;
		char  [] ArrayDni={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		char letra;
		
		if((!(dni==0))){
		cociente=(dni/23)*23;
		valor_Array=dni-cociente;
		letra=ArrayDni[valor_Array];
		System.out.println("La letra del DNI introducido es la " + letra);}	
		
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dni;
		dni=dni();
		calcularLetra (dni);
		
		
	}

}
