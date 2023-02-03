package a001ListaJava;

import java.util.Scanner;

public class b22Somatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Inicio do somatorio: ");
		int start = s.nextInt();
		
		s = new Scanner(System.in);
		System.out.print("Fim do somatorio: ");
		int end = s.nextInt();
		int soma = 0;
		for(int i = start; i<=end; i++) {
			soma += i;
		}
		
		System.out.println("A somatoria é: " + soma);
		
	}

}
