package lista;

import java.util.Scanner;

public class l13 {
	final static float peso_base = 50f;
	final static float Multa_kg = 4f;


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite o peso dos peixes em Kg: ");
		float pesopeixe = input.nextFloat();
		input.close();
		float excesso = pesopeixe - peso_base;
		if (excesso >= 0f) 
		{
			System.out.println("o excesso foi " + excesso +"kg" );
			float multa = 4f * excesso;
			System.out.println("a multa sera de R$" + multa); 
		}
			else {
				System.out.println("não houve excesso");
		}
		


	}

}
