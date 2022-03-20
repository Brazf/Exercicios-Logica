package avaliacao;

import java.util.Scanner;

public class Questao1Lista2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite a quantidade de notas que deseja calcular a média:");
		int notas = scan.nextInt();
		float media = 0;
		for(int i=0; i < notas; i++) {
			System.out.print("Digite a " + (i+1) + " nota:");
			media += scan.nextFloat();
		}
		System.out.print("A média das " + notas + " notas digitadas é igual a: "+ (media/notas));
	}
}
