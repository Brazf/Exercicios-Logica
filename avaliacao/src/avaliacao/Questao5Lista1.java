package avaliacao;

import java.util.Scanner;

public class Questao5Lista1 {
	public static void main(String[] args) {
		Scanner perg = new Scanner(System.in);
		int num1 = 0;
		System.out.printf("Digite um n�mero para saber se � par ou �mpar: ");
		num1 = perg.nextInt();
		if(num1 % 2 == 0) {
			System.out.printf("O n�mero digitado � par!");
		}else {
			System.out.printf("O n�mero digitado � �mpar!");
		}
	}
}
