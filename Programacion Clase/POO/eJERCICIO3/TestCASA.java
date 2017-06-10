package eJERCICIO3;

public class TestCASA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		CASA casa1=new CASA ();
		
		casa1.setNombre("Antonia Martinez");
		casa1.setZona("centro");
		casa1.setSuperficie(75);;
		casa1.setDireccion("calle uria 25 1B OVIEDO ");
		
		System.out.println(casa1.toString());
		
		
		
		
		casa1.calcularPrecio(15);
		System.out.println("El precio de venta de la casa de " + casa1.getSuperficie() + " m2 es de " + casa1.precioVenta() + " €");
		
		
		
		
	}

}
