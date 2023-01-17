package a001ListaJava;

public class b01VarEOutput {
	
	public static int idade = 22;
	public static double altura = 1.83;
	public static char primeiraLetra = 'D';
	public static String nomeCompleto = "Daniel Dantas";

	
	public static void main(String[] args) {
		System.out.printf("Nome: %s\nPrimeiro letra do nome: %s\nIdade: %d\nAltura: %.2f", 
							nomeCompleto,
							primeiraLetra,
							idade,
							altura);

	}

}
