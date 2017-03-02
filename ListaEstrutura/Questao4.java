package ListaEstrutura;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		while (true) {
			System.out.println("Informe o salario do funcionario: ");
			int salario = leitor.nextInt();
			if (salario > 500) {
				System.out.println("Voce recebeu um aumento de 20%");
				System.out.println("SalarioAtual: " + (salario + (salario * 0.2)));
			}else if(salario==0){
				break;
			}else {
				System.out.println("Não recebeu um aumento de 20%");
			}
		}
	}
}
