package a001ListaJava;

import java.util.Scanner;

public class QuestEspecial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] l = {8, 2, 1, 6, 5};
		Scanner s = new Scanner(System.in);
		int posicao =2;

		for(int i = posicao; i>0; i--) {
			if(l[i] < l[i-1]) {
				//se o escolhido for menor que o da esquerda, eles vão trocar de lugar.
				int elemento1 = l[i];
				int elemento2 = l[i-1];
				
				l[i] = elemento2;
				l[i-1] = elemento1;
				
			}else {
				//se não, vai sair do loop
				i=-1;
			}
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(l[i] + ", ");
			
		}
		
	}

}
