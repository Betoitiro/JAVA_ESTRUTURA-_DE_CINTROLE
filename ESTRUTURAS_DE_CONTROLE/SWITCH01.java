package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class SWITCH01 {
	public static void main(String[] args) {
		
		//diferente do if, while e for, ele não recebe um valor boolean, ou seja, true or false!
		
		
		//usando switch sem break
		//nesse metodo ele é um metodo acumulativo, ou seja, se vc entra na preta, vc sabe todas as outras
		//todavia, ele vai reproduzir todas as outras sentensas, por conta que não utiliza o break
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva qual a sua faixa: ");
		String faixa = entrada.nextLine();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-dai");
		case "marrom":
			System.out.println("sei o TEkki Shodan");
		case "roxa":
			System.out.println("sei o heian godan");
		case "verde": 
			System.out.println("sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("sei o heian nidan");
		case "amarela":
			System.out.println("sei o heian shodan");
			/*
			 * default: System.out.println("sei de nada");
			 */
		}
		
		entrada.close();
	}
}
