package agenda;

public class Contacto {

	private String nombre;
	private String numtelefono;

	Contacto(String nombre, String numtelefono) {

		this.nombre = nombre;
		this.numtelefono = numtelefono;

	}

	
	// GETTERS SETTERS
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumtelefono() {
		return numtelefono;
	}

	public void setNumtelefono(String numtelefono) {
		this.numtelefono = numtelefono;
	}

	
	// TO STRING
	
	@Override
	public String toString() {
		return "Contacto: nombre = " + nombre + ", numtelefono = " + numtelefono + "]";
	}


}
