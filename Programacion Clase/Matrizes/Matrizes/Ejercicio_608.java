package Matrizes;

public class Ejercicio_608 {

	
	
	
	
	public static int[][] cargarMatriz(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) {

			for (int o = 0; o < matriz[i].length; o++) {

				System.out.println("Matriz cargada en la posicion [" + i + "]" + "[" + o + "]");
				matriz[i][o] = (int) (Math.random() * 50 + 51);

			}

		}

		return matriz;

	}
	
	
	
	
	

	public static void imprimirMatriz(int[][] matriz) {

		for (int i = 0; i < matriz.length; i++) {

			for (int o = 0; o < matriz[i].length; o++) {

				System.out.println("El valor para la posicion [" + i + "]" + "[" + o + "] es de : " + matriz[i][o]);
				System.out.println(" ");

			}

		}

	}
	
	
	
	
	

	public static void sumaFilas(int[][] matriz) {

		int sumatotal = 0;
		int [] sumafilas=new int [matriz.length];
		
		for ( int  i=0; i<matriz.length;i++){
			
			for ( int o=0; o<matriz[i].length;o++){
				
				sumatotal=sumatotal+matriz[i][o];
				System.out.println("El valor TOTAL para la fila "+ i+ "es de " + sumatotal);
				sumafilas[i]=sumafilas[i]+matriz[i][o];
				System.out.println("El valor para la fila "+ i+ "es de " + sumatotal);
			}
			
			
		}
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matriz = new int[5][5];
		matriz = cargarMatriz(matriz);
		imprimirMatriz(matriz);
		sumaFilas(matriz);

	}

}
