package a001ListaJava;

public class b27VetorInverso {
	private int[] vetorInverso;
	
	public int[] getVetorInverso(){
		return this.vetorInverso;
	}
	
	public void setVetorInverso(int[] v) {
		int tamanhoVetor = v.length;
		int ultimoIndex = tamanhoVetor - 1;
		this.vetorInverso = new int[tamanhoVetor];
		
		for(int i = 0; i < tamanhoVetor; i++) {
			this.vetorInverso[i] = v[ultimoIndex - i];
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] v = {1,2,3,4};
		
		b27VetorInverso b = new b27VetorInverso();
		
		b.setVetorInverso(v);
		
		for(int i=0; i<v.length; i++ ) {
			System.out.print(b.getVetorInverso()[i] + " ");
		}
	}

}
