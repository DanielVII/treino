package a001ListaJava;

public class b28MaiorEMenor {
	public int maiorDoVetor(int[] v) {
		int maior = v[0];
		for (int i = 0 ; i<v.length; i++) {
			if(v[i] > maior) {
				maior = v[i];
			}
		}
		
		return maior;
	}
	
	public int menorDoVetor(int[] v) {
		int menor = v[0];
		for (int i = 0 ; i<v.length; i++) {
			if(v[i] < menor) {
				menor = v[i];
			}
		}
		
		return menor;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v = {1,2,3,4};
		
		b28MaiorEMenor b = new b28MaiorEMenor();
		
		System.out.println("Maior: " + b.maiorDoVetor(v));
		
		System.out.println("Menor: " + b.menorDoVetor(v));
	}

}
