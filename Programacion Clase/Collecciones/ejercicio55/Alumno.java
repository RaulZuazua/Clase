package ejercicio55;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Alumno extends Persona {

	String asignatura;
	Integer nota;
	HashMap<String, Integer> notas = new HashMap<String, Integer>();

	Alumno(String dni, String nombre, String direccion, String asignatura, int nota) {

		super(dni, nombre, direccion);
		this.asignatura = asignatura;
		this.nota = nota;
		notas.put(asignatura, nota);
	}

	public void añadir_nota() { // OK

		String asignatura;
		int nota;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre de la asignatura \n");
		asignatura = teclado.nextLine();

		System.out.println("Introduce la nota para la asignatura " + asignatura);
		nota = teclado.nextInt();

		notas.put(asignatura, nota);
		System.out.println("\n Nota introducida con exito \n");

	}

	public void eliminar_asignatura() { // OK

		String clave;
		Scanner teclado = new Scanner(System.in);
		System.out.println("\n ---------- Mostrando Asignaruas ---------- \n");
		
		Iterator it = notas.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey());
		}

		System.out.println("\n Elija la clave perteneciente a la asignatura y nota que desea borrar\n ");
		clave = teclado.nextLine();

		notas.remove(clave);

	}

	public void comprobar_existencia() { // ERRORES

		String valor;
		Scanner teclado = new Scanner(System.in);

		System.out.println("\n Introduce la asignatura a comprobar su existencia \n");
		valor = teclado.nextLine();

		if (notas.containsKey(valor) == true) {

			System.out.println("\n La asignatura " + valor + " ya existe \n");

		}

		else
			System.out.println("\n La asignatura " + valor + " no existe \n");

	}

	public void mostrar_asignaturas() { // OK

		Iterator it = notas.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println(e.getKey());
		}
		
		if (notas.size()==0)
			System.out.println("No existe ninguna asignatura");
		// System.out.println(notas.values());
	}

	public void eliminarTodas() { // OK

		notas.clear();

	}

	public void NumeroAsignaturasAlumno() { // OK

		System.out.println("\nEl alumno tiene la cantida de: " + notas.size() + " Asignaturas \n");
	}

	public  void notaAsignatura() { // OK

		String clave;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la asignatura de la cual quieres saber la nota");
		clave = teclado.nextLine();

		System.out.println("\nLa nota en " + clave + "es de " + notas.get(clave) + "\n");

	}

	public  void calcularMedia() {

		double SUMA = 0;
		double media;
		for (Integer A : notas.values()) {

			SUMA = SUMA + A;

		}

		media = SUMA / notas.size();
		System.out.println("\n La media de las notas del alumno es de " + media + "\n");

	}

}
