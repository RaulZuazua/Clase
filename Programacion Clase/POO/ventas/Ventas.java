package ventas;

public class Ventas {

	private String tipo_articulo;
	private int cantidad;
	
	
	public Ventas(){
		
		tipo_articulo="";
		cantidad=0;
		
	}
	
	
	public Ventas (String tipo_articulo, int cantidad){
		
		this.tipo_articulo=tipo_articulo;
		this.cantidad=cantidad;
		
	}
	
	
	public void sumarCantidad ( int cantidad){
		
		this.cantidad+=cantidad;
	
	
	}
	

	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public String getTipo_articulo() {
		return tipo_articulo;
	}


	@Override
	public String toString() {
		return "El numero de ventas de " + tipo_articulo + ", son de " + cantidad;
	}
	
	
	
}
