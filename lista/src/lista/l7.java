package lista;

import java.util.Scanner;

public class l7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o tamanho de um dos lados do quadrado em cm: ");
		double lado = scan.nextDouble();
		scan.close();
		double areaQuadrado = lado * lado;
		System.out.println("A ?rea do quadrado ?: " + areaQuadrado + "cm?");	

	}

}
