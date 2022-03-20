package avaliacao;

import java.util.Random;

public class Questao6Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[10];
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		System.out.println("Ímpar");
		for(int i = 0; i < array.length ; i++) {
			if(array[i] % 2 == 0) {
			System.out.println("Array Par: " + array[i]);
			}
		}
	}
}