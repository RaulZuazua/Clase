package Arrays;

public class Rotar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] vector = {1,2,3,4,5,6,};
		int primer_numero = vector[0];
		
		
		for (int i=0; i<vector.length-1; i++){
			
			vector[i]=vector[i+1];
			vector[i]=primer_numero;
			
		}
		
		
				
		for (int num:vector){
			
			System.out.println(num);
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
