package lista;

import java.util.Scanner;

public class l6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o raio do c�rculo: ");
		double raio = scan.nextDouble();
		scan.close();
		double area = Math.PI * (raio * raio);
		System.out.println(("A �rea �: " + area));
		
	}

}
