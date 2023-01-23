package a001ListaJava;

import java.util.Scanner;

public class b12AprovadoReprovadoRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double nota;
		final double aprovado = 7.0;
		final double reprovado = 4.0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Nota do aluno: ");
		nota = s.nextDouble();
		
		if (nota < reprovado) {
			System.out.println("Aluno reprovado");
		}else if(nota >= aprovado) {
			System.out.println("Aluno aprovado");
		}else {
			System.out.println("Aluno em recuperação");
		}
	}

}
