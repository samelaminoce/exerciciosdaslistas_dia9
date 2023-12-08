package exercicios;

import java.util.Scanner;

public class Exercicio03_lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o 2º número: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Operação (1 - Soma, 2 - Subtração, 3 - Multiplicação, 4 - Divisão): ");
        int operacao = scanner.nextInt();

        float resultado = 0;

        switch (operacao) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println(numero1 + " + " + numero2 + " = " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println(numero1 + " - " + numero2 + " = " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println(numero1 + " * " + numero2 + " = " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println(numero1 + " / " + numero2 + " = " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
                break;
            default:
                System.out.println("Operação Inválida!");
        }

        scanner.close();
    }
	}

