package avaliacao;

import java.util.Scanner;

public class Questao3Lista1 {
	public static void main(String[] args) {
		Scanner perg = new Scanner(System.in);	
		float base_maior = 0;
		float base_menor = 0;
		float altura = 0;
		float area = 0;
		System.out.printf("Digite a o valor da base maior:");
		base_menor = perg.nextFloat();
		System.out.printf("Digite o valor da base menor:");
		base_maior = perg.nextFloat();
		System.out.printf("Digite a altura:");
		altura = perg.nextFloat();
		area = (base_maior + base_menor) * altura / 2;
		System.out.printf("O valor da área do trapézio retângulo é igual a:" + area);
	}
}