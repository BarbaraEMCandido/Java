package atividades_Dia_2;

import java.util.*;

public class OrdemCrescente {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int x, y, z, A, B, C;
		
		 System.out.printf("Digite o primeiro n�mero: \n");
		 x = leia.nextInt();
		 
		 System.out.printf("Digite o segundo n�mero: \n");
		 y = leia.nextInt();
		 
		 if (x >= y) {
			 A = x;
			 B = y;
		 } else {
			 A = y;
			 B = x;
		 }
		 
		 System.out.printf("Digite o terceiro n�mero: \n");
		 z = leia.nextInt();
		 C = z;
		 
		 if (C >= A) {
			 System.out.println("A ordem crescente dos n�meros �: " + B + ", " + A + ", " + C);
		 }
		 else if (C < A && C >= B) {
			 System.out.println("A ordem crescente dos n�meros �: " + B + ", " + C + ", " + A);
		 }
		 else if (C < B) {
			 System.out.println("A ordem crescente dos n�meros �: " + C + ", " + B + ", " + A);
		 }
	}
}




