package vendedor;

import java.util.Scanner;

public class GestionVendedores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado=new Scanner(System.in);
		
		
		int codigo;
		String nombre;
		char categoria;
		int opcion=0;

		
		System.out.println("Introduce el codigo del empleado");
		codigo=teclado.nextInt();
		
		System.out.println("Introduce el nombre del empleado");
		nombre=teclado.next();
		
		System.out.println("Introduce la categoria del empleado");
		categoria=teclado.next().charAt(0);
	
		
		
		Vendedor LUIS=new Vendedor(codigo,nombre,categoria);
		
		while (!(opcion==4)){
			
			
		System.out.println("Gestion de Vendedores \n" +
							"\n"+
							"1 - Asignar Ventas \n"+	
							"2 - Consultar comision \n"+ 
							"3 - Consultar comision \n" +
							"4 - Finalizar \n" +
							"Teclee la opcion deseada \n" );
		
		
		opcion=teclado.nextInt();
			
		 switch (opcion){
		 
			 
			 case 1: System.out.println("Teclea el numero de ventas para " + LUIS.getNombre());
			 		 LUIS.setVentas_real(teclado.nextInt());
			 		 System.out.println("Ventas definidas correctamente \n");
			 		 break;
			 
			 case 2: System.out.println("D. "+ LUIS.getNombre()+ " tiene la categoria " + LUIS.getCategoria()+ " y le corresponde un salario de" + LUIS.salario(categoria)+"€");
			 		 System.out.println("Operacion terminada \n");
			 		 break;
			 		 
			 case 3: System.out.println("D. "+ LUIS.getNombre()+ " tiene la categoria " + LUIS.getCategoria()+ " ha realizado unas ventas de " + LUIS.getVentas_real() + "€ por las que le corresponde unas comisiones por valor de "+ LUIS.comision_ventas(LUIS.getVentas_real()));
			         System.out.println("Operacion terminada \n");
			 		 break;	
			
			 case 4: break;
			 
			 default : System.out.println("Opcion no valida, por favor introducir un opcion del 1 al 4");
			 			
				 
			 
			 
			 
			 
		 } //final swicth
		} //final while 
		
		
		System.out.println("Programa finalalizado, gracias");
		
	}

}

