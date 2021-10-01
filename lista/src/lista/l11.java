package lista;

import java.util.Scanner;

public class l11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();
		scan.close();
		float pesoIdeal = (72.7f * altura) -58f;
		System.out.println("seu peso ideal é: " + pesoIdeal + "Kg ");

	}

}
