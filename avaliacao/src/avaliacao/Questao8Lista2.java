package avaliacao;

import java.util.Random;

public class Questao8Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		float array[] = new float[100];
		float total = 0;
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(15);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		for(int i = 0; i < array.length ; i++) {
			total += array[i];
		}
		System.out.println("\nSoma total do array:" + total);
		System.out.println("\nMédia aritimética do valores dentro do Array:" + (total/array.length));
}
}