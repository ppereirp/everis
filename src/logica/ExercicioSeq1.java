package logica;

import java.util.Scanner;

public class ExercicioSeq1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero1, numero2;
		

		System.out.println("Favor informar o primeiro numero a ser somado: ");
		numero1 = scanner.nextInt();
		System.out.println("Favor informar o segundo numero a ser somado: ");
		numero2 = scanner.nextInt();
		scanner.close();

		System.out.println("Soma = " + (numero1 + numero2));
	}

}
