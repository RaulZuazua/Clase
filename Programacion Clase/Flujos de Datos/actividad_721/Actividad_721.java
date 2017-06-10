package actividad_721;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import javax.swing.JFileChooser;



public class Actividad_721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado= new Scanner (System.in);
		int num;
		int valor_leido = 0;
		int contadorAlum =0;
		int edadMin=Integer.MAX_VALUE;
		int edadMax=Integer.MIN_VALUE;
		int menores_de_edad = 0;
		
		
		
		JFileChooser ficheroOut = new JFileChooser(".");
		ficheroOut.showSaveDialog(null);
		File archivo= new File(ficheroOut.getSelectedFile()+".dat");
		
		
		
		try (ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(ficheroOut.getSelectedFile()))){
			
			
			System.out.println("Introduce un numero para guardar en el archivo " + ficheroOut.getName());
			num=teclado.nextInt();
			
			
			while (!(num<0)){
				
				out.write(num);
				
				System.out.println("Introduce un numero para guardar en el archivo ");
				num=teclado.nextInt();
				
				
			}
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		JFileChooser ficheroIn= new JFileChooser(".");
		ficheroIn.showOpenDialog(null);
		
		
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ficheroIn.getSelectedFile()))){
			
			
			try {
				
				
				while(true){
					
					valor_leido=in.readInt();
					contadorAlum++;
					
					
					if ( edadMin<edadMin) //edad minima
						edadMin=valor_leido;
					
					
					if( edadMax>edadMax) // edad maxima
						edadMax=valor_leido;
					
					if (valor_leido<18)
						menores_de_edad++;
					
					
					System.out.println("El alumno " + contadorAlum + " tiene una edad de " + valor_leido + "\n");
					
					
				}
				
				
								
				
			} catch (EOFException e) {
				// TODO: handle exception
			}
			
			System.out.println("La edad minima es de: " + edadMin );
			System.out.println("La edad maxima es de: " + edadMax );
			System.out.println("La cantantida de menores de edad: " + menores_de_edad);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
