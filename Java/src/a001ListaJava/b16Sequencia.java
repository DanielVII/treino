package a001ListaJava;

import java.util.Scanner;

public class b16Sequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Valor inicial: ");
		int vInicial = s.nextInt();
		s = new Scanner(System.in);
		
		System.out.print("Valor final: ");
		int vFinal = s.nextInt();
		
		int start, end;
		
		if (vInicial < vFinal) {
			start = vInicial;
			end = vFinal;
		}else {
			start = vFinal;
			end = vInicial;
		}
		
		System.out.println("Com for:");
		for (int i = start; i < end; i++) {
			System.out.printf("%d, ", i);
		}
		System.out.println(end);
		System.out.println();
		
		int n = start;
		System.out.println("Com while:");
		while (n < end) {
			System.out.printf("%d, ", n);
			n+=1;
		}
		System.out.println(end);
		System.out.println();
		
		int j = start;
		System.out.println("Com do while:");
		do {
			System.out.printf("%d, ", j);
			j+=1;
		}while (j < end);
		System.out.println(end);
		System.out.println();
		
	}

}
