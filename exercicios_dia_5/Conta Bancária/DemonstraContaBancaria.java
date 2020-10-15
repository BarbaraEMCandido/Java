package Atividades_dia_5;

public class DemonstraContaBancaria {
	public static void main (String args []) {
				
		ContaBancaria cb = new ContaBancaria ();
		
		cb.Conta(1);
				
		cb.DadosConta(Math.random() * 3000, Math.random() * 31347);
				
		cb.Saldo(Math.random() * 1000000);
	}

}
