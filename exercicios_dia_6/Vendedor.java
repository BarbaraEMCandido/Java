package Atividades_dia_6;

import java.text.NumberFormat;

public class Vendedor extends Pessoa {
	double valorVendas;
	double comissao;
	double salario;
	
	public Vendedor (String nome, String endereco, String cpf,int telefone,int idade, double valorVendas, double comissao, double salario) {
		super(nome, endereco, cpf, telefone, idade);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double salarioTotal () {
		double totalSalario = this.salario + this.valorVendas*(this.comissao/100);
		this.salario = totalSalario;
		return totalSalario;
	}
	
	public String formatarMoeda () {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(this.salarioTotal());
		return formatoMoeda;
	}
	
	public void Mostrar() {
		System.out.println("\nNome do vendedor: " + getNome() +"\n" + "CPF: " + getCpf() + "\n" + 
	    "Idade: " + getIdade() + "\n" + "Telefone: " + getTelefone() + "\n" + "Endereço: "+  getEndereco() 
	    + "\nSalário total (com comissão): " + this.formatarMoeda());
	}
	
	
	
}

