package a001ListaJava;

import java.util.Scanner;

public class b02Input {

	public int idade;
	public double altura;
	public char primeiraLetra;
	public String nomeCompleto;
	
	public void pedirValores() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Seu nome: ");
		this.nomeCompleto = s.nextLine();
		
		s = new Scanner(System.in);
		
		System.out.println("Primeira letra do seu nome: ");
		this.primeiraLetra = s.next().charAt(0);
		
		s = new Scanner(System.in);
		
		System.out.println("Idade: ");
		this.idade = s.nextInt();
		
		s = new Scanner(System.in);
		
		System.out.println("Altura: ");
		this.altura = s.nextDouble();
	}
	
	public static void main(String[] args) {
		b02Input b = new b02Input();
		
		b.pedirValores();
		
		System.out.printf("Nome: %s\nPrimeiro letra do nome: %s\nIdade: %d\nAltura: %.2f", 
							b.nomeCompleto,
							b.primeiraLetra,
							b.idade,
							b.altura);

	}

}
