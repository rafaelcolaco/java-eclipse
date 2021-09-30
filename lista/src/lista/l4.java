package lista;

import java.util.Scanner;

public class l4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Digite a primeira nota: ");
		Double num1 = scan.nextDouble();
		System.out.print ("Digite a segunda nota: ");
		Double num2 = scan.nextDouble();
		System.out.print ("Digite a terceira nota: ");
		Double num3 = scan.nextDouble();
		System.out.print ("Digite a quarta nota: ");
		Double num4 = scan.nextDouble();
		scan.close();
		double media = ((num1+num2+num3+num4)/4);
		System.out.println("A média foi: " + media);

	}

}
