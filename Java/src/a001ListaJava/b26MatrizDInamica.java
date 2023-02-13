package a001ListaJava;

import java.util.Scanner;

public class b26MatrizDInamica {
	private int[][] matriz;
	
	public int[][] getMatriz(){
		return this.matriz;
	}
	
	public void setTamanhoMatriz(int linha, int coluna){
		
		if(this.matriz != null) {
			int[][] novaMatriz = this.matriz.clone();
			
			this.matriz = new int[linha][coluna];
			
			this.setValoresMatriz(novaMatriz);
			
		}else {
			this.matriz = new int[linha][coluna];
		}
	}
	
	public void setValoresMatriz(int[][] m) {
		if(this.matriz != null) {
			int quantASerPercorridaLinha = m.length > this.matriz.length ? 
					this.matriz.length : m.length;
			
			int quantASerPercorridaColuna = m[0].length > this.matriz[0].length ?
					this.matriz[0].length : m[0].length;
			
			for(int i = 0; i < quantASerPercorridaLinha; i++) {
				for(int j = 0; j < quantASerPercorridaColuna; j++) {
					this.matriz[i][j] = m[i][j];
					
				}
			}
		}else {
			this.matriz = m.clone();
		}
	}
	
	public static void main(String[] args) {
		int[][] mm = {{2,1,4},{5,7,8}};
		
		b26MatrizDInamica b = new b26MatrizDInamica();
		
		b.setValoresMatriz(mm);
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Linhas: ");
		int linhas = s.nextInt();
		
		s = new Scanner(System.in);
		
		System.out.print("Colunas: ");
		int colunas = s.nextInt();
		
		b.setTamanhoMatriz(linhas, colunas);
		
		for(int i = 0; i< linhas; i++) {
			System.out.print("\n");
			for( int j = 0; j<colunas; j++) {
				System.out.print(b.getMatriz()[i][j] + " ");
			}
		}
		
	}
}
