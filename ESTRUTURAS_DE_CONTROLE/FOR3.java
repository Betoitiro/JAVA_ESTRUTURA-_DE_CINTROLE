package ESTRUTURAS_DE_CONTROLE;

public class FOR3 {
	public static void main(String[] args) {
		
		/*
		 * for (int i = 0; i <10; i++) { System.out.println(i); }
		 * 
		 * int i = 10; //posso usar o mesmo valor fora do laço for, ja que ela so esta
		 * disponivel naquele local // Nesse sentido, essa variavel pode ser encontrada
		 * com valores diferentes
		 * 
		 * System.out.println("Saiu do loop for..."); System.out.println(i);
		 */
		
		for(int z = 0; z< 10; z++) {
			for (int e = 0; e < 10; e ++) {
				System.out.printf("[%d %d]" , z, e);
			}
			System.out.println();
		}
	}
}
