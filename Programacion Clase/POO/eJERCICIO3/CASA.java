package eJERCICIO3;

public class CASA {

	private String nombre;
	private String Zona;
	private String direccion;
	private double superficie;
	private double precio;
	
	
	public CASA (){
		
		this.nombre="";
		this.Zona="";
		this.direccion="";
		this.superficie=0.0;
		this.precio=0.0;
		
	}
	
	
	public CASA (String nombre, String Zona, String direccion, double superficie, double precio){
		
		this.nombre=nombre;
		this.Zona=Zona;
		this.direccion=direccion;
		this.superficie=superficie;
		this.precio=precio;
		
		
	}
	
	
	
	public void calcularPrecio (double preciometrocuadrado){
		
		this.precio=preciometrocuadrado*this.superficie;
		
		
	}
	
	
	public double precioVenta(){
		
		double precioventa;
		
		if (this.superficie>=35 && this.superficie<=80){
			
			precioventa=(this.precio*0.2)-this.precio;
			
		}
		
		else if ( this.superficie>=81 && this.superficie<=100)
		
			precioventa=(this.precio*0.5)-this.precio;
			
		return precio;
		
		
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getZona() {
		return Zona;
	}


	public void setZona(String zona) {
		Zona = zona;
	}


	public double getSuperficie() {
		return superficie;
	}


	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	
	public String toString() {
		return "LA CASA CON NOMBRE " + nombre + ", SITUADA EN LA ZONA" + Zona + ", TIENE UNA SUPERFICIE " + superficie + ", Y UN PRECIO DE " + precio + "€";
	}
	
	
	
	
	
	
	
	
	
}
