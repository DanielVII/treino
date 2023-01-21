package a001ListaJava;

import java.util.Scanner;

public class b06NotaFiscal {
	
	public double CalcularTotal(int quantRefri, int quantFatia) {
		final double precoRefri = 1.5;
		final double precoFatia = 3.0;
		return quantRefri * precoRefri + quantFatia * precoFatia;
		
	}
	
	public double CalcularTotalTaxado(double total) {
		return total * 1.1;
	}
	
	public double CalcularValorPorPessoa(int quantPessoas, double totalTaxado) {
		return totalTaxado/quantPessoas;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b06NotaFiscal b = new b06NotaFiscal();
		
		int quantRefri, quantFatias, quantPessoas;
		double total, totalTaxado, valorPorPessoa;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quantidade de refrigerantes: ");
		quantRefri = s.nextInt();
		s = new Scanner(System.in);
		
		System.out.print("Quantidade de fatias: ");
		quantFatias = s.nextInt();
		s = new Scanner(System.in);
		
		System.out.print("Quantidade de pessoas: ");
		quantPessoas = s.nextInt();
		
		total = b.CalcularTotal(quantRefri, quantFatias);
		totalTaxado = b.CalcularTotalTaxado(total);
		valorPorPessoa = b.CalcularValorPorPessoa(quantPessoas, totalTaxado);
		
		System.out.printf("Total: %.2f\n", total);
		System.out.printf("Total com taxa do garçon: %.2f\n", totalTaxado);
		System.out.printf("Valor por pessoa: %.2f\n", valorPorPessoa);
	}

}
