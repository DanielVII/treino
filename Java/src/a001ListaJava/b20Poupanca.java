package a001ListaJava;

import java.util.Scanner;

public class b20Poupanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo, rendimento, invesInicial, invesMensal, taxa; 
		int meses;
		
		taxa = 0.01;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Investimento inicial: ");
		invesInicial = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("Investimento mensal: ");
		invesMensal = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("Quantidade de meses: ");
		meses = s.nextInt();
		s = new Scanner(System.in);
		
		saldo = invesInicial;
		
		for (int i = 1; i<=meses; i++) {
			rendimento = saldo * taxa;
			System.out.printf("Saldo inicial do mês %d: %.2f\n", i, saldo);
			System.out.printf("Rendimento do mês: %.2f\n\n", rendimento);
			saldo += rendimento + invesMensal;
		}
	}

}
