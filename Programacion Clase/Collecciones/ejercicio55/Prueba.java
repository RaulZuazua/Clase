
package ejercicio55;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno Alvaro = new Alumno("71622124O", "ALVARO", "PUMARIN, OVIEDO", "Matematicas", 7);

		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		char continuar;

		
		
		do {

				
			System.out.println("----------------- Menu --------------\n \n" 
					+ "1 - Añadir asignatura y su nota\n"
					+ "2 - Eliminar una asignatura y su nota\n"
					+ "3 - Comprobar que una asignatura ya esta en la lista de notas del alumno \n"
					+ "4 - Obtener el valor numerico de una asignatura\n"
					+ "5 - Calcular el numero de asignaturas que estan asociadas al alumno\n"
					+ "6 - Borrar todas las asignaturas del alumno\n" + "7 - Mostrar todas las asignaturas del alumno\n"
					+ "8 - Calcular la nota media de todas las asignaturas\n" + "9 - Salir del programa \n");

			
			
			try {	
				
			System.out.println("\n Introduce la opcion deseada ( 1 - 9 ) \n ");
			opcion = teclado.nextInt();
		
			} catch(Exception e) {
				
				System.out.println("Error, el valor introducido no es valido\n");
				System.out.println("¿Desea volver a intentarlo?");
				teclado.next();
				continuar=teclado.next().charAt(0);
				
				if (continuar=='s' || continuar=='S'){
				System.out.println("\n Introduce la opcion deseada ( 1 - 9 ) \n ");
				teclado.nextLine();
				opcion = teclado.nextInt();
				}
				
				else 
					opcion=9;
			}
			

			switch (opcion) {

			case 1:
				Alvaro.añadir_nota();
				break;

			case 2:
				Alvaro.eliminar_asignatura();
				break;

			case 3:
				Alvaro.comprobar_existencia();
				break;

			case 4:
				Alvaro.notaAsignatura();
				break;

			case 5:
				Alvaro.NumeroAsignaturasAlumno();
				break;

			case 6:
				Alvaro.eliminarTodas();
				break;

			case 7:
				Alvaro.mostrar_asignaturas();
				break;

			case 8:
				Alvaro.calcularMedia();
				break;

			case 9: System.out.println("\n \n Saliendo del programa . . .  \n"+
					"\n Programa finalizado \n ");
				break;
			
			}	
		
		
		}	while (opcion>=1 && opcion <=8);
		
		
		if ((opcion <1) || (opcion >9)){ 
			System.out.println(" \n ERROR!, El valor debe estar comprendido entre 1 y 9 \n ");
			opcion=1;
		}
		
		
		
		
	}
				
}
