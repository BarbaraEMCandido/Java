package exercicos_dia_3;

import java.util.Scanner;

public class MediaMultiplo3 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int x;
		float media, soma = 0, cont = 0;
		
		do {
			System.out.println("Digite um valor: ");
			x = leia.nextInt();
			if (x%3 == 0 && x != 0) {
				soma = soma + x;
				cont++;
				System.out.println(soma + ", " + cont);
				
			}
		} while (x != 0);
		media = soma/cont;
		System.out.printf("A média dos valores digitados é igual a %.2f", media);
	}
}
