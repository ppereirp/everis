package logica;

import java.util.Scanner;

public class ExercicioWhile3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int qtdAlc = 0, qtdGas = 0, qtdDies = 0, abastecido;

		do {

			System.out.printf("Favor informar o combustivel abastercido(1.Álcool 2.Gasolina 3.Diesel 4.Fim: ");
			abastecido = scanner.nextInt();
			scanner.close();

			if (abastecido < 1 || abastecido > 4) {
				System.out.printf("Combustivel invalido\n");
			}

			switch (abastecido) {
			case 1: {
				qtdAlc++;
				break;

			}
			case 2: {
				qtdGas++;
				break;

			}
			case 3: {
				qtdDies++;
				break;

			}
			case 4: {
				System.out.printf("MUITO OBRIGADO\n");
				System.out.printf("Alcool:" + qtdAlc + "\n");
				System.out.printf("Gasolina:" + qtdGas + "\n");
				System.out.printf("Diesel:" + qtdDies + "\n");
				break;

			}
			}

		} while (abastecido != 4);

	}
}
