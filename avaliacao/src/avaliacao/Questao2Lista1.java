package avaliacao;

import java.util.Scanner;

public class Questao2Lista1 {
	public static void main(String[] args) {
		Scanner pergunta = new Scanner(System.in);
		float peso, altura, imc, meta;
		int sexo, idade;
		boolean sair = false;
		while(!sair) {
			System.out.println("Digite um sua opção:\n Digite [1] para Calcular IMC \n Digite [2] para calcular o metabolismo Basal \n Digite [3] para encerrar o programa!");
			int alternativa = pergunta.nextInt();
		switch(alternativa) {
		  case 1:
			  System.out.println("Digite seu peso: ");
			  peso = pergunta.nextFloat();
			  System.out.println("Digite sua altura ");
			  altura = pergunta.nextFloat();
			  imc = peso / (altura*altura);
			  if(imc < 19) {
				  System.out.println("Abaixo do Peso");
			  }
			  else if(imc >= 19 && imc < 25){
				  System.out.println("Peso Normal!");
			  }
			  else if(imc >= 25 && imc < 30) {
				  System.out.println("Sobrepeso!");
			  }
			  else if(imc >= 30 && imc < 40) {
				  System.out.println("Obesidade do tipo 1");
			  }
			  else {
				  System.out.println("Obesidade Mórbida!");
			  }
		    break;
		  case 2:
			  System.out.print("Digite o número referente ao seu sexo: \n [1] Masculino \n [2] Feminino");
			  sexo = pergunta.nextInt();
			  if(sexo == 1) {
				  System.out.print("Digite sua idade: ");
				  idade = pergunta.nextInt();
				  System.out.println("Digite seu peso: ");
				  peso = pergunta.nextFloat();
				  if(idade >= 18 && idade < 30) {
					  meta = (15.057f * peso) + 679;
					  System.out.print("sua taxa metabólica basal é de: " + meta);
				  }
				  else if(idade >= 30 && idade < 60) {
					 meta = (11.6f * peso) + 879;
					 System.out.print("sua taxa metabólica basal é de: " + meta);
				  }
				  else if(idade > 60) {
					  meta = (float) ((13.5 * peso) + 487);
					  System.out.print("sua taxa metabólica basal é de: " + meta);
				  }else {
					  System.out.print("Sua idade é menor que 18 então não podemos realzar a operação!");
				  }
			  }
			  else if(sexo == 2) {
				  System.out.print("Digite sua idade: ");
				  idade = pergunta.nextInt();
				  System.out.println("Digite seu peso: ");
				  peso = pergunta.nextFloat();
				  if(idade >= 18 && idade < 30) {
					  meta = (14.7f * peso) + 486.6f;
					  System.out.print("sua taxa metabólica basal é de: " + meta);
				  }
				  else if(idade >= 30 && idade < 60) {
					 meta = (8.7f * peso) + 829;
					 System.out.print("sua taxa metabólica basal é de: " + meta);
				  }
				  else if(idade > 60) {
					  meta = (10.5f* peso) + 596;
					  System.out.print("sua taxa metabólica basal é de: " + meta);
				  }else {
					  System.out.print("Sua idade é menor que 18 então não podemos realzar a operação!");
				  }
			  }
			  else {
				  System.out.println("Seu número digitado não é válido!");
			  }
		    break;
		  	case 3:
			  sair = true;
			  System.out.print("Programa encerrado!");
			  break;
		  default:
		    System.out.println("Número Invalido!");
		}
	}
}
}