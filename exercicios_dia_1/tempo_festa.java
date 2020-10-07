package Atividades;

import java.util.Scanner;

public class tempo_festa {
	public static void main (String args[]) {
		
		int tempoSegundos, segundo, hora, minuto;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o número de segundos da sua festa: ");
		tempoSegundos = ler.nextInt();
		
		hora = tempoSegundos/3600;
		minuto = (tempoSegundos%3600)/60;
		segundo = (tempoSegundos%3600)%60;
		
		System.out.println("O tempo da sua festa é de: ");
		System.out.println(hora);
		System.out.println("horas, ");
		System.out.println(minuto);
		System.out.println("minutos, e ");
		System.out.println(segundo);
		System.out.println("segundos.");
		
		
		
	}

}
