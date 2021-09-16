package logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioIfElse8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double salario = 0, impostoRenda = 0;
		DecimalFormat df = new DecimalFormat("0.##");


		System.out.println("Favor informar o salário: ");
		salario = scanner.nextDouble();
		scanner.close();
		
		
		scanner.close();
		if (salario <= 2000) {
			System.out.println("Isento");
			System.exit(0);
			
		} else if(salario > 2000 && salario <= 3000){
			impostoRenda = salario - 2000;
			impostoRenda = impostoRenda * 0.08;

		} else if(salario > 3000 && salario <= 4500){
			impostoRenda = salario - 3000;
			impostoRenda = (impostoRenda * 0.18)+80;

		} else {
			impostoRenda = salario - 4500;
			impostoRenda = (impostoRenda * 0.28)+350;

		}
		
		System.out.println("R$"+df.format(impostoRenda));

	}
}
