package logica;

import java.util.Scanner;

public class ExercicioIfElse7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double coordX, coordY;
		String quadrante;

		System.out.println("Favor informar a coordenada X: ");
		coordX = scanner.nextDouble();
		System.out.println("Favor informar a coordenada Y: ");
		coordY = scanner.nextDouble();
		scanner.close();

		if (coordX == 0 && coordY == 0) {
			quadrante = "Origem";
		} else if (coordX == 0) {
			quadrante = "Eixo X";
		} else if (coordY == 0) {
			quadrante = "Eixo Y";
		} else if (coordX > 0 && coordY > 0) {
			quadrante = "Q1";
		} else if (coordX < 0 && coordY > 0) {
			quadrante = "Q2";
		} else if (coordX < 0 && coordY < 0) {
			quadrante = "Q3";
		} else {
			quadrante = "Q4";
		}

		System.out.println(quadrante);
	}
}
