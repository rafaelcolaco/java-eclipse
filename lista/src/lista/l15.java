package lista;

import java.util.Scanner;

public class l15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanho da ?rea a ser pintada: ");
		double area = input.nextDouble();
		input.close();
		double litro = area / 3;
		double latas = Math.ceil(litro /18) ;
		double custo = latas * 80;
		System.out.println("precisar? de " + latas + " latas" + " e custar? R$ " + custo);
	}

}
