package bombero;

public class TestBomberos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BOMBERO luis=new BOMBERO();
		luis.setNombre("LUIS");
		luis.setApellidos("GONZALEZ FERNANDEZ");
		luis.setEdad(45);
		luis.setCasado(true);
		luis.setEspecialista(true);
		
		
		
		BOMBERO luis_dos=new BOMBERO();
		luis_dos.setNombre("LUIS");
		luis_dos.setApellidos("GONZALEZ FERNANDEZ");
		luis_dos.setEdad(65);
		luis_dos.setCasado(false);
		luis_dos.setEspecialista(false);
		
		
		
		System.out.println(luis.toString());
		System.out.println(luis_dos.toString());
		
		
		boolean iguales;
		
		if(luis.equals(luis_dos)){
			iguales=true;
			System.out.println("¿Los nombres coinciden en el nombre y apellido? "+ iguales);
		}
		
		else {
			
			iguales=false;
			System.out.println("¿Los nombres coinciden en el nombre y apellido? " + iguales);}
		
		
	}

}
