package avaliacao;

import java.util.Random;
import java.util.Scanner;

public class Questao2Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			System.out.print("Digite 10 n�meros em sequ�ncia e receba-os de forma inversa, n�mero[" + (i+1) + "] :");
			array[i] = scan.nextInt();
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		System.out.println("INVERS�O!");
		for(int i = array.length-1; i >= 0 ; i--) {
			System.out.println("Array invertido: " + array[i]);
		}
	}
}
