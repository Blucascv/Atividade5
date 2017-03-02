package ListaEstrutura;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Informe a tabuada: ");
		int num = leitor.nextInt();

		for (int i = 1; i < 101; i++) {
			System.out.println(num + " x" + i + " = " + (num * i));
		}

		leitor.close();
	}
}
