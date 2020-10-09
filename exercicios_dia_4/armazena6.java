package atividades_dia_4;

import java.util.Scanner;

public class armazena6 {
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int[] A = {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma = A[0] + A[1] + A[5];
		System.out.println("A soma dos elementos A[0], A[1] e A[5] é: " + soma);
		
		//Atribuindo valor a um elemento de um vetor
		A[4] = 100;
		
		System.out.println("\nO novo vetor A é: ");
		for  (int i = 0; i < A.length; i++) {
			System.out.println(A[i] + " ");
		}
		System.out.println();
	}
}
 