package logica;

import java.util.Scanner;

public class ExercicioIfElse2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar um numero: ");
		int numero = scanner.nextInt();
		scanner.close();
		
		if(numero % 2 ==0) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero impar");
		}
		
	}
}
