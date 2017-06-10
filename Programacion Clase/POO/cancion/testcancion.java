package cancion;

public class testcancion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cancion primera=new Cancion("PRIMERA","YO MISMO");
		System.out.println(primera.dameTitulo());
		System.out.println(primera.dameAutor());
		
		
		
		primera.ponAutor("Julio");
		primera.ponTitulo("Buleria");
		System.out.println(primera.dameAutor());
		System.out.println(primera.dameTitulo());
		
		
		
		System.out.println(primera.toString());
		
		
		
		
		Cancion segunda=new Cancion();
		segunda.ponAutor("Masiel");
		segunda.ponTitulo("lalala");
		System.out.println(segunda.toString());
		
	}

}
