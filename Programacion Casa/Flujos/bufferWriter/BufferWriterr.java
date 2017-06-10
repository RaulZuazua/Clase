package bufferWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class BufferWriterr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		JFileChooser archivo=new JFileChooser(".");
		archivo.showOpenDialog(null);
		
		
		
		try (BufferedWriter escritura=new BufferedWriter(new FileWriter(archivo.getSelectedFile(), true));){
			
			
			String texto="hola como estas";
			escritura.write(texto);
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		
	}

}
