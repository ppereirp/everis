package logica;

import java.util.Scanner;

public class ExercicioFor5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar o numero a ser fatorado: ");
		int numero = scanner.nextInt();
		scanner.close();
		int fatorial = 1;
		if (numero != 0) {
			for (int i = 1; i <= numero; i++) {
				fatorial = fatorial * i;
			}
		}
		System.out.println("O fatorial de " + numero + " é " + fatorial);
	}
}
