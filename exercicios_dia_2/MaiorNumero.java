package atividades_Dia_2;

import java.util.*;

public class MaiorNumero {
	public static void main(String args[]) {
		
		int x, y, z;
		 Scanner leia = new Scanner(System.in);
		 
		 System.out.printf("Digite o primeiro n�mero: \n");
		 x = leia.nextInt();
		 
		 System.out.printf("Digite o segundo n�mero: \n");
		 y = leia.nextInt();
		 
		 System.out.printf("Digite o terceiro n�mero: \n");
		 z = leia.nextInt();
		 
		 if(x >= y && x > z) {
			 System.out.printf("O maior n�mero �: %d", x);
		 }
		 	else if (y >= z && y > x) {
		 		System.out.printf("O maior n�mero �: %d", y);
		 	}
		 	else if (z >= x && z > y) {
		 		System.out.printf("O maior n�mero �: %d", z);
		 	}
	}
}
