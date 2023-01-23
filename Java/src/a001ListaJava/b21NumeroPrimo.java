package a001ListaJava;

import java.util.Scanner;

public class b21NumeroPrimo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.print("NUmero pra saber se é primo: ");
		n = s.nextInt();
		
		int restosZero = 0;
		for(int i = n; i>0; i--) {
			if (n%i == 0) {
				restosZero += 1;
			}
		}
		
		if(restosZero == 2) {
			System.out.println("O numero é primo");
		}else {
			System.out.println("O numero não é primo");
		}
	}

}
