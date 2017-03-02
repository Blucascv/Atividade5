package ListaEstrutura;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		int refri = 3;
		double precoLitros = 2.5;
		
		System.out.println("Informe a quantidade de litros de gasolina: ");
		double quantidade = leitor.nextDouble();
		
		double valorTotal = quantidade*precoLitros;
		System.out.println("Valor total da conta: " + (valorTotal + (2*refri)));
		
		leitor.close();
	}
}
