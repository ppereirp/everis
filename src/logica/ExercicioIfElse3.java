package logica;

import java.util.Scanner;

public class ExercicioIfElse3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar o primeiro numero: ");
		int numero1 = scanner.nextInt();
		System.out.println("Favor informar o segundo numero: ");
		int numero2 = scanner.nextInt();
		scanner.close();

		if (numero1 < numero2) {
			if (numero2 % numero1 == 0) {
				System.out.println("São multiplos");
			} else {
				System.out.println("Não são multiplos");
			}
		} else {
			if (numero1 % numero2 == 0) {
				System.out.println("São multiplos");
			} else {
				System.out.println("Não são multiplos");
			}
		}
	}
}
