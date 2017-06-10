package actividad_712;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Actividad_712 {

	public static void main(String[] args) {
		
		
		JFileChooser ficheroIn= new JFileChooser(".");
		ficheroIn.showOpenDialog(null);
		
		
		try (BufferedReader leer= new BufferedReader(new FileReader(ficheroIn.getSelectedFile()))){
			
			int Iterador;
			String texto="";
			
			
			while ((Iterador=leer.read())!=-1){
				
				texto=texto+(char)Iterador;
				
			}
			
			System.out.println(texto);
			
			
			JFileChooser ficheroOut= new JFileChooser(".");
			ficheroOut.showSaveDialog(null);
			File nuevoArchivo = new File (ficheroOut.getSelectedFile()+".txt");
			
			BufferedWriter escribir= new BufferedWriter(new FileWriter(nuevoArchivo));
			escribir.write(texto);
			escribir.close();
			
			System.out.println(texto);
			
			
		} catch (IOException e) {
			e.getMessage();
			
		}
		
		
		
		
		
		
	}
	
	
}
