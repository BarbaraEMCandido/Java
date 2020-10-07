package Atividades;

import java.util.Scanner;

public class calculo_de_medias {
	public static void main (String args[]) {
		
		short p1, p2, p3, pTotal;
		float n1, n2, n3, nFinal;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextInt();
		
		p1 = 2;
		p2 = 3;
		p3 = 5;
		
		pTotal = (short) (p1 + p2 + p3);
		nFinal = ((n1*p1)+(n2*p2)+(n3*p3))/pTotal;
		
		System.out.println("A média final é: ");
		System.out.println(nFinal);
		
		
		
		
	}

}
