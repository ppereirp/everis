package logica;

import java.util.Scanner;

public class ExercicioSeq4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroFunc,horasTrabalhadas;
		double vlrHora,vlrSalario;
		
		System.out.println("Favor informar o numero do funcionario: ");
		numeroFunc = scanner.nextInt();
		System.out.println("Favor informar a quantidade de horas trabalhadas: ");
		horasTrabalhadas= scanner.nextInt();
		System.out.println("Favor informar o valor da hora trabalhada: ");
		vlrHora= scanner.nextDouble();
		
		scanner.close();
		
		vlrSalario = vlrHora * horasTrabalhadas;
		
		System.out.println("Number = "+numeroFunc);
		System.out.println("Salary = U$"+vlrSalario);
	}
}
