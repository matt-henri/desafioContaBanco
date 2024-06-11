package ContaBanco;

public class ContaPoupanca extends Conta{
		
	private static int SEQUENCIAL = 1;

	public ContaPoupanca() {
		super.agencia = AGENCIA_PADRAO;
		super.numero = SEQUENCIAL++;
	}
	
}
