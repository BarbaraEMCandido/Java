package atividades_Dia_2;

import java.util.*;

public class ClassificacaoIdade {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		String cat1, cat2, cat3;
		cat1 = "Infantil";
		cat2 = "Juvenil";
		cat3 = "Adulto";
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Você está na categoria: "+ cat1);
		}
			else if (idade >= 15 && idade <= 17) {
				System.out.println("Você está na categoria: "+ cat2);
			}
			else if (idade >= 18 && idade <= 25) {
				System.out.println("Você está na categoria: "+ cat3);
			}
			else {
				System.out.println("Sua idade não se enquadra em nenhuma categoria existente.");
			}
	}
}
