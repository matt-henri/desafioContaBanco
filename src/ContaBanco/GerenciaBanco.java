package ContaBanco;

import java.util.Scanner;

public class GerenciaBanco extends Banco {
		private GerenciaBanco(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Seja Bem-Vindo ao sistema Bancário DIO");
			System.out.print("Qual o seu nome: ");
			String nome = scanner.nextLine();
			System.out.print("Qual o seu sobrenome: ");
			String sobrenome = scanner.nextLine();
			System.out.print("Digite seu CPF: ");
			String cpf = scanner.nextLine();
			
			Banco conta = new Banco(nome, sobrenome, cpf);
			
			conta.exibirMenu();
			
			System.out.println("Teste do Desafio DIO Conta Bancária encerrado!");
			
			scanner.close();
		
		
		
		
		
		}
}
