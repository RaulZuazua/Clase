package Disco;

public class Grupo {


	private String nombre;
	private int tiempoDeActuacion;
	private int popularidad;
	private float coste;
	public Grupo (String n,int t,int p,float c){
		nombre=n;
		tiempoDeActuacion=t;
		popularidad=p;
		coste=c;
	}
	public int duracion()
	{
		return tiempoDeActuacion;
	}
	public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setTiempoDeActuacion(int tiempoDeActuacion) {
			this.tiempoDeActuacion = tiempoDeActuacion;
		}
		public void setPopularidad(int popularidad) {
			if (popularidad<1 || popularidad >10)
			{
				System.out.println("error .....");
				
			this.popularidad = 0;
			
		}
			else
			this.popularidad=popularidad;
		}
		public void setCoste(float coste) {
			this.coste = coste;
		}
	public int getPopularidad() {
			return popularidad;
		}

	public float  getCoste() {
		
	return coste;
	}
	public float damePrecioTotal()
	{
		float coste_total;
		coste_total=coste+ (coste*popularidad)/100.0f;
		return coste_total;
	}
	public String toString()
	{
		String texto="****************************************************"+"\n";
		texto+="Nombre "+nombre+"\n"+"tiempo de actuación:"+tiempoDeActuacion+" popularidad"+popularidad;
		return texto;
	}
	}
	