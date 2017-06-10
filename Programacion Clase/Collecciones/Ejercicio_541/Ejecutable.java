package Ejercicio_541;

import java.util.LinkedList;
import java.util.Scanner;


public class Ejecutable {

	
	static LinkedList <Animal> colaVeterinaria= new LinkedList <Animal>();
	
	public static void menu() {

		int opcion;
		Scanner teclado = new Scanner(System.in);

		System.out.println("1 . Insertar nuevo paciente ORDINARIO \n " + "2 . Insertar nuevo paciente URGENTE \n"
				+ "3 . Mostrar la cola de espera \n " + "4 . Pasar un paciente a consulta \n"
				+ "5 . Borrar un animal por su indice \n" + "6 . Borrar todos \n " + "7 . Salir \n");

		System.out.println(" \n Elija la operacion que desee");

		opcion = teclado.nextInt();
		
		
		while (opcion>=1 || opcion<=7 ){

		switch (opcion) {

		case 1:
			break;

		case 2:
			break;

		case 3:
			break;

		case 4:
			break;

		case 5:
			break;

		case 6:
			break;

		case 7:
			System.out.println("Finalizando programa . . . \n Programa finalizado \n");
			break;

		} // fin swicth
		
		
		} // fin while
		
		System.out.println("Recuerde la opcion seleccionada debe estar entre 1 y 7");
		
		
		
		
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
