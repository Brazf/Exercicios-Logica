package avaliacao;

import java.util.Scanner;

public class Questao1Lista1 {
	public static void main(String[] args) {
		Scanner pergunta = new Scanner(System.in);
		int num1 = 0;
		long num2 = 0;
		float num3 = 0;
		System.out.printf("Digite um inteiro:");
		num1 = pergunta.nextInt();
		System.out.printf("Digite um número long:");
		num2 = pergunta.nextLong();
		System.out.printf("Digite um número float");
		num3 = pergunta.nextFloat();
		System.out.println("O valor digitado para o número inteiro:" + num1);
		System.out.println("O valor digitado para o número long:" + num2);
		System.out.println("O valor digitado para o número float:" + num3);
	}
}
