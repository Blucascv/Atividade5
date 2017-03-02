package ListaEstrutura;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		for(int i = 0; i<10; i++){
			System.out.println("Digite um numero: ");
			int num=leitor.nextInt();
			
			if(num%2 == 0){
				System.out.println("Numero Par!");
			}else{
				System.out.println("Numero Impar!");
			}
		}
		
		leitor.close();
		
	}
}
