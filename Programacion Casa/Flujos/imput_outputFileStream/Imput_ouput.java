package imput_outputFileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class Imput_ouput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		ArrayList<Integer> enteros = new ArrayList<Integer>(); // creo un arrayList donde almacenar numeros enteros
		
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero entero para añadir a la listo y negativo para salir");
		num=teclado.nextInt();
		
		
		while(!(num<0)){ //mientras el numero sea positivom añado el numero al ArrayList, si es negativo salgo del bucle
			
			enteros.add(num);
			System.out.println("Introduce un numero entero para añadir a la listo y negativo para salir");
			num=teclado.nextInt();
			
		}
		
		
		
	
		
		
		try (ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream("datos.dat"))){
			
			
			salida.writeObject(enteros);	
			System.out.println("Archivo Guardado Correctamente");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		JFileChooser ficheroIn=new JFileChooser(".");
		ficheroIn.showOpenDialog(null);
		
		
		
		
		try (ObjectInputStream salida=new ObjectInputStream(new FileInputStream(ficheroIn.getSelectedFile()))){
			
			
			System.out.println("Imprimiendo Archivo"+ "\n" +salida.readObject());
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	
		

}
