package ESTRUTURAS_DE_CONTROLE;

public class DESAFIO01 {
	public static void main(String[] args) {
		
		//encontre o ero da sentença de codigos a seguir
		//double nota = 1.3;
		
		//if(nota >=9); {
			//System.out.println("voce é um anulo exemplar");
			//System.out.println("meus parabens");
		//}
		//maneira pedida pelo professor:
		//consistia em retirar o ; do if
		
		double nota2 = 1.5;
		
		if (nota2 >=9) { //não se usa ; em estruutra de controle
			
			System.out.println("voce é um aluno exemplar");
			System.out.println("meus parabens");
		}
		
		
		//outra maneira de resolver a questão
		double nota1 = 1.7;
		
		boolean ntb = (nota1 < 9);
		if (ntb);{
		System.out.println("voce pode melhorar");
		}
		
	
	}
}
