package lista;

import java.util.Scanner;

public class l12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite sua altura: ");
		float altura = scan.nextFloat();
		System.out.print("Digite seu sexo (digite apenas f ou m): ");
		char sexo = scan.next().charAt(0);		
		scan.close();		
		float pesoIdeal = 0;
		if(sexo == 'm') {
			pesoIdeal = (72.7f * altura) - 58;
		} else if (sexo == 'f') {
			pesoIdeal = (62.1f * altura) - 44.7f ;
		}
		
		System.out.println("O seu peso ideal é: " + pesoIdeal + "Kg" );
	}

}
