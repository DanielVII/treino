package a001ListaJava;

import java.util.Scanner;

public class b07DivisaoComErroNo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1, n2;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Dividendo: ");
		n1 = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("Divisor: ");
		n2 = s.nextDouble();
		
		if (n2 == 0) {
			System.out.println("O divisor não pode ser 0");
		}else {
			System.out.printf("%.2f / %.2f = %.2f", n1, n2, n1/n2);
		}
	}

}
