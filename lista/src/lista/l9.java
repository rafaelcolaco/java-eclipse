package lista;

import java.util.Scanner;


public class l9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite um n�mero inteiro: ");
		int num1 = scan.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		int num2 = scan.nextInt();
		System.out.print("Digite um valor real: ");
		double num3 = scan.nextDouble();
		scan.close();
		int a = (num1*2) + (num2/2);
		double b = (num1*3) + num3;
		double c = num3*num3*num3;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
	}

}
