package ListaEstrutura;

import java.util.Scanner;

public class Questao6 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a salario bruto:");
		double salBruto = leitor.nextDouble();

		System.out.println("Digite a prestacao:");
		double prest = leitor.nextDouble();

		double prestMAX = salBruto * 0.3;

		if (prest < prestMAX) {
			System.out.println("Emprestimo concedido!");
		} else {
			System.out.println("Emprestimo nao consedido!");
		}

		leitor.close();
	}
}
