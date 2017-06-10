package vendedor;

public class Vendedor {

	private int codigo_vendedor;
	private String nombre;
	private char categoria;
	private int ventas_real =0;

	
	
	
	// CONSTRUCTOR

	
	public Vendedor (int codigo_vendedor, String nombre, char categoria){
		
		this.codigo_vendedor=codigo_vendedor;
		this.nombre=nombre;
		this.categoria=categoria;
		
	}




	public int getVentas_real() {
		return ventas_real;
	}




	public void setVentas_real(int ventas_real) {
		this.ventas_real = ventas_real;
	}




	public int getCodigo_vendedor() {
		return codigo_vendedor;
	}




	public String getNombre() {
		return nombre;
	}




	public char getCategoria() {
		return categoria;
	}
	
	
	
	// METODOS
	
	public double salario(char categoria){
		
		int salario = 0;
		
		if (categoria=='A')
			
			salario=600;
		
		else if (categoria=='B')
			
			salario=800;
		
		else if (categoria=='C')
			
			salario=1000;
		
		else{
			System.out.println("ERROR! ,la categoria debe estar comprendida entre A Y C");
				return salario=0;}
		
		return salario+comision_ventas(this.ventas_real);
	}
	
	
	public double comision_ventas (int ventas_real){
		
		double comision_ventas = 0;
		this.ventas_real=ventas_real;
		
		if (ventas_real<5000)
			
			comision_ventas=(ventas_real*0.05);
		
		else if (ventas_real>=5000 && ventas_real<=10000)
			
			comision_ventas=(ventas_real*0.10);
		
		else if (ventas_real>10000){
			
			comision_ventas=(ventas_real*0.15);}
		
			//System.out.println("La comision por tener unas ventas de " + ventas_real + "es de " + comision_ventas+ "€");
		
			return comision_ventas;
		
	}
		
	
	
		// TO STRING
		
		

	@Override
	public String toString() {
		return "EL Vendedor con codigo: " + codigo_vendedor + ", Tiene por nombre : " + nombre + ", y pertenece a la categoria categoria: " + categoria
				+ ", posee unas ventas por valor de :" + ventas_real;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + categoria;
		result = prime * result + codigo_vendedor;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ventas_real;
		return result;
	}


	// EQUALS

	
	public boolean equals(Object Vendedor) {
		
		
		if (getClass() != Vendedor.getClass())
			return false;
		Vendedor other = (Vendedor) Vendedor;
		if (categoria != other.categoria)
			return false;
		if (codigo_vendedor != other.codigo_vendedor)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (ventas_real != other.ventas_real)
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
}
