package COMPILACIONES;

public class Pajaro {

	
		// ********ATRIBUTOS****
		private char color;
		private int edad;
		//*****METODOS*********
		
		
		public char getColor() {
		return color;
		}
		public void setColor(char color) {
		this.color = color;
		}
		public int getEdad() {
		return edad;
		}
		
		
		public void setEdad(int edad) {
			this.edad = edad;
			}
			public void printedad()
			{
			System.out.println(edad);
			}
			public void printcolor()
			{
			switch (color)
			{
			case 'v':System.out.println("verde");
			break;
			case 'a':System.out.println("amarillo");
			break;
			case 'g':System.out.println("gris");
			break;
			case 'n':System.out.println("negro");
			break;
			case 'b':System.out.println("blanco");
			break;
			default: System.out.println("color no establecido");
			}
	
	
	
	
	
}
	}

