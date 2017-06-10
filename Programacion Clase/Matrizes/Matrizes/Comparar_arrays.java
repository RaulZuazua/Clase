package Matrizes;

import java.util.Arrays;

public class Comparar_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vector1={1,2,3};
		
		int [] vector2={1,2,3,4};
		
		if (Arrays.equals(vector1, vector2)==true){
			
			System.out.println("Iguales");
			
		}
		
		else 
			System.out.println("Distintos");	
		

		
		
		System.out.println((Arrays.binarySearch(vector2, 4)+1));
		
		
	}	
	
	
}
