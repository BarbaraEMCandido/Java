package exercicos_dia_3;

import java.util.Scanner;

public class Idade21E50 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int idade, cont21 = 0, cont50 = 0;
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			if (idade < 21) {
				cont21++;
			}
			else if (idade > 50) {
				cont50++;
			}
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
		}
		System.out.println(cont21 + " pessoa(s) com menos de 21 anos.");
		System.out.println(cont50 + " pessoa(s) com mais de 50 anos.");
	}
}
