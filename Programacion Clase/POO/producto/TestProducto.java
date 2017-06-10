package producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PRODUCTO producto1=new PRODUCTO(20, 40, 698545, 7);
		PRODUCTO producto2=new PRODUCTO(5, 10 , 555878, 2);
		
		
		System.out.println(producto1.toString());
		System.out.println(producto2.toString());
		producto2.ganancia_producto();
		
		
		
		System.out.println("La ganancia de la tienda es de " + producto2.ganancias_tienda());
		
		
		
		
		
		
	}

}
