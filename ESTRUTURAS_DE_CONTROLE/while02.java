package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class while02 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		//esquento não estiver contido sair, continue digitando...
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.print("Voce diz: ");
			valor = entrada.nextLine();
		
		}
		
		entrada.close();
	}
}
