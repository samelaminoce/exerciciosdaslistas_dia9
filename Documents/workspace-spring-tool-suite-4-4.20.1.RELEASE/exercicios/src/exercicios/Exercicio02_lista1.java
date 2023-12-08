package exercicios;

import java.util.Scanner;

public class Exercicio02_lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Digite um número: ");
   int numero = scanner.nextInt();
   
   String parOuImpar = (numero % 2 == 0) ? " par " : " ímpar ";
   
   String posOuNeg = (numero > 0) ? "positivo" : ((numero < 0) ? "negativo" : "zero");
   
   System.out.println("O número " + numero + " é " + parOuImpar + " é " + posOuNeg + "!");
   
   scanner.close();
	}
}
   