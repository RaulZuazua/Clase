package persona;

public class CUENTA {

	private int numero_cuenta;
	private double saldo;
	private PERSONA propietario;
	
	
	public CUENTA (){
		
		this.numero_cuenta=0;
		this.saldo=1;
		this.propietario=null;
		
	}
	
	
	public CUENTA (int numero_cuenta, double saldo,PERSONA propietario){
		
		this.numero_cuenta=numero_cuenta;
		
		if (saldo<0){
			System.out.println("ERROR! el saldo no puede ser menor que 0€ \n");}
		
		else{
		this.saldo=saldo;}
		
		this.propietario=propietario;
	
	}

	
	public void transaccion (double cantidad, String tipo_transaccion){
		
		if (tipo_transaccion.equalsIgnoreCase("RETIRO")){
			
			if (saldo>=cantidad){
			saldo=saldo-cantidad;
			System.out.println("Realizando operacion de RETIRO en la cuenta de . . . " );
			System.out.println("Operancon realizada con existo, su saldo actual es de " + saldo +"€ \n");}
			
		else{
			System.out.println("Realizando operacion de RETIRO . . . " );
			System.out.println("Su saldo es de " + saldo + " , por lo tanto no puede retirar " + cantidad+ "€ , intentelo conuna cantidad mas baja \n");}
		}
		
		else if (tipo_transaccion.equalsIgnoreCase("DEPOSITO")){
			
			saldo=saldo+cantidad;
			System.out.println("Realizando operacion de DEPOSITO . . . " );
			System.out.println("Operancon realizada con existo, su saldo actual es de " + saldo +"€ \n");
		}
	
		
		else
			
			System.out.println("El parametro solo puede referirse a un RETIRO o un DEPOSITO \n");
		
	}
	
	
	
	
	
	

	
	public String toString() {
		return "El numero de cuenta " + numero_cuenta + ", tiene un saldo de " + saldo + "€, y su propietario es " + propietario+"\n";
	}
	
	
	
		
		
	
	
	
	
	
	
	
	
	
}
