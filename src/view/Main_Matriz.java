package view;

import controller.SomaMatriz;

public class Main_Matriz {

	public static void main(String[] args) {

		double [][] matriz = new double [3][5];
		double [] vetor = new double [3];
		
		for (int i = 0; i < 3; i++) {				
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = (double) (Math.random() * 100);
				if (i == j) {
					vetor[i] = matriz[i][j];
				}
			} 
		}
		SomaMatriz somaMatriz = new SomaMatriz(vetor);
			somaMatriz.start();
	} 
}			
		
		
	
		
		



