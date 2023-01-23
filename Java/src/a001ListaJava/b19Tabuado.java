package a001ListaJava;

import java.util.Scanner;

public class b19Tabuado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Numero pra tabuada: ");
		int n = s.nextInt();
		
		for (int i = 1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
		}
	}

}
