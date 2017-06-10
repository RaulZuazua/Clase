package ordenador;

public class ORDENADOR {

	private String marca_pc;
	private int velocidad_pc=3000;
	private static int contador=0;
	
	
	public ORDENADOR (String marca_pc){
		
		this.marca_pc=marca_pc;
		contador++;
		
	}
	
	
	public ORDENADOR (String marca_pc, int velocidad_pc){
		
		this.marca_pc=marca_pc;
		this.velocidad_pc=velocidad_pc;
		contador++;
		
		
	}


	
	public String toString() {
		return "El ordenador de la marca " + marca_pc + ", tiene una velocidad de procesamiento de " + velocidad_pc + " MHz";
	}


	public String getMarca_pc() {
		return marca_pc;
	}


	public void setMarca_pc(String marca_pc) {
		this.marca_pc = marca_pc;
	}


	public int getVelocidad_pc() {
		return velocidad_pc;
	}


	public void setVelocidad_pc(int velocidad_pc) {
		this.velocidad_pc = velocidad_pc;
	}


	public static int getContador() {
		return contador;
	}


	public static void setContador(int contador) {
		ORDENADOR.contador = contador;
	}




	public boolean equals(Object obj) {
		
		ORDENADOR other = (ORDENADOR) obj;
		if (marca_pc == null) {
			if (other.marca_pc != null)
				return false;
		} else if (!marca_pc.equals(other.marca_pc))
			return false;
		if (velocidad_pc != other.velocidad_pc)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
}
