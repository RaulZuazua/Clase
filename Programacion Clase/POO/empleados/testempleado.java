package empleados;

public class testempleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		empleado Arturo=new empleado("Arturo","Alvarez",50,2000);
		empleado David=new empleado("David","Gutierrez",20,2000);
		empleado Paco=new empleado();
		
		
		
		Arturo.Suma(200);
		System.out.println(Arturo.toString());
		
		David.Suma(200);
		System.out.println(David.toString());
		
		Paco.Suma(200);
		System.out.println(Paco.toString());
		
		
	}

}
