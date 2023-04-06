package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class DESAFIO03 {
	public static void main(String[] args) {
		//desafio usando while
		//sistema que pergunta as notas e so para qunado o comando -1 for digitado
		
		
		Scanner entrada =  new Scanner(System.in);
		
		int quantidade = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) { //condiçao do while, que quando a nota dor diferente -1, o sistema vai continuar rodando
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if (nota <=10 && nota >=0) { //condição para validar a nota. caso não caia na condição,e ele n vai somar como total e nem contidade
				total += nota;
				quantidade++;
			}else if (nota != -1){ //se colocar um else, ela seria considerada nota invalida
				System.out.println("nota invalida ;)");
			}
		}
		//calcular a media
		
		double media = total /quantidade;
		System.out.println("media = " + media);
		
		entrada.close();
		
	}
}
