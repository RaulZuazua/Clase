package producto;

	public class PRODUCTO {

	
		private double precio_costo;
		private double precio_venta;
		private int codigo;
		private int cantidad_vendida;
	
	
	
	
	
	public PRODUCTO (double precio_costo, double precio_venta, int codigo, int cantidad_vendida ){
		
		
		this.precio_costo=precio_costo;
		this.precio_venta=precio_venta;
		this.codigo=codigo;
		this.cantidad_vendida=cantidad_vendida;
		
		
	}
	
	
	public PRODUCTO (){
		
		
		this.precio_costo=0;
		this.precio_venta=0;
		this.codigo=0;
		this.cantidad_vendida=0;
		
		
	}
	
	
	public double ganancia_producto () {
		
		double ganancia;
		ganancia=(this.precio_venta-this.precio_costo);
		return ganancia;
		
		
	}
	
	
	public double ganancias_tienda(){
		
		double ganancias = 0;
		double [] ganancia_tienda ;
		ganancia_tienda=new double [10];
		
		for(int i=0; i<ganancia_tienda.length;i++){
			
			ganancia_tienda[i]=ganancia_producto();
			
		}
		
		for(int i=0; i<ganancia_tienda.length;i++){
			
			//ganancias+=ganancia_tienda[i];
			System.out.println(ganancia_tienda[i]);
			
		}
		return ganancias;
	}
	
	

	public double getPrecio_costo() {
		return precio_costo;
	}


	public void setPrecio_costo(double precio_costo) {
		this.precio_costo = precio_costo;
	}


	public double getPrecio_venta() {
		return precio_venta;
	}


	public void setPrecio_venta(double precio_venta) {
		this.precio_venta = precio_venta;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getCantidad_vendida() {
		return cantidad_vendida;
	}


	public void setCantidad_vendida(int cantidad_vendida) {
		this.cantidad_vendida = cantidad_vendida;
	}


	
	public String toString() {
		return "PRECIO DE COSTO " + precio_costo + "\n"+ "PRECIO DE VENTA " + precio_venta + "\n" + "CODIGO " + codigo
				+ "\n" +  "CANTIDAD VENDIDA " + cantidad_vendida + "\n" + "LA GANANCIA EN ESTA PRODUCTO ES DE " + ganancia_producto() + " €\n";
	}
	
	
	
	
	
	
	
	
	
	
	
}
