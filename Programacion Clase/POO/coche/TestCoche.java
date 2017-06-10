package coche;

public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//COCHE ALAMBRITO

		Coche alanBrito=new Coche("Seat", "Panda", "Rojo");
		alanBrito.setEsMetalizado(true);
		String informacion=alanBrito.toString();
		System.out.println(informacion + "\n");
	
		
		
		//COCHE PEPE (AÑADIENDO ATRIBUTOS DESPUES)
		
		Coche pepe=new Coche("Ford", "Mondeo", "Granate");
		pepe.setEsMetalizado(true);
		pepe.setMatricula("9999BZP");
		pepe.setTipo("Berlina");
		pepe.setSeguro("no");
		pepe.setAnnoDeFabricacion(2002);
		
		System.out.println(pepe.toString()+ "\n");
		
		
		
		//COCHE JUAN (2º CONTRUCTOR)
		
		Coche Juan=new Coche("Seat","Toledo","Gris",true,"8989BCK","Berlina",2000,"no");
		System.out.println(Juan.toString());
		
		
		
		
	}

}
