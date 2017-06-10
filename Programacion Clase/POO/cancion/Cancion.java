package cancion;

public class Cancion {

	private String titulo;
	private String autor;
	
	
	public Cancion(String a, String b){ //inicio metodo
		
		titulo=a;
		autor=b;
		
	}//final metodo
	
	
	public Cancion(){//inicio metodo
		
		titulo="";
		autor="";
		
	}//final metodo
	
	
	
	public String dameTitulo() {
		return titulo;
	}
	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String dameAutor() {
		return autor;
	}
	public void ponAutor(String autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "El titulo de la cancion es "+ titulo + " y el  autor es " + autor + "";
	}
	
	
	
	
	
	
	}
