package exercicos_dia_3;

import java.util.Scanner;

public class QuantidadeParEImpar {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int contPar = 0, contImpar = 0, x, i;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Digite um número: ");
			x = leia.nextInt();
			
			if (x%2 == 0) {
				contPar++;
			} else {
				contImpar++;
			  }
		}
		
		System.out.println("Foram digitados " + contPar + " números pares e " + contImpar + " números ímpares." );
	}
}
