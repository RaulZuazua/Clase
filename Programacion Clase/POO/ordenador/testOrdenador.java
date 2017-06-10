package ordenador;

public class testOrdenador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ORDENADOR sobremesa=new ORDENADOR("LENOVO");
		System.out.println(sobremesa.toString());
		ORDENADOR portatil=new ORDENADOR ("ASUS", 5000);
		System.out.println(portatil.toString());
		System.out.println("El numero de equipos creados es de " + portatil.getContador());
		
		if(sobremesa.equals(portatil))
			System.out.println("Son iguales");
		else
			System.out.println("Son distintos");
		
		
		
		
		
	}

}
