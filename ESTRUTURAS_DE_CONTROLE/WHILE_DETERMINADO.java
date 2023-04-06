package ESTRUTURAS_DE_CONTROLE;

public class WHILE_DETERMINADO {
	public static void main(String[] args) {
		
		//é uma estrutura voltada para quando tem uma estrutura que quer ser tratado de maneira indeterminada	
		int contador = 1;
		
		while (contador <=20) {
			System.out.printf("i = %d|n", contador);
			contador+=2;
		}
	}
}
