package ESTRUTURAS_DE_CONTROLE;

public class DESAFIO04 {
	public static void main(String[] args) {
		//exemplo
		
		String valor = "#";
		for(int i = 1; i <=5; i ++) {
			System.out.println(valor);
			valor += "#";
		}
		String ex = "L";
		for (int m = 1; m<16; m++) {
			System.out.println(ex);
			ex += "L";
		}
		for(String a = "f";!a.equals("ffffff"); a +="f") {
			System.out.println(a);
		}
		//o desafio consiste em fazer o script da o mesmo resultado, porem sem usar valores numericos
		
		for(String v = "#"; !v.equals("######"); v +="#"){
			System.out.println(v);
		}
		
	}
}
