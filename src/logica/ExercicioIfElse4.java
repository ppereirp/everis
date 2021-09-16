package logica;

import java.util.Scanner;

public class ExercicioIfElse4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int duracao = 0;

		System.out.println("Favor informar a hora de inicio do jogo: ");
		int horaInicial = scanner.nextInt();
		System.out.println("Favor informar a hora de fim do jogo: ");
		int horaFinal = scanner.nextInt();
		scanner.close();

		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = (24 - horaInicial) + horaFinal;
		}
		System.out.println("A duração do jogo foi de: " + duracao + "HRS");
	}
}
