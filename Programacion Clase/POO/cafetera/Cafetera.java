package cafetera;

import java.util.Scanner;

public class Cafetera {

	
		private final int capacidadMax=1000;
		private int capacidadActual;
		
		
		public void llenarCafetera(int capacidadMax){
					
			
			if (this.capacidadMax>=capacidadMax){
				
				capacidadActual=capacidadMax;
			}
			
			else { 
				
				capacidadActual=this.capacidadMax;
				System.out.println("Cuidado!!, la Cafetera se ha desbordado la cantidad actual en la cafetera es de 1 litro ... y otro tanto por el suelo \n");
			}
			
		}
		
		public void mLlenar(){
			
			if (capacidadActual!=capacidadMax){
				
			capacidadActual=capacidadMax;
			System.out.println("Rellenando cafetera . . . . Rellenada \n");}
			
			else{
			
				System.out.println("La cafetera ya esta llena, si la rellenas de nuevo se desbordara");}
			
						
		}
		
		
		
		public void mVaciarCafetera(){
			
			
			
			if (capacidadActual>0){
				capacidadActual=0;
				System.out.println("Vaciando cafetera . . . . vaciada \n");}
				
			else
				
				System.out.println("La cafetera ya esta vacia, no hace falta que la vacies");
			
		}
		
		public void mAfregarCafe(int cantidad){
			
			char sn;
			
			if ((capacidadActual+cantidad)<=capacidadMax){
				
				capacidadActual=capacidadActual+cantidad;}
			
			else if  ((capacidadActual+cantidad)>=capacidadMax)
				
				System.out.println("OJO!! la cafetera ya tiene "+ capacidadActual + " ml, si la rellana con tanta cantidad se desbordara \n" );
				Scanner teclado=new Scanner(System.in);
				System.out.println("¿Esta seguro que desea continuar? (s/n)");
				sn=teclado.next().charAt(0);
				
				
				if (sn=='s'){
					
					capacidadActual=capacidadMax;
					System.out.println("Como quieras, tienes en la cafetera " + capacidadActual + " ml y " + (cantidad - capacidadActual) + " ml por el suelo");}
				
				else if (sn=='n'){
					
					System.out.println("Buena eleccion, tu madre te lo agradecera \n");
				}
				
		}
		
		
		public void servirCafe(int cafe_servido){
			
			if (capacidadActual>=cafe_servido){
				
				capacidadActual=capacidadActual-cafe_servido;
				
				System.out.println("Cafe servido!!, la cantidad de cafe que queda en la cafetera ahora mismo es de " + capacidadActual + " ml");
				
			}
			
			else if ((capacidadActual<=cafe_servido)&&(!(capacidadActual==0))){
				
				System.out.println("Lo siento!! el cafe actual de la cafetera es de " + capacidadActual + " ml por lo tanto no hay suficiente cantidad para su cafe");
				
			}
			
			else if (capacidadActual==0){
				
				System.out.println("Upps, No hay cafe en la cafetera!! rellenala");
			}
			
		}
		
		
		
		
		
	}
	
	

