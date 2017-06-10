package actividad_713;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Actividad_713 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFileChooser ficheroIn = new JFileChooser(".");
		ficheroIn.showOpenDialog(null);
		
		
		
		try (BufferedReader leer = new BufferedReader(new FileReader(ficheroIn.getSelectedFile()))){
			
			int num;
			int suma = 0;
			double media;
			int contadornum = 0;
			
			String numText="";
			
			while ((numText=leer.readLine()) != null){
				
				num=Integer.parseInt(numText);
				suma=num+num;
				contadornum++;
			}
			
	
			media=suma/contadornum;
			System.out.println("La media de los valores que estan presentes en el documento es de " + media);
			System.out.println("El documento tienes un total de "+ contadornum + " numeros");
				
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
	}

}
