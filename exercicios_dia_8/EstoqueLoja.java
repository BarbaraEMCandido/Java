package atividades_dia_8;

import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings("unused")
public class EstoqueLoja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList estoqueLoja = new ArrayList();
		int opc;
		String novoProd, produto, atualProd; 
		
		do {
			System.out.println("/t Digite uma operação: " );
			System.out.println();
			System.out.println(" 1 - Armazenar novo produto ao estoque");
			System.out.println(" 2 - Atualizar produto do estoque");
			System.out.println(" 3 - Remover produto do estoque");
			System.out.println(" 4 - Visualizar estoque");
			System.out.println(" 5 - Encerrar");
			System.out.println();
			
			opc = leia.nextInt();

			switch(opc) {
			
			case 1:

				System.out.print("Digite o produto a ser armazenado no estoque: \n");
	
				novoProd = leia.next();
				estoqueLoja.add(novoProd);
				break;

			case 2:

				System.out.print("Digite o produto que será atualizado: \n");

				atualProd = leia.next();
				
					if (estoqueLoja.contains(atualProd)) {
						estoqueLoja.remove(atualProd);
						System.out.println("Digite o novo produto: \n");
						novoProd = leia.next();
						estoqueLoja.add(novoProd);
					} else {
						System.out.println("Produto indisponível!\n");
					}
				break;
			
			case 3:

				System.out.println("Digite o produto que será removido: \n");
				produto = leia.next();
				
					if (estoqueLoja.contains(produto)) {
						estoqueLoja.remove(produto);
					}else {
						System.out.println("Produto indisponível! \n");
					}
				break;

			case 4:

				System.out.println("Produtos em estoque: \n");
				System.out.println("\t" + estoqueLoja);
				break;
				
			default:
				System.out.println("Programa finalizado.");
			}

			}while(opc >= 1 && opc <5);
		
	}

}
