package persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PERSONA pepe=new PERSONA ();
		pepe.setNombre("PEPE");
		pepe.setApellido("FERNANDEZ");
		pepe.setTelefono("6955006537");
		
		
		
		PERSONA luis=new PERSONA ();
		luis.setNombre("LUIS");
		luis.setApellido("SUAREZ");
		luis.setTelefono("628945987");
		
		
		
		
		CUENTA PRIMERA=new CUENTA(58596458, 0, pepe);
		CUENTA SEGUNDA=new CUENTA(65826584, 10000, luis);
		
		
		PRIMERA.transaccion(50, "DEPOSITO");
		PRIMERA.transaccion(100, "RETIRO");
		
		
		SEGUNDA.transaccion(50, "DEPOSITO");
		SEGUNDA.transaccion(50, "RETIRO");
		
		
		System.out.println(pepe.toString());
		System.out.println(luis.toString());
		
		
		
		System.out.println(PRIMERA.toString());
		System.out.println(SEGUNDA.toString());
		
	}

}
