package ContaBanco;

public abstract class Conta implements iConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;


	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println("=== Extrato Conta Corrente ===");	
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


	
}
