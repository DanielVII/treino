package a001ListaJava;
import java.util.Scanner;
public class b03MatBaseInt {
	
	public int Somar(int n1, int n2) {
		return n1 + n2;
	}
	
	public int Subtrair(int n1, int n2) {
		return n1 - n2;
	}
	
	public int Dividir(int n1, int n2) {
		return n1/n2;
	}
	
	public double RestoDivisao(double n1, double n2) {
		return n1%n2;
	}
	
	public int multiplicar(int n1, int n2) {
		return n1*n2;
	}
	
	public static void main(String[] args) {
		int n1, n2, soma, diferenca, produto, quociente;
		double resto;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Inteiro 1: ");
		n1 = s.nextInt();
		
		s = new Scanner(System.in);
		
		System.out.print("Inteiro 2: ");
		n2 = s.nextInt();
		
		b03MatBaseInt b = new b03MatBaseInt();
		
		soma = b.Somar(n1, n2);
		diferenca = b.Subtrair(n1, n2);
		produto = b.multiplicar(n1, n2);
		quociente = b.Dividir(n1, n2);
		resto = b.RestoDivisao(n1, n2);
		
		System.out.printf("%d + %d = %d\n", n1, n2, soma);
		System.out.printf("%d - %d = %d\n", n1, n2, diferenca);
		System.out.printf("%d x %d = %d\n", n1, n2, produto);
		System.out.printf("%d / %d = %d\n", n1, n2, quociente);
		System.out.printf("resto %d / %d = %.2f\n", n1, n2, resto);
	}

}
