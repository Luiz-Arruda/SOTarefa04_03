package controller;

public class SomaMatriz extends Thread {

	double [] vetor = new  double[5];
	
	public SomaMatriz (double [] vetor) {
		this.vetor = vetor;
	}

	@Override
	public void run() {
		calcLinha();
	}
	
	public void calcLinha() {
		double result = 0.0;
		for (int i = 0; i < 3; i++) {
			result = result + vetor[i];
		}
		System.out.println("A soma da linha e " + result);
	}
}
