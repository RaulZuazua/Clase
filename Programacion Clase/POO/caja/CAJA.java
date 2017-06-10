package caja;

public class CAJA {

	
	private float ancho, alto;
	private String material;
	static int numeroCajas;
	
	
	
	public CAJA (){
		
		ancho= 10;
		alto= 50;
		material="Carton";
	}
	
	
	
	public CAJA (int ancho, int alto, String material){
		
		
		
		if (ancho>=5 && ancho<=50){
		
			this.ancho=ancho;}
		
		
		
		else {
			ancho= 10;
			this.material=material;}
		
		
		
		if (alto>=10 && alto <=150){
			
			this.alto=alto;}
		
		
		
		else{
			ancho= 10;
			this.material=material;}
			
			
			this.material=material;
	
	}
	
	
	public CAJA (int ancho, int alto){
		
		this();
		this.material="Carton";
		
				
	}



	public float getAlto() {
		return alto;
	}



	public void setAlto(float alto) {
		this.alto = alto;
	}



	public String getMaterial() {
		return material;
	}



	public void setMaterial(String material) {
		this.material = material;
	}



	public void setAncho(){
		
		this.ancho=(int) Math.random()*(50+5)-5;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(alto);
		result = prime * result + Float.floatToIntBits(ancho);
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		return result;
	}



	
	public boolean equals(Object CAJA) {
		if (this == CAJA)
			return true;
		if (CAJA == null)
			return false;
		if (getClass() != CAJA.getClass())
			return false;
		CAJA other = (CAJA) CAJA;
		if (Float.floatToIntBits(alto) != Float.floatToIntBits(other.alto))
			return false;
		if (Float.floatToIntBits(ancho) != Float.floatToIntBits(other.ancho))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}



	
	public String toString() {
		return "Soy una Caja de "+material+" y mis dimensiones son " + ancho + " cm de ancho, y " + alto + " cm , de alto";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
