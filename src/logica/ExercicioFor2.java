package logica;

import java.util.Scanner;

public class ExercicioFor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor informar a quantidade de numeros: ");
		int qtdNumeros = scanner.nextInt();
		int[] numeros = new int[qtdNumeros];

		for (int i = 0; i < qtdNumeros; i++) {
			System.out.println("Favor informe o numero " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();

		}
		scanner.close();

		for (int i = 0; i < qtdNumeros; i++) {

			if (numeros[i] >= 10 && numeros[i] <= 20) {
				System.out.println(numeros[i] + " in");
			} else {
				System.out.println(numeros[i] + " out");
			}

		}

	}

}
