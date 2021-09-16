package logica;

import java.util.Scanner;

public class ExercicioIfElse5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int item, qtdItem = 0;
		double valorTotal = 0;

		System.out.println("Favor informar o item comprado: ");
		item = scanner.nextInt();
		System.out.println("Favor informar a quantidade de itens comprados: ");
		qtdItem = scanner.nextInt();
		scanner.close();

		switch (item) {
		case 1:
			valorTotal = qtdItem * 4;
			break;
		case 2:
			valorTotal = qtdItem * 4.50;
			break;
		case 3:
			valorTotal = qtdItem * 5;
			break;
		case 4:
			valorTotal = qtdItem * 2;
			break;
		case 5:
			valorTotal = qtdItem * 1.50;
			break;

		}
		System.out.println("Total: R$" + valorTotal);

	}

}
