package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("informe a primeira nota: ");
		double n1 =  entrada.nextDouble();
		
		System.out.println("informe a segunda nota: ");
		double n2 = entrada.nextDouble();
		
		double media = (n1 + n2)/2;
		
		if (media <= 10 && media >=7) {
			System.out.println("Voce foi aprovado!");
			System.out.println("Muito bem!");
		}
		if (media <7  && media >=4) {
			System.out.println("o aluno esta de recuperação");
		}	
		boolean cdr = media <4 && media >=0; //criterio de reprovação
		if(cdr) {
			System.out.println("O aluno foi reprovado");
		}
		
		
		
		entrada.close();
	}

}
