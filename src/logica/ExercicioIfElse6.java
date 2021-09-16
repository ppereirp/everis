package logica;

import java.util.Scanner;

public class ExercicioIfElse6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double numero = 0;
		String intervalo;

		System.out.println("Favor informar um numero: ");
		numero = scanner.nextDouble();
		scanner.close();

		if (numero >= 0 && numero <= 25) {
			intervalo = "[0,25]";
		} else if (numero >= 26 && numero <= 50) {
			intervalo = "[25,50]";
		} else if (numero >= 51 && numero <= 75) {
			intervalo = "[50,75]";
		} else if (numero >= 76 && numero <= 100) {
			intervalo = "[75,100]";
		} else {
			intervalo = "Fora de intervalo";
		}

		System.out.println(intervalo);

	}
}
