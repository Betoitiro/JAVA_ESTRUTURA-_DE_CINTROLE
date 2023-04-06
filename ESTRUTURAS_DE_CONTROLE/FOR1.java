package ESTRUTURAS_DE_CONTROLE;

public class FOR1 {
	public static void main(String[] args) {
		//estrutura focada em uma estrutura de tamanho determinado
		//para que em algum momento essa ação tenha fim
		
		for (int contador = 0; contador <=20;contador+=2 ) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x = 2;
		for (;x < 10;) {
			System.err.println("x = "+x);
			x++;
		}
	}
}
