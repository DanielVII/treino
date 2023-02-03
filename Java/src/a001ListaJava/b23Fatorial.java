package a001ListaJava;

import java.util.Scanner;

public class b23Fatorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
	
		s = new Scanner(System.in);
		System.out.print("Numero pra fatorial: ");
		int end = s.nextInt();
		int fatorial = 1;
		for(int i = 1; i<=end; i++) {
			fatorial *= i;
		}
		
		System.out.println("O fatorial é: " + fatorial);
}}
