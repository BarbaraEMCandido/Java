package exercicos_dia_3;

import java.util.Scanner;

public class DivisaoResto5 {
	public static void main(String args[]){
		
		Scanner leia = new Scanner(System.in);
		
		int x;
		
		for (x = 1000; x <= 1999; x++) {
			if (x%11 == 5) {
				System.out.println(x);
			}						
		}
	}
}
