package logica;

import java.util.Scanner;

public class ExercicioFor7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Favor informar um numero: ");
		int numero = scanner.nextInt();
		scanner.close();
		
		
		for (int i = 1; i <= numero; i++ ) {
			
			System.out.print(i+" ");
			System.out.print(Math.pow(i,2)+" ");
			System.out.println(Math.pow(i,3)+" ");
		}
	}

}
