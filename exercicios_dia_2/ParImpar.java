package atividades_Dia_2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class ParImpar {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
				
		double x, resto, quadx, raizx;
		
		System.out.println("Digite um número: ");
		x = leia.nextDouble();
		resto = x%2;
		
		if (resto == 0){
			raizx = Math.pow(x, 0.5);
			BigDecimal bd = new BigDecimal(raizx).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("O número é par, e sua raíz é igual a " + bd);
		} 
		else {
			quadx = Math.pow(x, 2);
			BigDecimal bd = new BigDecimal(quadx).setScale(2, RoundingMode.HALF_EVEN);
			System.out.println("O número é ímpar, e seu quadrado é igual a " + bd);
		}
	}
}
