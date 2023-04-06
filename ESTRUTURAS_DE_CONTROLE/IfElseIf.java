package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class IfElseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite uma nota: ");
		double nota = entrada.nextDouble();
		
		if (nota > 10 || nota <0) {
			System.out.println("nota invalida");
		}else if (nota >= 7.0) {
			System.out.println("aprovado");
		}else {
			System.out.println("recuperação");
		}
		
		System.out.println("encerrado!");
		entrada.close();
	}
}
