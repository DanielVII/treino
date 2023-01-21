package a001ListaJava;

import java.util.Scanner;

public class b04MediaD3Int {
	public int CalcularMedia(int n1, int n2, int n3) {
		return (n1 + n2 + n3)/3;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b04MediaD3Int b = new b04MediaD3Int();
		
		int n1, n2, n3, media;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Primeiro int: ");
		n1 = s.nextInt();
		s = new Scanner(System.in);
		
		System.out.print("Segundo int: ");
		n2 = s.nextInt();
		s = new Scanner(System.in);
		
		System.out.print("Terceiro int: ");
		n3 = s.nextInt();
		
		media = b.CalcularMedia(n1, n2, n3);
		
		System.out.printf("A media é %d", media);
	}

}
