package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class DESAFIO02 {
	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("digite o dia da semana: ");
			
			String dia = entrada.next();
			
//			if(dia == "domingo") { // NÃO USA == PARA COMPARAR STRING
//			System.out.println(1);
//			}
			
			if(dia.equalsIgnoreCase("domingo")){
				System.out.println(1);
			}else if (dia.equalsIgnoreCase("sabado")) {
				System.out.println("7");
			}else if (dia.equalsIgnoreCase("segunda")) {
				System.out.println(2);
			}else if (dia.equalsIgnoreCase("terça")) {
				System.out.println(3);
			}else if (dia.equalsIgnoreCase("quarta")) {
				System.out.println(4);
			}else if (dia.equalsIgnoreCase("quinta")) {
				System.out.println(5);
			}else if (dia.equalsIgnoreCase("sexta")) {
				System.out.println(6);
			}else {
				System.out.println("dia invalido!");
				System.out.println("tente novamente");
			}
			
			entrada.close();
	}
}
