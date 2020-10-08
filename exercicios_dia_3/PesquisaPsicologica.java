package exercicos_dia_3;

import java.util.Scanner;

public class PesquisaPsicologica {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		int idade, sexo, comport, contCal = 0, contFemNer = 0, contMasAgr = 0, contOutrCal = 0, contNerv40 = 0, contCal18 = 0, x = 1;
		
		
		while (x <= 5) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n Qual o seu sexo? Digite o número referente à opção desejada: \n 1 - Feminino \n 2 - Masculino \n 3 - Outros");
			sexo = leia.nextInt();
			
			System.out.println("Você se considera uma pessoa: \n 1 - Calme \n 2 - Nervose \n 3 - Agressive");
			comport = leia.nextInt();
			if (comport == 1) {
				contCal++;
			}
			if (sexo == 1 && comport == 2) {
				contFemNer++;
			}
			if (sexo == 2 && comport == 3) {
				contMasAgr++;
			}
			if (sexo == 3 && comport == 1) {
				contOutrCal++;
			}
			if (idade > 40 && comport == 2) {
				contNerv40++;
			}
			if (idade < 18 && comport == 1) {
				contCal18++;
			}
			x++;
		}
		System.out.println("Quantidade de pessoas calmas: " + contCal);
		System.out.println("Quantidade de pessoas do sexo feminino nervosas: " + contFemNer);
		System.out.println("Quantidade de pessoas do sexo masculino agressivas: " + contMasAgr);
		System.out.println("Quantidade de pessoas de outros sexos calmas: " + contOutrCal);
		System.out.println("Quantidade de pessoas nervosas acima de 40 anos: " + contNerv40);
		System.out.println("Quantidade de pessoas calmas abaixo de 18 anos: " + contCal18);
	}
}
