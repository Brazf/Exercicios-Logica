package avaliacao;

import java.util.Scanner;

public class Questao4Lista1 {
	public static void main(String[] args) {
		Scanner perg = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		System.out.println("Comparador de maior n�mero!");
		System.out.printf("Digite o primeiro n�mero:");
		num1 = perg.nextInt();
		System.out.printf("Digite o segundo n�mero:");
		num2 = perg.nextInt();
		if(num1 > num2) {
			System.out.printf("O primeiro n�mero: " + num1 + " � maior que o segundo n�mero " + num2);			
		}
		else if(num2 > num1) {
			System.out.printf("O segundo n�mero: " + num2 + " � maior que o primeiro n�mero " + num1);
		}
		else {
			System.out.printf("O primeiro e o segundo n�mero s�o iguais:" + num1);
		}
	}

}
