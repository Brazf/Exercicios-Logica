package avaliacao;

public class Questao3Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = {{3,4,5},
						  {5,6,1}};
		int array2[][] = {{10,1},
						   {3,5},
						   {0,21}};
		int multiplicacao[][] = new int[2][2];
		
		
		//ARRAY 1
		System.out.println("Matriz 1");
		for(int linha = 0; linha < array1.length; linha++) {
			for(int coluna = 0; coluna < array1[linha].length; coluna++) {
				System.out.print(array1[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		//ARRAY 2
		System.out.println("Matriz 2");
		for(int linha = 0; linha < array2.length; linha++) {
			for(int coluna = 0; coluna < array2[linha].length; coluna++) {
				System.out.print(array2[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		//CÓDIGO DE MULTIPLICAÇÃO DOS ARRAYS E (teste de colunas array1 por linhas array2)
		System.out.println();
		
		if(array1[0].length == array2.length) {
			System.out.println("Para realizar a multiplicação das matrizes, a quantidade de colunas da Matriz 1 deve ter o mesmo valor do tamanho de linhas da Matriz B");
			System.out.println("Colunas Array1: " + array1[0].length);
			System.out.println("Linhas Array2: " + array2.length);
			System.out.println("A multiplicação pode ser feita!");
			System.out.println();
			System.out.println("Resultado da multiplicaão das Matrizes!");
			for(int linha = 0; linha < multiplicacao.length; linha++) {
				for(int coluna = 0; coluna < array1.length; coluna++) {
					for(int ind = 0; ind < array2.length; ind++) {
						multiplicacao[linha][coluna] += (array1[linha][ind] * array2[ind][coluna]);
					}
					System.out.print(multiplicacao[linha][coluna] + " ");
				}
				System.out.println();
			}
		}
		
		
		
	// ÚLTIMAS CHAVES DO PROGRAMA!
	}

}
