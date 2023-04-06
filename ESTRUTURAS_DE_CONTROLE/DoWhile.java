package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner (System.in);
		
		String texto = "";
		
		do {
			System.out.println("voce precisa falar" + 
		"as palavras magicas...");
			System.out.println("Quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("quero"));
		
		System.out.println("obrigado");
		
		entrada.close();
	}
}
