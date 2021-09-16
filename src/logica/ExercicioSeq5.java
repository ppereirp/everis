package logica;

import java.util.Scanner;

public class ExercicioSeq5 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] codPeca = new int[2],qtdPecas = new int[2];
		double[] vlrUnit = new double[2];
		
		for (int i = 0; i < codPeca.length; i++) {
			System.out.println("Favor informar o codigo da peca "+(i+1)+": ");
			codPeca[i] = scanner.nextInt();
			System.out.println("Favor informar a quantidade da peca"+(i+1)+": ");
			qtdPecas[i] = scanner.nextInt();
			System.out.println("Favor informar o valor unitario da peca"+(i+1)+": ");
			vlrUnit[i] = scanner.nextDouble();
		}
		scanner.close();
		System.out.println("VALOR A PAGAR: R$"+((vlrUnit[0] * qtdPecas[0])+(vlrUnit[1] * qtdPecas[1])));	
		

	
		
		
	}

}
