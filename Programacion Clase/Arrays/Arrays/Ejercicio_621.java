package Arrays;

import java.util.Arrays;

public class Ejercicio_621 {

	public static int [] cargarVector (){
		
		int [] vector=new int [20];
		
		for (int i=0; i<vector.length;i++){
			
			vector[i]=(int) (Math.random()*100+1);
			
		}
		
		return vector;
				
	}
	
	
	
	public static void imprimirVector (int [] vector){
		
		
		for ( int num:vector){
			
			
			System.out.println(num + "\t");
			
		}
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int [] vector1=new int [20];
		 int [] vector2=new int [20];
		 int [] vector3=new int [40];
		 
		 
		 vector1=cargarVector();
		 vector2=cargarVector();
		 
		 
		 
		 System.out.println("Vector1 \n");
		 imprimirVector (vector1);
		 System.out.println("");
		 
		 
		 
		 System.out.println("Vector2 \n");
		 imprimirVector (vector2);
		 
		 
		 System.out.println("Vector 1 ordenado \n");
		 Arrays.sort(vector1);
		 imprimirVector (vector1);
		 
		 
		 System.out.println("Vector 2 ordenado \n");
		 Arrays.sort(vector2);
		 imprimirVector (vector2);
		
		
		int i=vector1.length-1;
		
		while (i>=0 && vector1[i] > vector2[i]){
			
			
			
			
			
			
			
			
		}
		
		
	}

	
}
