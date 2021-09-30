package lista;

import java.util.Scanner;

public class l5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o valor em metros: ");
		double valorM = scan.nextDouble();
		scan.close();
		double valorCm = valorM * 100;
		System.out.println(valorCm +"cm");

	}

}
