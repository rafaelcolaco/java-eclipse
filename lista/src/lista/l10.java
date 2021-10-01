package lista;

import java.util.Scanner;

public class l10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();
		scan.close();
		float pesoIdeal = (altura * 72.7f) - 58f;	
		System.out.println("Seu peso ideal é: " + pesoIdeal);
	}

}
