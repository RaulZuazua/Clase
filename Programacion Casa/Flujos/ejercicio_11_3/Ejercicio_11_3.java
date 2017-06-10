package ejercicio_11_3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio_11_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce un numero para añadir al Archivo");
		num=teclado.nextInt();
		
		
		
		
		try (ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("datos.dat"))){
			
			while(!(num<0)){
				
				out.writeInt(num);
				System.out.println("Introduce un numero para añadir al Archivo");
				num=teclado.nextInt();
			}
			
			teclado.close();	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		try (ObjectInputStream in =new ObjectInputStream(new FileInputStream("datos.dat"))){
			
			try{
			
			while(true){
				
				System.out.println(in.readInt());
				
			}
			
			}catch (EOFException e) {
				e.getMessage();
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
