package DAO_AVANZADO;

public class Pais {

	
	private String pais_id;
	private String nombre_pais;
	private int region_id;
	
	
	
	
	public String getPais_id() {
		return pais_id;
	}
	public void setPais_id(String pais_id) {
		this.pais_id = pais_id;
	}
	public String getNombre_pais() {
		return nombre_pais;
	}
	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	
	
	
	@Override
	public String toString() {
		return pais_id +  " " + nombre_pais +" " + region_id;
	}
	
	
	
	
	
	
	
	

}
