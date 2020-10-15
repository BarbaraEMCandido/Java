package Atividades_dia_5;

public class Cliente {
	
	private String Nome, Endereco;
	private long Cpf,  Telefone;
	private int Ddd;
	 
	
	
	public void Cadastro(String nome, String end, long cpf, int ddd, long contato) {
		Nome = nome;
		Endereco = end;
		Cpf = cpf;
		Telefone = contato;
		Ddd = ddd;
	}
	
	 public void setNome(String nome){
	     Nome = nome;
     }
	 
	 public void setEndereco(String end){
	     Endereco = end;
     }

	 public void setCpf(long cpf){
	     Cpf = cpf;
     }
	 public void setContato(long contato, int ddd){
		 Ddd = ddd;
		 Telefone = contato;
	 }

	 


	public void Mostrar() {
		System.out.println("Nome: " + Nome);
		System.out.println("CPF: " + Cpf);
		System.out.println("Endereço: " + Endereco);
		System.out.println("Telefone para contato: (" + Ddd + ") " + Telefone);
		System.out.println("\n \n \n");
	} 
	
}

