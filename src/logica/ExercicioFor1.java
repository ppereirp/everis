package logica;

import java.util.Scanner;

public class ExercicioFor1 {

	/*
	 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
	 * até X, um valor por linha, inclusive o X, se for o caso.
	 */

	public static void main(String[] args) {
		int numero;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.printf("Favor informar um numero entre 1 e 1000: ");
			numero = scanner.nextInt();
			if (numero < 1 || numero > 1000) {
				System.out.printf("Valor fora do esperado\n");
			}
		} while (numero < 1 || numero > 1000);
		scanner.close();

		for (int i = 0; i <= numero; i++) {

			if (i % 2 != 0) {
				System.out.printf(i + "\n");
			}
		}

	}
}
