package a001ListaJava;

import java.util.Scanner;

public class b15NumeroPorExtenso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Escolha um numero: ");
		int n = s.nextInt();
		
		switch(n) {
		case 1:
			System.out.println("Um");
			break;
		case 2:
			System.out.println("Dois");
			break;
		case 3:
			System.out.println("Três");
			break;
		case 4:
			System.out.println("Quatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}
	}

}
