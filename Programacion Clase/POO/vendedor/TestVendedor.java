package vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Vendedor RODOLFO=new Vendedor(5898, "Rodolfo", 'C'); 
		
		Vendedor IKER=new Vendedor(9895, "Iker", 'C'); 
		
		
		System.out.println(RODOLFO.toString());
		System.out.println(IKER.toString());
		
		
		
		IKER.comision_ventas(35000);
		
		System.out.println("El sueldo de Iker es de "+IKER.salario('A'));
		System.out.println("El sueldo de Rodolfo es de "+RODOLFO.salario('A'));
		
	}

}
