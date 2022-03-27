package avaliacao;

public class Questao1Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = {{3,4},
						  {5,6},
						  {7,8}};
		int array2[][] = {{10,1},
						   {3,5},
						   {0,21}};
		int soma[][] = new int[3][2];
		
		System.out.println("Matriz 1");
		for(int linha = 0; linha < array1.length; linha++) {
			for(int coluna = 0; coluna < array1[linha].length; coluna++) {
				System.out.print(array1[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("Matriz 2");
		for(int linha = 0; linha < array2.length; linha++) {
			for(int coluna = 0; coluna < array2[linha].length; coluna++) {
				System.out.print(array2[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		int colunasArray1;
		int colunasArray2;
		int colum;
		System.out.println();
		if(array1.length == array2.length) {
			colum = 0;
			for(int linha = 0; linha < array1.length; linha++) {
				colunasArray1 = 0;
				colunasArray2 = 0;
				for(int coluna = 0; coluna < array1[linha].length; coluna++) {
					colunasArray1 += 1;
				}
				for(int coluna = 0; coluna < array2[linha].length; coluna++) {
					colunasArray2 += 1;
				}
				if(colunasArray1 == colunasArray2) {
					colum ++;
				}else {
					System.out.println("As dimensões dos arrays não são igual, portanto não poderá ser realizada soma!");
					break;
				}
			}
			System.out.println();
			if(colum == array1.length) {
				System.out.println("Soma das Matrizes!");
				for(int linha = 0; linha < array1.length; linha++) {
					for(int coluna = 0; coluna < array1[linha].length; coluna++) {
						soma[linha][coluna] = array1[linha][coluna] + array2[linha][coluna];
						System.out.print(soma[linha][coluna] + " ");
					}
					System.out.println();
				}
			}
		}else {
			System.out.println("As dimensões dos arrays são igual, portanto não poderá ser realizada soma!");
		}		
	}

}
