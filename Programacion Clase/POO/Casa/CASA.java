package Casa;

public class CASA {

	private String direccion;
	private double altura;
	private String nombreDueño;
	
	
	// METODOS GET Y SET
	
	public String getDireccion() {
		return direccion;
	}
	
	
	public void setAltura(double altura) {
		
		if (altura>=3 && altura<=100)
		this.altura = altura;
		
		else
			System.out.println("ERROR!, La altura de la casa debe estar comprendida entre 3 y 100 metros (Ambos inclusive)");
	} 

	
	
	//CONSTRUCTORES
	
	
	public CASA (String direccion, double altura, String nombreDueño){
		
		if (altura>=3 && altura<=100){
			this.altura = altura;}
		
		else{
			System.out.println("ERROR!, La altura de la casa debe estar comprendida entre 3 y 100 metros (Ambos inclusive)");}
		
		
		this.direccion=direccion;
		this.nombreDueño=nombreDueño;
		
	
	}
	
	
	public CASA (){
		
		//this());
		this.altura=10;
		this.direccion="Mayor número 7";
		this.nombreDueño="Mariano";
		
	}
	

	public CASA (String direccion , String nombreDueño){
		
		this.direccion=direccion;
		this.nombreDueño=nombreDueño;
		this.altura=5;
		
		
	}


	
	public String toString() {
		return "La casa situada en " + direccion + ", tiene una altura de " + altura + " metros y su dueño es " + nombreDueño;
	}
	
	
	
	
	
	
}


