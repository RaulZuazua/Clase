package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	static ArrayList<Contacto> Agenda = new ArrayList<Contacto>();

	// MENU

	public static void menu() {

		Scanner teclado = new Scanner(System.in);
		int opcion;

		System.out.println("---------- AGENDA ---------- \n \n" + "1 . Insertar nuevo contacto \n"
				+ "2 . Mostrar lista completa \n" + "3 . Borrar un Contacto por su indice \n"
				+ "4 . Borrar un contacto por su nombre \n" + "5 . Borrar todos los contactos \n"
				+ "6 . Salir del programa");

		System.out.println(" \n Elija la opcion que desee");
		opcion = teclado.nextInt();

		switch (opcion) {

		case 1:
			insertarContacto();
			break;

		case 2:
			MostrarTodos();

			break;

		case 3:
			BorrarContactoIndice();
			break;

		case 4:borrarContactoNombre();
			break;

		case 5:
			borrarTodos();
			break;

		case 6:
			System.out.println(" \n Finalizando el programa . . . " + " \n Programa Finalizado \n");
			break;

		}

	}

	// INSERTAR CONTACTO

	public static void insertarContacto() {

		Scanner teclado = new Scanner(System.in);
		String nombre, numero;
		char continuar;

		System.out.println("Introduce el nombre del contacto");
		nombre = teclado.nextLine();
		System.out.println("Introduce el numero de telefono del contacto " + nombre);
		numero = teclado.nextLine();
		boolean seguir = true;

		while (seguir == true) {

			Contacto id = new Contacto(nombre, numero);

			Agenda.add(id);

			System.out.println("¿Desa introducir otro contacto?");
			continuar = teclado.next().charAt(0);

			if (continuar == 's' || continuar == 'S') {

				System.out.println("Introduce el nombre del contacto");
				nombre = teclado.nextLine();
				System.out.println("Introduce el numero de telefono del contacto " + nombre);
				numero = teclado.nextLine();

			}

			else {

				System.out.println("Volviendo al Menu . . . . ");
				menu();
				break;

			}

		}

	}

	// BORRAR CONTACTO POR NOMBRE

	public static void borrarContactoNombre() {

		char borrar;
		String nombre;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" \n Introduce el nombre del contacto que deseas borrar \n ");
		nombre = teclado.nextLine();

		for (int i = 0; i < Agenda.size(); i++) {

			if (Agenda.get(i).getNombre().equalsIgnoreCase(nombre)) {

				System.out.println(" \n El contacto " + nombre + " se encuentra en la posicion " + i
						+ " del ArrayList y esta es su informacion \n" + "Nombre : " + Agenda.get(i).getNombre()
						+ "Numero : " + Agenda.get(i).getNumtelefono()+ " \n ");

				System.out.println("¿Desea borrarlo? ( s/n )");
				borrar = teclado.next().charAt(0);

				if (borrar == 's' || borrar == 'S') {

					System.out.println(" \n Borrando contacto . . . \n ");
					Agenda.remove(i);
					System.out.println(" \n Contacto Borrado \n ");
					menu();

				}

			}

			else {

				System.out.println(" \n Vaya! " + nombre + " parace que no esta en tu agenda \n");
				menu();
				break;

			}

		}

	}

	// BORRAR CONTACTOS INDICANDO SU INDICE EN EL ARRAY

	public static void BorrarContactoIndice() {

		int indice;
		Scanner teclado = new Scanner(System.in);
		System.out.println(" \n Introduce el indice para el contacto que quiere borrar \n ");
		indice = teclado.nextInt();

		System.out.println(" \n Borrando contacto " + Agenda.get(indice)+ "\n");
		Agenda.remove(indice);
		System.out.println("Contacto Borrado \n");

	}

	// MOSTRAR TODOS LOS CONTACTOS DEL ARRAYLIST

	public static void MostrarTodos() {

		if (Agenda.size() == 0) {

			System.out.println(" \n La agenda esta vacia, disculpe las molestias \n");
			menu();
		}

		System.out.println(Agenda);
		menu();
	}

	// BORRAR TODOS LOS CONTACTOS DEL ARRAYLIST

	public static void borrarTodos() {

		Scanner teclado = new Scanner(System.in);
		char seguro;

		System.out.println(" \n ¿Esta seguro que desea borrar la Agenda completa? ( s/n ) \n "  );
		seguro = teclado.next().charAt(0);

		if (seguro == 's' || seguro == 'S') {

			Agenda.clear();
			System.out.println(" \n Borrando Agenda . . . " + " \n Agenda borrada \n");
			menu();
		}

		else {

			System.out.println(" \n Operacion de borrado abortada . . ." + " \n Volviendo al Menu \n");
			menu();

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		menu();

	}

}
