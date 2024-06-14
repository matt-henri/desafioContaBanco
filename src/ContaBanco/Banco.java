package ContaBanco;

import java.util.Scanner;

public class Banco {
	
	private String nome;
	private String sobrenome;
	private String cpf;
	private double saldo;
	
	public Banco (String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.saldo = 0.0;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
		System.out.println("Deposito de R$ " + valor + " realizado com sucesso.");
	}
	
	public void sacar (double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para o saque. ");
		}
	}
	
	public void exibirMenu() {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("\n•     MENU     •");
			System.out.println("Escolha uma opçao:");
			System.out.println("1. Consultar Saldo");
			System.out.println("2. Realizar o Depósito");
			System.out.println("3. Realizar o Saque");
			System.out.println("4. Encerar");
			opcao = scanner.nextInt();
		} while (opcao != 4);
	}
	
	
	
		

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
}
