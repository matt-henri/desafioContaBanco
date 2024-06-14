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
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
			
			switch(opcao) {
				case 1:
					System.out.println("Saldo: R$ " + consultarSaldo());
					break;
				case 2: 
					System.out.println("Digite o valor do deposito: ");
					double ValorDeposito = scanner.nextDouble();
					depositar(ValorDeposito);
					break;
				case 3:
					System.out.println("Digite o valor do saque:");
					double ValorSaque = scanner.nextDouble();
					sacar(ValorSaque);
					break;
				case 4:
					System.out.println("Encerrando...");
					break;
					default:
					System.out.println("Opção invalida!");
			}	
			
			
		} while (opcao != 4);
		
		scanner.close();
	}
	
}
