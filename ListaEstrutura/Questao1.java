package ListaEstrutura;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		
		Scanner leitor=new Scanner(System.in);
		System.out.println("Informe o salario do funcionario: ");
		float salario=leitor.nextFloat();
		
		System.out.println("Informe o percentual de aumento: ");
		float percentual=leitor.nextFloat();
		
		System.out.println("Valor do aumento: " + salario/percentual);
		System.out.println("Novo salario: " + (salario + (salario/percentual)));
		
		leitor.close();
	}
}
