package exercicios;

import java.util.Scanner;

public class Exercicio01_lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	      
	      System.out.println("Digite o valor de A:");
	      int A = scanner.nextInt();
	      
	      System.out.println("Digite o valor de B:");
	      int B = scanner.nextInt();
	      
	      System.out.println("Digite o valor de C:");
	      int C = scanner.nextInt();
	      
	      scanner.close();
	     
	      int somaAB = A + B;
	      
	      if (somaAB > C) {
	    	  System.out.println("A soma de A + B é maior que C.");
	      } else if (somaAB < C) {
	    	  System.out.println("A soma de A + B é menor que C.");
	      } else {
	    	  System.out.println("A soma de A + B é igual a C.");
	      }
		}
	}

