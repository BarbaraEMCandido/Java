package Atividades;

import java.util.Scanner;

public class expressao_numerica {
	public static void main (String[] args) {
		
		int A, B, C;
		double R, S, D;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Para o c�lculo da nossa express�o matem�tica, digite 3 n�meros inteiros e positivos: ");
		
		System.out.println("Digite o primeiro n�mero: ");
		A = ler.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		B = ler.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		C = ler.nextInt();

		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = (R+S)/2;
		
		System.out.println("O resultado da nossa express�o num�rica �: ");
		System.out.println(D);
				
		
	}

}
