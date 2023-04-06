package ESTRUTURAS_DE_CONTROLE;

import java.util.Scanner;

public class SWITCH02 {
	public static void main(String[] args) {
		//SWITCH COM BREAK
		
		Scanner  entrada = new Scanner(System.in);
		
		String conceito ="";
		System.out.println("Digite sua nota: ");
		int nota1 = entrada.nextInt();
		
		System.out.println("Digite a sua segunda nota: ");
		int nota2 = entrada.nextInt();
		
		int media = (nota1 + nota2)/2;
		
		switch(media) {
		case 10:
			conceito = "Melhor media da turma";
			break;
		case 9:
			conceito ="segunda melhor media da turma";
			break;
		case 8:
			conceito ="terceira melhor media da turma";
		case 7:
			conceito ="Poderia melhorar a media";
			break;
		case 6: case 5: case 4: case 3: case 2: case1:
			conceito = "recuperação";
			break;
		default:
			conceito ="não informado";
		}
		
		System.out.println("o conceito é " + conceito);
		entrada.close();
	}
}
