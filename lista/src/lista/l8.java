package lista;

import java.util.Scanner;

public class l8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite quanto voc� ganha por hora: ");
		double valorHr = scan.nextDouble();
		System.out.print("Digite quantas horas voc� trabalha por m�s: ");
		double horasMes = scan.nextDouble(); 
		scan.close();
		double salario = (valorHr * horasMes);
		System.out.println("O seu sal�rio mensal �: R$" + salario);

	}

}
