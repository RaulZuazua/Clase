package Arrays;

public class Ejercicio_604 {
	
	
	
	public static int[] cargarVector (int vector []){
			

		
		for (int i=0; i<vector.length; i++){
			
		vector[i]=(int) (Math.random()*10+1);	
			
		}
		
		return vector;
	
	}
	
	
	
	
	
	public static void imprimirVector (int vector[]){
		
		
		for (int i=0; i<vector.length; i++){
			
			System.out.println("El valor de la posicion " + (i+1) + " es de " + vector[i]);
			
		}
		
		
	}
	
	
	
	public static void media (int vector[]){
		
		double aux=0;
		double media;
		
		for (int i=0; i<vector.length; i++){
			
			aux=aux+vector[i];
			
			
		}
		
		media=aux/vector.length;
		System.out.println("La media de notas de clase es de " + media);
	}
	
	
	public static void numeroSuspendos (int vector []){
		
		
		int contadorAprobados=0;
		int contadorSuspensos=0;
		
		for (int i=0; i<vector.length; i++){
			
			if (vector[i]>=5)
				
				contadorAprobados++;
			
			else 
				
				contadorSuspensos++;
			
		}
		
		System.out.println("El numero de Aprobados de la clase es de : " + contadorAprobados++);
		System.out.println("El numero de Suspensos de la clase es de : " + contadorSuspensos++);
		
	}
	
	
	
	
	public static void frecuenciaNotas (int vector[]){
		
		int [] frecuencia=new int [10];
		int aux = 0;
		int aux2 = 0;
		
		for(int i=0; i<vector.length; i++){
				
				aux=vector[i];
				frecuencia[aux-1]++;
				
			}
			
		for (int i=0; i<frecuencia.length; i++){
			
			
			System.out.println("La frecuencia para la nota " + (aux2++) + " es de " + frecuencia[i] + " de " + vector.length);
			
			
		}
		
	}
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] vector=new int [30];	
	
	vector=cargarVector(vector);
	imprimirVector(vector);
	System.out.println(" ");
	media(vector);
	numeroSuspendos(vector);
	System.out.println(" ");
	frecuenciaNotas(vector);	
	
	}

}
