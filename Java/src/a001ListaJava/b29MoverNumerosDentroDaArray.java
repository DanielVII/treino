package a001ListaJava;

public class b29MoverNumerosDentroDaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v = {1,2,3,4};
		int ultimoIndex = v.length - 1;
		
		int ultimoNDoVetor = v[ultimoIndex];
		
		for (int i = ultimoIndex; i >0; i--) {
			v[i] = v[i-1];
		}
		v[0] = ultimoNDoVetor;
		
		for(int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

}
