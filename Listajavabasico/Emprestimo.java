package Listajavabasico;

import java.util.Scanner;

public class Emprestimo {
	private String nomeUsuario;
	private int idade;
	private float valorEmprestimo, percentualJurosMes;
	private int mesesParaPagar;
	
	
	public void Imprimir(){
		
		System.out.println("Nome do Cliente: "+nomeUsuario);
		System.out.println("Idade do Cliente: "+idade);
		System.out.println("Valor do emprestimo: "+valorEmprestimo);
		System.out.println("Percentual de juros mensal: "+percentualJurosMes);
		System.out.println("Meses para pagar: "+mesesParaPagar);
		
	}
	
	public float calcularEmprestimo(int idade, int mesesParaPagar, float percentualJurosMes, float valorEmprestimo){
	
		if (18<=idade && idade<23) 
		{
			valorEmprestimo += (valorEmprestimo/mesesParaPagar)/ percentualJurosMes;
		} 
		
		if (23<idade && idade<=33) 
		{
			valorEmprestimo = (valorEmprestimo * 10)/100;
		}
		
		else
		{
			System.out.println("Não é possivel efetuar o calculo do emprestimo");
		}
		
		return valorEmprestimo;
	}
	public void main(String [] args){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite seu Nome: ");
		nomeUsuario = leitor.nextLine();
				
		System.out.println("Digite sua idade: ");
		idade = leitor.nextInt();
		
		System.out.println("Informe o valor do emprestimo: ");
		valorEmprestimo = leitor.nextFloat();
		
		System.out.println("Digite o percentual de juros: ");
		percentualJurosMes = leitor.nextFloat();
		
		System.out.println("Digite o praso de pagamento (meses): ");
		mesesParaPagar = leitor.nextInt();
		
		calcularEmprestimo(idade, mesesParaPagar, percentualJurosMes, valorEmprestimo);
		Imprimir();
		leitor.close();
	}
	
}
