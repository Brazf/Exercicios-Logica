package avaliacao;

import java.util.Scanner;

public class Questao4Lista1 {
	public static void main(String[] args) {
		Scanner perg = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("Comparador de maior número!");
		System.out.printf("Digite o primeiro número:");
		num1 = perg.nextInt();
		System.out.printf("Digite o segundo número:");
		num2 = perg.nextInt();
		if(num1 > num2) {
			System.out.printf("O primeiro número: " + num1 + " é maior que o segundo número " + num2);			
		}
		else if(num2 > num1) {
			System.out.printf("O segundo número: " + num2 + " é maior que o primeiro número " + num1);
		}
		else {
			System.out.printf("O primeiro e o segundo número são iguais:" + num1);
		}
	}

}
