package logica;

import java.util.Scanner;

public class ExercicioFor6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar um numero: ");
		int numero = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.println(i);
			}
		}
	}
}
