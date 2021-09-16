package logica;

import java.util.Scanner;

public class ExercicioSeq3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[4];
		int diferenca = 0;

		for (int i = 0; i <= 3; i++) {
			System.out.println("Favor informar o numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		scanner.close();
		diferenca = (numeros[0] * numeros[1] - numeros[2] * numeros[3]);

		System.out.println("DIFERENÇA = " + diferenca);
	}
}
