package avaliacao;

import java.util.Random;

public class Questao4Lista2 {
	public static void main(String[] args) {
		Random random = new Random();
		int array[] = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println("Array normal: " + array[i]);
		}
		System.out.println("Números primos!");
		for(int i = 1; i < array.length; i++) {
			int cont = 0;
			for(int n = 1; n <= i; n++) {
				if( i % n == 0) {
					cont ++;
				}
			}
		if(cont == 2) {
			System.out.println("primo:" + i);
		}
			}
		}
	}