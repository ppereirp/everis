package logica;

import java.util.Scanner;

public class ExercicioFor3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor informar a quantidade de casos de teste: ");
		int qtdCasos = scanner.nextInt();
		float[] numeros = new float[3];

		for (int i = 0; i < qtdCasos; i++) {
			System.out.println("Caso numero: " + (i + 1));
			for (int i2 = 0; i2 < 3; i2++) {
				System.out.println("Favor informar o numero da posição " + (i2 + 1) + " :");
				numeros[i2] = scanner.nextFloat();
			}
			scanner.close();

			numeros[0] = numeros[0] * 2;
			numeros[1] = numeros[0] * 3;
			numeros[2] = numeros[0] * 5;

			float media = (numeros[0] + numeros[1] + numeros[2]);
			media = media / 10;
			System.out.println("A media ponderada dos valores é: " + media);

		}

	}

}
