package logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioSeq2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double raio,area,pi=3.14159;
		DecimalFormat df = new DecimalFormat("0.####");

		
		System.out.println("Favor informe o raio do cirulo:");
		raio = scanner.nextDouble();
		scanner.close();
		
		area = pi*(Math.pow(raio,2));
		
		System.out.println("A="+df.format(area));
		
	}
}
