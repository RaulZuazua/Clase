package coche;

public class Coche {

	
	 private String marca;
	 private String modelo;
	 private String color;
	 private boolean  esMetalizado;
	 private String  matricula;
	 private String  tipo;
	 private int annoDeFabricacion;
	 private String seguro;
	 
	 
	 
	 
	 //contructor
	 
	 public Coche(String a, String b, String c){
		 
		 
		 marca=a;
		 modelo=b;
		 color=c;
		 
	 }
	 
	 
	 public Coche(String a, String b, String c, boolean d, String e, String f, int g, String h){
		 
		 
		 marca=a;
		 modelo=b;
		 color=c;
		 esMetalizado=d;
		 matricula=e;
		 tipo=f;
		 annoDeFabricacion=g;
		 seguro=h;
		 
		   		 
	 }
	 
	 
	 
	 
	 
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isEsMetalizado() {
		return esMetalizado;
	}
	public void setEsMetalizado(boolean esMetalizado) {
		this.esMetalizado = esMetalizado;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAnnoDeFabricacion() {
		return annoDeFabricacion;
	}
	public void setAnnoDeFabricacion(int annoDeFabricacion) {
		this.annoDeFabricacion = annoDeFabricacion;
	}
	public String getSeguro() {
		return seguro;
	}
	public void setSeguro(String seguro) {
		this.seguro = seguro;
	}
	
	
	
	@Override
	public String toString() {
		return "Este Coche es de la marca " + marca + ", modelo " + modelo + ", color " + color + ", esMetalizado=" + esMetalizado
				+ ", matricula=" + matricula + ", tipo=" + tipo + ", annoDeFabricacion=" + annoDeFabricacion
				+ ", seguro=" + seguro + "]";
	}
	
	
	 
}
