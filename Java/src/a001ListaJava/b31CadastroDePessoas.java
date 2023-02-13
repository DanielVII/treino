package a001ListaJava;

import java.util.Scanner;

public class b31CadastroDePessoas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Quantas pessoas vc quer registrar? ");
		int quantPessoas = s.nextInt();
		s = new Scanner(System.in);
		
		Pessoa[] pArray = new Pessoa[quantPessoas];
		
		for(int i = 0 ; i < quantPessoas ; i++) {
			Pessoa p = new Pessoa();
			System.out.println("Pessoa" + i);
			System.out.print("Nome: ");
			p.setNome(s.next());
			
			s = new Scanner(System.in);
			
			System.out.print("CPF: ");
			p.setCpf(s.next());
			s = new Scanner(System.in);
			
			System.out.print("Peso");
			p.setPeso(s.nextDouble());
			s = new Scanner(System.in);
			
			System.out.print("Altura: ");
			p.setAltura(s.nextDouble());
			s = new Scanner(System.in);
			
			System.out.print("Idade: ");
			p.setIdade(s.nextInt());
			s = new Scanner(System.in);
			
			System.out.print("Sexo: ");
			p.setSexo(s.next().charAt(0));
			
			p.setimc();
			
			pArray[i] = p;
		}
		
		for(int i = 0 ; i < quantPessoas ; i++) {
			Pessoa pNow = pArray[i];
			System.out.println();
			System.out.println("Nome: " + pNow.getNome());
			System.out.println("Idade: " + pNow.getIdade());
			System.out.println("Cpf: " + pNow.getCpf());
			System.out.println("Sexo: " + pNow.getSexo());
			System.out.println("Peso: " + pNow.getPeso());
			System.out.println("Altura: " + pNow.getAltura());
			System.out.printf("Imc: %.2f", pNow.getImc());
			System.out.println();
		}
		
	}

}
