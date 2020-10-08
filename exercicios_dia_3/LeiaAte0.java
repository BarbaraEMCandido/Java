package exercicos_dia_3;

import java.util.Scanner;

public class LeiaAte0 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int x, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			soma = soma + x;
			
		} while (x != 0);
		System.out.println("A soma dos números digitados é: " + soma);
	}
}
