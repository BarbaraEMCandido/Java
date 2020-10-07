package Atividades;

import java.util.Scanner;

public class expressao_numerica {
	public static void main (String[] args) {
		
		int A, B, C;
		double R, S, D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Para o cálculo da nossa expressão matemática, digite 3 números inteiros e positivos: ");
		
		System.out.println("Digite o primeiro número: ");
		A = ler.nextInt();
		
		System.out.println("Digite o segundo número: ");
		B = ler.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		C = ler.nextInt();

		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S)/2;
		
		System.out.println("O resultado da nossa expressão numérica é: ");
		System.out.println(D);
				
		
	}

}
