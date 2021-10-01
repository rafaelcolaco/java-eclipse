package lista;

import java.util.Scanner;

public class l16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o tamanho da área a ser pintada: ");
		double area = input.nextDouble();
		input.close();
		double litro = area / 6;
		double latas = Math.ceil(litro /18) ;
		double custo = latas * 80;
		double galao = Math.ceil(litro /3.6);
		double custogalao = galao * 25;
		System.out.println("precisará de " + latas + " latas" + " e custará R$ " + custo);
		System.out.println("precisará de " + galao + " galões" + " e custará R$ " + custogalao);

	}

}
