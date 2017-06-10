package fecha;

public class testFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String MesLiteral;
		
		
		Fecha primera=new Fecha();
		primera.setDia(20);
		primera.setMes(9);
		primera.setAño(2008);
		primera.mes_literal();
		System.out.println(primera.toString());
		
		
		primera.setDia(21);
		primera.setMes(11);
		primera.setAño(2009);
		System.out.println(primera.toString());
		
		
		
	}

	
	

}
