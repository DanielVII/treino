package a001ListaJava;

import java.util.Scanner;

public class b10ParOuImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Escolha um int pra saber se é par ou impar: ");
		n1 = s.nextInt();
		
		if(n1 % 2 == 0) {
			System.out.println("O numero é par");
		}else {
			System.out.println("O numero é impar");
		}
	}

}
