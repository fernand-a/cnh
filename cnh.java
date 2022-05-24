package cnh;

import java.util.Scanner;

public class cnh {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//declaracao de variaveis
		int psicotecnico, legislacao, direcao;
		
		//exibicao de textos
		System.out.println("escolha 1 para sim\n 2 para nao!");
		System.out.println("aprovado no exame psicotecnico?\n1.sim\n2.nao");
		
		//atribuindo valor
		psicotecnico = leia.nextInt();
		System.out.println("aprovado no exame de legislacao?\n1.sim\n2.nao");
		
		legislacao = leia.nextInt();
		System.out.println("aprovado no exame de direcao?\n1.sim\n2.nao");
		
		direcao = leia.nextInt();
		
		//encerando
		leia.close();
		
		//condicao
		if (psicotecnico == 1 && legislacao == 1 && direcao == 1) {
			System.out.println("voce esta apto para ter a cnh");
			
		} else {
			System.out.println("voce nao esta apto para ter a cnh");
		}
	}

}
