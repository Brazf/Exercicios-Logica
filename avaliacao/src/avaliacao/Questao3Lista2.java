package avaliacao;

import java.util.Random;

public class Questao3Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		System.out.println("INVERSÃO!");
		for(int i = array.length-1; i >= 0 ; i--) {
			System.out.println("Array invertido: " + array[i]);
		}
	}
}
