package Atividades_dia_6;

public class TesteAdministradoreVendedor {
	public static void main (String args []) {

		Administrador adm = new Administrador("Bárbara", "Rua dos Ipês, 45 - SP", "11122233344", 119999, 35, 500.00);
		adm.Mostrar();
		adm.totalAjudaCustos(1200.00, 500.00, 700.00);
		adm.Mostrar();
		
		Vendedor vend = new Vendedor("Bárbara", "Rua dos Ipês, 45 - SP", "11122233344", 119999, 35, 2000.00, 20, 1500.00);
		vend.Mostrar();
		
	}
}
