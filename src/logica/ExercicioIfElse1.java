package logica;

import java.util.Scanner;

public class ExercicioIfElse1 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar um numero: ");
		int numero = scanner.nextInt();
		scanner.close();
		
		if(numero >= 0) {
			System.out.println("Numero Não negativo");
		}else {
			System.out.println("Numero negativo");
		}
	}
}
