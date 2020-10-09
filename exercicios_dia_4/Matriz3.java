package atividades_dia_4;

import java.util.Scanner;

public class Matriz3 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		 int[][] matriz = new int[3][3];
		 int soma = 0;
		 
		 for (int i = 0; i < 3; i++) {
			 for (int j = 0; j < 3; j++) {
				 System.out.printf("Digite o elemento da matriz[%d]%d]", i, j);
				 matriz[i][j] = scan.nextInt();
				 
				 if (matriz[i][j] > 10) {
					 soma++;
				 }
			 }
		 }
		 		 
		 System.out.println("A matriz apresenta " + soma + " valores maiores que 10");
	}
}
