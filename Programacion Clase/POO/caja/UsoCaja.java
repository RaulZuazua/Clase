package caja;

public class UsoCaja {

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CAJA caja_1=new CAJA();
		CAJA caja_2=new CAJA(25,25,"Acero Inoxidable");
		
		System.out.println(caja_1.toString());
		System.out.println(caja_2.toString());
		
		System.out.println("¿Las cajas son iguales?: " + caja_1.equals(caja_2));
		
		
	}

	
	
	
	
}
