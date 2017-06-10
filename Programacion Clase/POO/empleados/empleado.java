package empleados;

public class empleado {

	private String nombre;
	private String apellido;
	private int edad;
	private double salario;
	
	public empleado (String nombre, String apellido, int edad, double salario){
	
	
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.salario=salario;
				
	}
	
	
	public empleado(){
		
		nombre="";
		apellido="";
		edad=0;
		salario=0.0;		
		
	}


	public void Suma(int plus){
		
		if((edad>40) && (!(nombre.isEmpty()==true))){
			
			salario=salario+plus;
		}
		
	}
	
	
	private boolean comprueba(){
		
		if (!nombre.equals(null))
			return true;
		else return false;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSalario() {
		return salario;
	}


	@Override
	public String toString() {
		return "El empleado con nombre" + nombre  + apellido + " y edad " + edad + " tiene un salario de" + salario
				+ "]";
	}
	
	
	
		
	}
	
	
	
	
	
	
	
	
	

