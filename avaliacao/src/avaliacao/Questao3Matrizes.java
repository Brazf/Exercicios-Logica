package avaliacao;

public class Questao3Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = {{3,4,5},
						  {5,6,1}};
		int array2[][] = {{10,1},
						   {3,5},
						   {0,21}};
		int subtracao[][] = new int[3][4];
		
		System.out.println("Matriz 1");
		for(int linha = 0; linha < array1.length; linha++) {
			for(int coluna = 0; coluna < array1[linha].length; coluna++) {
				System.out.print(array1[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz 2");
		for(int linha = 0; linha < array2.length; linha++) {
			for(int coluna = 0; coluna < array2[linha].length; coluna++) {
				System.out.print(array2[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		if(array1.length == array2.length && array1[0].length == array2[0].length) {
			System.out.println("Os Arrays tem a mesma dimensão e poderão ser somados:");
			for(int linha = 0; linha < array1.length; linha++) {
				for(int coluna = 0; coluna < array1[linha].length; coluna++) {
					subtracao[linha][coluna] = array1[linha][coluna] * array2[linha][coluna];
					System.out.print(subtracao[linha][coluna] + " ");
				}
				System.out.println();
			}			
		}
		else {
			System.out.println("As dimensões dos arrays não são iguais, portanto não poderá ser realizada a multiplicação!");
			System.out.println();
			System.out.println("Quantidade de linhas do array1: " + array1.length);
			System.out.println("Quantidade de colunas do array1: " + array1[0].length);
			System.out.println("Quantidade de linhas do array2: " + array2.length);
			System.out.println("Quantidade de colunas do array2: " + array2[0].length);
		}
	}

}
