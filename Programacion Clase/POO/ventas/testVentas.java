package ventas;

public class testVentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Ventas primera=new Ventas("Electronica", 5);
		
		System.out.println(primera.toString());
		
		primera.sumarCantidad(10);
		
		System.out.println(primera.toString());
		
		
		
	}

}
