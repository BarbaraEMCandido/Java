package Atividades_dia_5;

public class DemonstraCliente {
	public static void main (String args[] ) {
		
		Cliente cliente = new Cliente();
		
		cliente.Cadastro("Bárbara", "Rua dos Umbus, 492, Itapevi - SP",  4339355555l, 11, 946888888l);
		cliente.Mostrar();
		
		cliente.setEndereco("Praça Palmares, 54, Santos - SP");
		cliente.Mostrar();
		
		cliente.setContato(927384959l, 13);
		cliente.Mostrar();
	}
}
