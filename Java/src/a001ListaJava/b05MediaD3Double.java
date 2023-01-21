package a001ListaJava;

import java.util.Scanner;

public class b05MediaD3Double {

	public double CalcularMedia(double n1, double n2, double n3) {
		return (n1 + n2 + n3)/3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b05MediaD3Double b = new b05MediaD3Double();
		
		double n1, n2, n3, media;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Primeiro double: ");
		n1 = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("Segundo double: ");
		n2 = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("Terceiro double: ");
		n3 = s.nextDouble();
		
		media = b.CalcularMedia(n1, n2, n3);
		
		System.out.printf("A media é %.2f", media);
	}
}
