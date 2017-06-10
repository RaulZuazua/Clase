package Casa;

public class UsoCasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CASA chalet=new CASA();
		CASA rural=new CASA("Mestas de Con 47", 5.18,"Perico");
		CASA campo=new CASA("La Robellada 23", "Pepe");
		
		System.out.println(chalet.toString());
		System.out.println(rural.toString());
		System.out.println(campo.toString());
		
		
	}

}
