package lista;

import java.util.Scanner;

public class l14 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o valor da hora: ");
		float valorhora = input.nextFloat();
		System.out.print("Digite o número de horas trbalhadas: ");
		float horastrabalhadas = input.nextFloat();
		float salariobruto = valorhora * horastrabalhadas;
		input.close();
		float imposto= (salariobruto / 100) * 11;
		float salario1 = salariobruto - imposto;
		float inss= (salario1 / 100) * 8;
		float salario2 = salario1 - inss;
		float sind= (salario2 / 100) * 5;
		float salarioliq= salario2 - sind;
		System.out.println("O salário bruto foi de: R$" + salariobruto);
		System.out.println("O valor do imposto de renda foi: R$" +imposto);
		System.out.println("O valor pago ao INSS foi: R$" + inss);
		System.out.println("O valor pago ao sidicato foi: R$" + sind);
		System.out.println("O seu salário liquido foi: R$" + salarioliq);
	}

}
