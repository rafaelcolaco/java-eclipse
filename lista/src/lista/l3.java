package lista;

import java.util.Scanner;

public class l3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Digite um número: ");
		int num = scan.nextInt();
		System.out.print ("Digite outro número: ");
		int num2 = scan.nextInt();
		scan.close();
		System.out.println(num+num2);	

	}

}
