package exercicios;

import java.util.Scanner;

public class Exercicio02_lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Insira o código do produto (use números de 1 a 6):");
     int codigo = scanner.nextInt();
     
     System.out.println("Insira a quantidade que você deseja comprar:");
     int quantidade = scanner.nextInt();
     
     scanner.close();
     
     String nomeProduto = "";
     double precoUnitario = 0.0;
     
     switch (codigo) {
     
     case 1:
    	 nomeProduto = "Cachorro Quente";
    	 precoUnitario = 10.00;
    	 break;
    	 
     case 2:
    	 nomeProduto = "X-Salada";
    	 precoUnitario = 15.00;
    	 break;
    	 
     case 3:
    	 nomeProduto = "X-Bacon";
    	 precoUnitario = 18.00;
    	 break;
    	 
     case 4:
    	 nomeProduto = "Bauru";
    	 precoUnitario = 12.00;
    	break;
    	
     case 5:
    	 nomeProduto = "Refrigerante";
    	 precoUnitario = 8.00;
    	 break;
    	 
     case 6:
    	 nomeProduto = "Suco de Laranja";
    	 precoUnitario = 13.00;
    	 break;
    	 default:
    		 System.out.println("Código de produto inválido");
    		 return;
     }
     double valorTotal = quantidade * precoUnitario;
     
     System.out.println("Produto: " + nomeProduto);
     System.out.println("Valor Toral: R$ " + valorTotal);
	}
}
     
     
	