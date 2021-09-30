package lista;
import java.util.Scanner;

public class l2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print ("Digite um número: ");
		int num = scan.nextInt();
		scan.close();
		System.out.println("O número informado foi: " +num);
	}

}
