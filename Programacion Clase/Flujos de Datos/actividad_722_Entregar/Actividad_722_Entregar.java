package actividad_722_Entregar;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Actividad_722_Entregar {
	
	//METODO BURBUJA
	
	
	public static void burbuja(int [] A){
        int i, j, aux;
        for(i=0;i<A.length-1;i++)
             for(j=0;j<A.length-i-1;j++)
                  if(A[j+1]<A[j]){
                     aux=A[j+1];
                     A[j+1]=A[j];
                     A[j]=aux;
                  }
	}
	

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char respuesta;
		
		int contador = 0;
		int[] enteros = new int[20];

		
			//ABRIMOS EL ARCHIVO
		
		
		JFileChooser ficheroIn = new JFileChooser(".");
		ficheroIn.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result=ficheroIn.showOpenDialog(null);
		
		
		if(result==JFileChooser.APPROVE_OPTION){
		
		
		
			// LEEMOS EL ARCHIVO ARCHIVO.DAT
		
		
		try (DataInputStream dataIn = new DataInputStream(new FileInputStream(ficheroIn.getSelectedFile()))) {

			while (true && contador <= 19) {

				enteros[contador] = dataIn.readInt();	//CARGAMOS EL ARRAY
				contador++;
			}

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
		System.out.println("Contenido del archivo por defecto: \n" );
		
		
		for (int i = 0; i < enteros.length; i++) {

			System.out.print(enteros[i] + " ");	 //LEEMOS EL CONTENIDO DEL ARRAY
		
		}
		
		System.out.println("\n");
		
		
		// ORDENAMOS EL ARRAY
		
		
		burbuja(enteros);
		//Arrays.sort(enteros); // cambiar por el metodo correspondiente
		
		
		
		
		
		// GUARDAMOS EL ARRAY ORDENADO COMO ENTEROS
		
		System.out.println("¿Desea guardar los datos ordenados del Array en un nuevo archivo? s/n");
		respuesta=teclado.next().charAt(0);
		
		if (respuesta=='s' || respuesta == 'S'){
		
			
			//CREAMOS EL ARCHIVO
			
		JFileChooser nuevofichero1=new JFileChooser(".");
		ficheroIn.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result1=nuevofichero1.showSaveDialog(null);
		
		if(result1==JFileChooser.APPROVE_OPTION){
			
		File Datos1 = new File(nuevofichero1.getSelectedFile() +".dat");
		
		
			// ESCRIBIMOS Y GUARDAMOS
		
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(nuevofichero1.getSelectedFile()))) {
			
			//contador = 0;
			for (int o = 0; o < enteros.length; o++) {  // RECORREMOS EL ARRAY

				out.writeInt(enteros[o]); //VOLCAMOS EL CONTENIDO DEL ARRAY AL ARCHIVO BINARIO

			}

			

		} catch (IOException e) {
			
			e.printStackTrace();
		}

		
		System.out.println("\nContenido del archivo una vez Ordenado : \n");
		
		for (int u = 0; u < enteros.length; u++) {		// RECORREMOS EL ARRAY

			System.out.print(enteros[u] + " ");	//LEEMOS EL ARRAY ODERNADO

		}

			System.out.println("\n");
			System.out.println("Archivo Guardado Correctamente\n");
		}
		
		else // SI NO QUEREMOS IMPRIMIR EL ARCHIVO PASAMOS A PREGUNTAR POR EL SIGUIENTE
			
			System.out.println("Archivo NO guardado \n"); 
		
		
		}
		
		else 
			System.out.println("ACCION CANCELADA CON EXITO \n");
		
		
		
			
		// GUARDA EL ARRAY COMO OBJETO
		
		System.out.println("\n¿Desea guardar el como objeto Array en un nuevo archivo? s/n \n");
		respuesta=teclado.next().charAt(0);
		
		if (respuesta=='s' || respuesta == 'S'){
		
			
			//CREAMOS EL ARCHIVO
			
		JFileChooser nuevofichero2=new JFileChooser(".");
		ficheroIn.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result2=nuevofichero2.showSaveDialog(null);
		
		if(result2==JFileChooser.APPROVE_OPTION){
		
		File Datos2 = new File(nuevofichero2.getSelectedFile() +".dat");
		
		
			//ESCRIBIMOS Y GUARDAMOS
		
		try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(nuevofichero2.getSelectedFile()))){
			
			obj.writeObject(enteros);
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
			// ABRIMOS EL ARCHIVO
		
		JFileChooser fichero=new JFileChooser(".");
		fichero.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int result3=nuevofichero2.showOpenDialog(null);
		
		
		if(result2==JFileChooser.APPROVE_OPTION){
		
		
			// LEEMOS
		
		try (ObjectInputStream obj = new ObjectInputStream(new FileInputStream(nuevofichero2.getSelectedFile()))){
			
			
			System.out.println("Array Guardado en archivo binario como objeto es: \n");
			
			int tablaResultado[]=(int[])obj.readObject();  // CREAMOS UN ARRAY DE ENTEROS EN EL CUAL GUARDAMOS EL OBJETO QUE LEEMOS, 
															//DICIENDOLE QUE ES IN ARRAY DE ENTEROS CON EL CAST CORRESPONDIENTE
			
			System.out.println(Arrays.toString(tablaResultado));   // A LA HORA DE IMPRIMIR PASAMOS EL ARRAY A ENTEROS PARA QUE NOS DEVUELVA LOS VALORES  
																	//Y NO LA DIRECCION DE MEMORIA DEL ARRAY
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		

	
}
		
		else
			System.out.println("Archivo NO guardado" + "\nFin del programa");  // SI NO QUEREMOS GUARDAR EL ARCHIVO FIN DEL PROGRAMA 
		
	}
		else
			System.out.println("Accion cancelada con exito, archivo NO Guardado \n" + "FIN DEL PROGRAMA"); // SI NO GUARDO EL ARCHIV NO LO PUEDO LEER
		
}
		
		else 
			System.out.println("Accion cancelada con exito, Archivo NO leido \n" + "FIN DEL PROGRAMA");	//SI CANCELAMOS A LA HORA DE GUARDAR EL ARRAY
		
	}
		
	
		else
			System.out.println("Si no abre el archivo fuente el programa no puede continuar\n" + "FIN DEL PROGRAMA"); // SI NO ABRIMOS EL ARCHIVO FUENTE
		
		}
		
		
	
}
	
