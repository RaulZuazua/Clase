package persona;

public class PERSONA {

	
	private String nombre;
	private String apellido;
	private String telefono;
	
	
	
	public String telefonoControl(String telefono){
		
		if (telefono.length()==9){
			this.telefono=telefono;
			
			return telefono;}
		
		else
		
		System.out.println("ERROR, el telefono debe de contener 9 digitos \n");
		
			return telefono="";
		
	}



	public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public String getTelefono() {
		return telefono;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public void setTelefono(String telefono) {
		
		if (telefono.length()==9){
			this.telefono=telefono;}
			
			
		
		else
		
		System.out.println("ERROR, el telefono de "+ getNombre() + " debe de contener 9 digitos \n");
		
			
		
	}



	@Override
	public String toString() {
		return "PERSONA : " + nombre + ", APELLIDO : " + apellido + ",TELEFONO : " + telefono+ "\n";
	}
	
	
	
	
	
	
	
}
