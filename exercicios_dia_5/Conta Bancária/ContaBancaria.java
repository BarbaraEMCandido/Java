package Atividades_dia_5;

public class ContaBancaria {
	
	private double Agencia;
	double Conta;
	private String TipoConta;
	private float Saldo = 100;
	
	public void DadosConta (double ag, double conta) {
		
		
		Agencia = ag;
		Conta = conta;
		System.out.printf("Agência: %.0f  \nConta: %.0f \n ", Agencia, Conta);
	}
	
	public void  Conta (int i) {
		
		if (i == 0) {
			TipoConta = "Conta Corrente";
		}
		
		if (i == 1) {
			TipoConta = "Conta Poupança";
		}
		
		System.out.println("Tipo de conta: " + TipoConta);
	} 
	// registra movimentação na conta e printa o novo saldo.
	public void Saldo (double movimentacao) {
		double SaldoFinal;
		
		SaldoFinal = this.Saldo + movimentacao;
		System.out.printf("Saldo atual: R$ %.00f ", SaldoFinal);
	}
	
}

