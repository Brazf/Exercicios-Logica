package avaliacao;

public class Questao2Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = {{3,4,5},
						  {5,6,1}, 
						  {7,8,2}};
		int array2[][] = {{10,1,2},
						   {3,5,0},
						   {0,21,15}};
		int subtracao[][] = new int[3][4];
		
		// C�DIGO DA MATRIZ ARRAY1
		System.out.println("Matriz 1");
		for(int linha = 0; linha < array1.length; linha++) {
			for(int coluna = 0; coluna < array1[0].length; coluna++) {
				System.out.print(array1[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		// C�DIGO DA MATRIZ ARRAY2
		System.out.println("Matriz 2");
		for(int linha = 0; linha < array2.length; linha++) {
			for(int coluna = 0; coluna < array2[0].length; coluna++) {
				System.out.print(array2[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// C�DIGO DE CHEGAGEM E SUBTRA��O!
		if(array1.length == array2.length && array1[0].length == array2[0].length) {
			System.out.println("Os Arrays tem a mesma dimens�o e poder�o ser subtra�dos:");
			System.out.println();
			System.out.println("Quantidade de linhas do array1: " + array1.length);
			System.out.println("Quantidade de colunas do array1: " + array1[0].length);
			System.out.println("Quantidade de linhas do array2: " + array2.length);
			System.out.println("Quantidade de colunas do array2: " + array2[0].length);
			System.out.println();
			for(int linha = 0; linha < array1.length; linha++) {
				for(int coluna = 0; coluna < array1[0].length; coluna++) {
					subtracao[linha][coluna] = array1[linha][coluna] - array2[linha][coluna];
					System.out.print(subtracao[linha][coluna] + " ");
				}
				System.out.println();
			}			
		}
		else {
			System.out.println("As dimens�es dos arrays s�o igual, portanto n�o poder� ser realizada subtra��o!");
		}
	}

}
