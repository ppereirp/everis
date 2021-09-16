package logica;

import java.util.Scanner;

public class ExercicioSeq6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] pontos = new double[3];
		double pi = 3.14159;
		
		for (int i = 0; i < pontos.length; i++) {
			System.out.println("Favor informar o ponto numero "+(i+1)+" de 3");
			pontos[i] = scanner.nextDouble();
						
		}
		scanner.close();
		
		double auxTrap = (pontos[0]+pontos[1]);
		System.out.println("TRIANGULO: "+((pontos[0]*pontos[2])/2));
		System.out.println("CIRCULO: "+((Math.pow(pontos[2], 2)*pi)));
		System.out.println("TRAPEZIO: "+((auxTrap*pontos[2])/2));
		System.out.println("QUADRADO: "+(Math.pow(pontos[1], 2)));
		System.out.println("RETANGULO: "+(pontos[0]*pontos[1]));

		
	}
}
