package logica;

import java.util.Scanner;

public class ExercicioFor4 {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Favor informar a quantidade de divis�es a serem realizadas: ");
		int qtdPares = scanner.nextInt();
		
		for (int i = 0; i < qtdPares; i++) {
			System.out.println("Divis�o numero: "+(i+1));
			System.out.println("Favor informar o numerador: ");
			int numerador = scanner.nextInt();
			System.out.println("Favor informar o denominador: ");
			int denominador = scanner.nextInt();
			scanner.close();
			
			if (denominador == 0){
				System.out.println("Divis�o impossivel");
			}else {
				float resultadoDivisao = numerador/denominador;
				System.out.println("Divis�o: "+resultadoDivisao);
			}
		}
	}

}
