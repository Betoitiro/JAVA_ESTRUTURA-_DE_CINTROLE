package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class IF_ELSE {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int valor = entrada.nextInt();
		
		
		
		if (valor % 2 ==0) {
			System.out.println("numero par");
			
		}
		
		if (valor % 2 ==1) {
			System.out.println("numero impar");
		}
		
		if (valor % 2 == 0) {
			System.out.println("o numero que voce escolheu é par");
		}else {
			System.out.println("O numero que voce escolheu é impar");
		}
		
		entrada.close();
	}
}
