package hucha;

public class testHucha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hucha cerdito=new Hucha("cerrada");
		
		cerdito.abrirHucha();
		
		cerdito.ingresar(10, 10, 10);
		
		cerdito.hayBilletes();
		
		cerdito.valorTotal();
	
		cerdito.sacarBilletes(5);
		
		cerdito.ingresar(0, 0, 20);
		
		cerdito.valorTotal();
		
		cerdito.sacarBilletes(1);
		
	}

}
