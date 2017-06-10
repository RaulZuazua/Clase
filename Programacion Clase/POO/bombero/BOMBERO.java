package bombero;

public class BOMBERO {

	//ATRIBUTOS DE LA CLASE
	
	
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean casado;
	private boolean especialista;
	
	 
	
	// CONSTRUCTOR POR DEFECTO
	
	public BOMBERO (){
		
	this.nombre="";
	this.apellidos="";
	this.edad=0;
	this.casado=false;
	this.especialista=false;
		
		
		
	}

	// GETTERS AND SETTERS

	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellidos() {
		return apellidos;
	}



	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public boolean isCasado() {
		return casado;
	}



	public void setCasado(boolean casado) {
		this.casado = casado;
	}



	public boolean isEspecialista() {
		return especialista;
	}



	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}



	//METODO TO STRING
	
	public String toString() {
		return "El bombero con nombre " + nombre + " y apellidos " + apellidos + ", tiene una edad de " + edad + ", ¿esta casado? " + casado
				+ "  ¿Es especialista especialista? " + especialista;
	}

 // METODO EQUALS GENERADO CON ECLIPSE
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BOMBERO other = (BOMBERO) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	// metodo para comparar la edad
	
	public boolean mayorEdad(BOMBERO b){
		
		if(edad>b.edad)
			return true;
		else
			return false;
		
		
	}
	
	
	
	// METODO EQUALS CON CADENAS DE TEXTO
	
	public boolean equals (BOMBERO b){
		
		boolean igual=false;
		
		
		String cadena1=nombre.concat(apellidos);
		String cadena2=b.nombre.concat(apellidos);
		
		if(cadena1.equalsIgnoreCase(cadena2))
			igual=true;
		return igual;
		
	}
	
	
	
	
	
	
}
