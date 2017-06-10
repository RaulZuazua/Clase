package demo;

public class PROFESOR {

	
	private String nombre;
	private String apellido;
	private Tipo tipo;
	int horas;
	
	
	
	public PROFESOR (String nombre, String apellido, Tipo tipo, int horas){
		
		this.nombre=nombre;
		this.apellido=apellido;
		this.tipo=tipo;
		this.horas=horas;
		
		
	}
	
	
	
	public String   devuelveNombre (){
		
		return this.nombre.concat(this.apellido);
	
		
		
	}
	
	
	
	
	public double sueldoBruto (){
		
		int sueldobruto;
		if(this.tipo==tipo.PRIMARIA){
			
			sueldobruto=this.horas*20;
			return sueldobruto;
		}
		
		else
		sueldobruto=15*this.horas;
			
		return sueldobruto;
		
		
	}
	
	
	
	public double descuento (){
		
		double descuento;
		
		descuento= sueldoBruto()*0.10;
		return descuento;
		
		
	}
	
	
	public double sueldoNeto(){
		
		double sueldoNeto;
		
		sueldoNeto= sueldoBruto()-descuento();
		return sueldoNeto;
	}


	
	
	
	
	
	
	
	

	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	public int getHoras() {
		return horas;
	}



	public void setHoras(int horas) {
		this.horas = horas;
	}



	public String getNombre() {
		return nombre;
	}



	public String getApellido() {
		return apellido;
	}



	
	public String toString() {
		return "EL PROFESOR CON " + nombre + "  APELLIDO" + apellido + " , TIENE UN TIPO " + tipo + ", CON UN NUMERO DE HORAS " + horas;
	}






	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PROFESOR other = (PROFESOR) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (horas != other.horas)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
}
