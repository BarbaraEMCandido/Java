package Atividades;

import java.util.Scanner;

public class custo_total_carro {
	public static void main (String args[]) {
		
		float custoFabrica;
		double porImpostos, porDistribuidor, custoTotal;
				
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o valor de f�brica do carro: ");
		custoFabrica = ler.nextInt();
		
		porDistribuidor = 0.45;
		porImpostos = 0.28;
		
		custoTotal = custoFabrica + (custoFabrica*porDistribuidor) + (custoFabrica*porImpostos);
		
		System.out.println("O custo total do carro � de R$: ");
		System.out.println(custoTotal);
		
		
	}

}
