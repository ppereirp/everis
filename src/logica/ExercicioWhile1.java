package logica;

import java.util.Scanner;

public class ExercicioWhile1 {
	
	/*Escreva um programa que repita a leitura de uma senha at� que ela seja v�lida.
	 *  Para cada leitura de senha
	incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for 
	informada corretamente deve ser
	impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a 
	senha correta � o valor 2002.*/
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int senha = 2002, senhafInformada;
		
		do {
		System.out.printf("Favor informar a senha: ");
		senhafInformada = scanner.nextInt();
		if (senhafInformada != senha) {
			System.out.printf("Senha Invalida\n");
		}else {
			System.out.printf("Acesso Permitido\n");
		}
		
		}while (senhafInformada != senha);
		scanner.close();
		
		
		
		
	}

}
