package a001ListaJava;

import java.util.Scanner;

public class b25VetorDInamico {
	private int[] vetor;
	
	public int[] getVetor() {
		return this.vetor;
	}
	
	public void setTamanhoVetor(int n) {
		if(this.vetor != null) {
			int[] arrayBase = new int[n];
			
			int quantASerPercorrida = n > this.vetor.length ? this.vetor.length : n;
			
			for(int i = 0; i<quantASerPercorrida; i++) {
				arrayBase[i] = this.vetor[i];
			}
			
			this.vetor = arrayBase.clone();
		}else {
		this.vetor = new int[n];
		}
	}
	
	public void setValoresVetor(int[] v) {
		if(this.vetor != null) {
			int quantASerPercorrida = v.length > this.vetor.length ? this.vetor.length : v.length;
			
			for(int i = 0; i < quantASerPercorrida; i++) {
				this.vetor[i] = v[i];
			}
		}else {
			this.vetor = v.clone();
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b25VetorDInamico b = new b25VetorDInamico();
		
		int[] n = {2, 4, 1, 5};
		
		b.setValoresVetor(n);
		
		
		System.out.print("Vetor Atual: ");
		for(int i = 0; i < b.getVetor().length; i++) {
			System.out.print(b.getVetor()[i] + ", ");
		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("\n\nNovo tamanho do vetor: ");
		int novoTamanho = s.nextInt();
		
		b.setTamanhoVetor(novoTamanho);
		
		System.out.print("Vetor Atualizado: ");
		for(int i = 0; i < b.getVetor().length; i++) {
			System.out.print(b.getVetor()[i] + ", ");
		}
	}

}
