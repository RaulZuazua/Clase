package articulo;

public class testArticulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo pendientes=new Articulo("Joyeria","Pendientes de oro", 118);
		Articulo pendientes2=new Articulo("Joyeria","Pendientes de oro", 118);
		Articulo pendientes3=new Articulo("Panaderia","pan", 1);
		
		System.out.println(pendientes.toString() + " \n");
		System.out.println(pendientes2.toString() + " \n");
		System.out.println(pendientes3.toString() + " \n");
		
		
	
		boolean iguales;
		iguales=pendientes.equals(pendientes2);
		
		if (iguales==true)
			System.out.println("Los productos son del mismo tipo");
		else 
			System.out.println("Los productos son de distinto tipo");
		
		
		
	}

}
