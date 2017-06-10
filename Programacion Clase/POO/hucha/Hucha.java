package hucha;



public class Hucha {

	
	private int moneda_1=1;
	private int moneda_2=2;
	private int billete_5=5;
	private int cantidad_1;
	private int cantidad_2;
	private int cantidad_5;
	private int AhorrosTotales;
	private String estado="";
	
	
	public Hucha(String estado){
		
		this.estado=estado;
		
	}
	
	
	
	public  void abrirHucha(){
		
		estado="Abierta";
		System.out.println("Hucha Abierta \n");
		
		
	}
	
	
	public void ingresar(int cantidad_1, int cantidad_2, int cantidad_5 ){
		
		int ingresos;
		
		ingresos=(this.moneda_1*cantidad_1)+(this.moneda_2*cantidad_2)+(this.billete_5*cantidad_5);
		
		AhorrosTotales+=ingresos;
		
		this.cantidad_5=cantidad_5+this.cantidad_5;
		
		System.out.println("Realizando Operacion .... Ingreso de " + ingresos + " € efectuado con exito \n");
	}
	
	public void valorTotal(){
	
		System.out.println("El valor total de tus ahorros es de " + AhorrosTotales + "\n");
	
	}
	
	public boolean hayBilletes(){
		
		if (this.cantidad_5>=0){
			
		System.out.println("Hay " + cantidad_5 + " billetes de 5€ en la hucha");
			return true;}
		
		else {
			
		System.out.println("Lo siento, en este momento no hay billetes en la hucha");
			return false;}
		
		
	}

	
	public void sacarBilletes(int billetes_Sacar){
		
		int importe_retirado = 0;
	
		if (estado.equalsIgnoreCase("CERRADA")){
		
			System.out.println("La hucha esta cerrada, no puedes sacar dinero");}
		
		else if (billetes_Sacar>cantidad_5){	
				
			System.out.println("La hucha solo contine en este momento " + cantidad_5 + " billetes, elige otro importe a retirar");}
				
		else	{	
			importe_retirado=billetes_Sacar*5;
			cantidad_5=cantidad_5-billetes_Sacar;
			AhorrosTotales=AhorrosTotales-importe_retirado;
			System.out.println("Retirando importe . . . Importe retirado :" + importe_retirado + " € equivalente a " + billetes_Sacar + " billetes de 5€");
			System.out.println("Ahorros totales en la actualidad ... " + AhorrosTotales);}
		
	
	}
}