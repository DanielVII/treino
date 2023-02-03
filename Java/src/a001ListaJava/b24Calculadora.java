package a001ListaJava;

import java.util.Scanner;

public class b24Calculadora {
	public double Potencia(double base, double expoente) {
		return Math.pow(base, expoente);
	}
	
	public double raizQuadrada(double n) {
		return Math.sqrt(n);
	}
	
	public int fatorial(int n) {
		int end = n;
		int produto = 1;
		for(int i = 1; i<=end; i++) {
			produto *= i;
		}
		return produto;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b24Calculadora calc = new b24Calculadora();
		
		Scanner s = new Scanner(System.in);
		
		double base, expoente, radiando, resultado;
		int fatorial, resul;
		
		int escolha = -1;
		while(escolha != 0) {
			System.out.println("1 - Potencia");
			System.out.println("2 - Raiz Quadrada");
			System.out.println("3 - Fatorial");
			System.out.println("0 - Sair");
			System.out.print("O que você quer fazer: ");
			escolha = s.nextInt();
			s = new Scanner(System.in);
			
			System.out.println("\n");
			
			switch(escolha) {
			case(0):
				System.out.print("Até a próxima.");
				break;
			case(1):
				System.out.print("Base: ");
				base = s.nextDouble();
				s = new Scanner(System.in);
				
				System.out.print("Expoente: ");
				expoente = s.nextDouble();
				s = new Scanner(System.in);
				
				resultado = calc.Potencia(base, expoente);
				
				System.out.println("Resultado: " + resultado);
				break;
				
				
			case(2):
				System.out.print("Raiz quadrado de qual número: ");
				radiando = s.nextDouble();
				s = new Scanner(System.in);
				
				resultado = calc.raizQuadrada(radiando);
				
				System.out.println("Resultado: " + resultado);
				break;
				
			case(3):
				System.out.print("Fatorial de qual número: ");
				fatorial = s.nextInt();
				s = new Scanner(System.in);
			
				resul = calc.fatorial(fatorial);
			
				System.out.println("Resultado: " + resul);
				break;
				
			default:
				System.out.println("Escolha uma opção valida.");
				break;
				
			}
			System.out.println("\n");
		}
	}

}
