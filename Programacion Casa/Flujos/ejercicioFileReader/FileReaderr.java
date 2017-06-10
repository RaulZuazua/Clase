package ejercicioFileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class FileReaderr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFileChooser archivo=new JFileChooser(".");
		archivo.showOpenDialog(null);
		
		
		
		try {
			
			FileReader leer=new FileReader(archivo.getSelectedFile());
			
			String texto="";
			int iterador=leer.read();
			
			while(iterador!=-1){
				
				texto=texto+(char)iterador;
				iterador=leer.read();
				
			}
			
			System.out.println(texto);
			leer.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println("El archivo no fue encontrado " + e);;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error referente a la entrada o salida de datos " + e);
		}
	

}
	
	
	
}
