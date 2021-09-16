package logica;

import java.util.Scanner;

public class ExercicioWhile2 {

	public static void main(String[] args) {
		int cordenada1, cordenada2;

		Scanner scanner = new Scanner(System.in);

		do {
			System.out.printf("Favor informar a primeira cordenada: ");
			cordenada1 = scanner.nextInt();
			System.out.printf("Favor informar a segunda cordenada: ");
			cordenada2 = scanner.nextInt();
			scanner.close();

			if (cordenada1 == 0 || cordenada2 == 0) {
				break;

			} else if (cordenada1 < 0 && cordenada2 > 0) {
				System.out.printf("Primeiro\n");

			} else if (cordenada1 > 0 && cordenada2 > 0) {
				System.out.printf("Segundo\n");

			} else if (cordenada1 > 0 && cordenada2 < 0) {
				System.out.printf("Quarto\n");

			} else {
				System.out.printf("Terceiro\n");

			}

		} while (cordenada1 != 0 & cordenada2 != 0);

	}

}
