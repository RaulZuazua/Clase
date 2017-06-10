package actividad_711;

import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Actividad_711 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFileChooser fichero = new JFileChooser("." );
		//fichero.setFileSelectionMode(JFileChooser.FILES_ONLY);
		//fichero.setCurrentDirectory(new File("."));
		fichero.showOpenDialog(null);
		
		try  (FileReader leer= new FileReader(fichero.getSelectedFile())){
			
			String texto="";			
			int iterador;
			
			
			while ((iterador = leer.read()) != -1){
				
				texto=texto+(char)iterador;
				
			}
			
			
			System.out.print(texto.toUpperCase().replaceAll(" ", "_"));
			
		} catch (IOException e) {
			System.out.println("Error de entrada/ salida de datos");
		}
		
	
		
		
		
		
		
	}

}
