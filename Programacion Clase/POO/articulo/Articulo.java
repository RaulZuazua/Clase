package articulo;

public class Articulo {

	private String tipo;
	private String caracteristicas;
	private int precio;
	
	
	
	public Articulo(){
		
		tipo="";
		caracteristicas="";
		precio=0;
		
		}
	
	public Articulo(String tipo, String caracteristicas, int precio){
		
		this.tipo=tipo;
		this.caracteristicas=caracteristicas;
		this.precio=precio;
		
	}



	public int getPrecio() {
		return precio;
	}



	public void setPrecio(int precio) {
		this.precio = precio;
	}



	public String getTipo() {
		return tipo;
	}



	public String getCaracteristicas() {
		return caracteristicas;
	}



	@Override
	public String toString() {
		return "Este articulo es de tipo " + tipo + ", y tiene las siguientes caracteristicas " + caracteristicas + ", se precio es de " + precio;
	}

	

	@Override
	public boolean equals(Object obj) {
		
		Articulo articu = (Articulo) obj;
		if (tipo == null) {
			if (articu.tipo != null)
				return false;
		} else if (!tipo.equals(articu.tipo))
			return false;
		return true;
	}

	
	

	
	
	
	
	
	
	
	
}
