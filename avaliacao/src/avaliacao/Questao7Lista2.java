package avaliacao;

import java.util.Random;

public class Questao7Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[10];
		int maior = 0;
		int menor = 100;
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maior) {
				maior = array[i];
			}
		}
		for(int i = 0; i < array.length; i++) {
			if(array[i] < menor) {
				menor = array[i];
			}
		}
		System.out.println("Maior número do array:" + maior);
		System.out.println("Menor número do array:" + menor);
	}
}