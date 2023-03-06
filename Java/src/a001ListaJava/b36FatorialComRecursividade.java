package a001ListaJava;

public class b36FatorialComRecursividade {
	
	public static double fatorar(int n) {
		double fator;
		if(n > 1) {
			fator = n *fatorar(n-1);
		}else {
			fator = 1;
		}
		
		return fator;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(fatorar(5));
	}

}
