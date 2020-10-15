package Atividades_dia_6;

import java.text.NumberFormat;

public class Administrador extends Pessoa {
	double ajudaDeCusto;
	
	public Administrador (String nome, String endereco, String cpf,int telefone,int idade, double ajudaDeCusto) {
		super(nome, endereco, cpf, telefone, idade);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public void totalAjudaCustos(double custoPassagens, double custoAlimentacao, double custoAcomodacao) {
		double totalCusto;
		totalCusto = custoPassagens + custoAlimentacao + custoAcomodacao;
		this.ajudaDeCusto = totalCusto;
	}
	
	public String formatarMoeda () {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(ajudaDeCusto);
		return formatoMoeda;
	}
	
	public void Mostrar() {
		System.out.println("\nNome do empregado: "+ getNome() + "\n" + "CPF: " + getCpf()+"\n"+"Idade: " +
		getIdade() + "\n" + "Telefone: " + getTelefone() + "\n"  +"Endereço: " + getEndereco() + "\nAjuda de Custo: " 
		+ this.formatarMoeda());
	}
}
