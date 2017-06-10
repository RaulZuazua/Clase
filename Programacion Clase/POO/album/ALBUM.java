package album;

public class ALBUM {

	private String titulo;
	private String autor;
	private String discografia;
	private int año;
	private char soporte;
	private int elementos;
	private double precio;
	private char genero;
	private boolean español;
	
	
	//CONTRUCTORES
	
	public ALBUM(String titulo, String autor, String discografia, int año, char soporte, double precio, char genero, boolean español){
		
		this.titulo=titulo;
		this.autor=autor;
		this.discografia=discografia;
		this.año=año;
		this.soporte=soporte;
		this.precio=precio;
		this.genero=genero;
		this.español=español;
		
		
	}

	
	public ALBUM (){
		
		this.titulo="";
		this.autor="";
		this.discografia="";
		this.año=0;
		this.soporte=' ';
		this.precio=0;
		this.genero=' ';
		this.español=false;
		
	}
	
	
	


	public String getTitulo() {
		return titulo;
	}



	public String getAutor() {
		return autor;
	}



	public String getDiscografia() {
		return discografia;
	}



	public int getAño() {
		return año;
	}



	public char getSoporte() {
		return soporte;
	}



	public int getElementos() {
		return elementos;
	}



	public double getPrecio() {
		return precio;
	}



	public char getGenero() {
		return genero;
	}



	public boolean isEspañol() {
		return español;
	}

	


	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public void setDiscografia(String discografia) {
		this.discografia = discografia;
	}



	public void setAño(int año) {
		this.año = año;
	}



	public void setSoporte(char soporte) {
		this.soporte = soporte;
	}



	public void setElementos(int elementos) {
		this.elementos = elementos;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public void setGenero(char genero) {
		this.genero = genero;
	}



	public void setEspañol(boolean español) {
		this.español = español;
	}



	public String Imprimir_Album() {
		return "Datos del album:"
				+ "\n"
				+ "ALBUM :\t" + titulo +
				"\n"+ 
				"AUTOR : \t" + autor +
				"\n"+
				"DISCOGRAFIA :\t" + discografia +
				"\n" +
				"AÑO :\t" + año+
				"\n"+
				"SOPORTE :\t" + soporte +
				"\n"+
				"PRECIO : \t" + precio +
				"\n"+
				"GENERO : \t" + genero +
				"\n"+ 
				"ESPAÑOL : \t" + español;
	}
	
	
	
	
	
	
	
	
	
	
	
}
