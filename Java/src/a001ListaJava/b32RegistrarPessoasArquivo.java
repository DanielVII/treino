package a001ListaJava;

import java.util.ArrayList;
import java.util.List;

public class b32RegistrarPessoasArquivo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "src/RegistroPessoas.dat";
		
		//Lista de Pessoas
		List<Pessoa> lPessoas = new ArrayList<Pessoa>();
		
		Pessoa p1 = new Pessoa("DD", "21341", 75.0, 1.75, 22, 'm');
		Pessoa p2 = new Pessoa("VV", "431241", 65.0, 1.65, 26, 'f');
		
		lPessoas.add(p1);
		lPessoas.add(p2);
		
		ArquivoDePessoa arquivo = new ArquivoDePessoa(path);
		
		//arquivo.escrever(lPessoas);
		
		List<Pessoa> kPessoas = new ArrayList<Pessoa>();
		
		kPessoas = arquivo.ler();
		
		for (Pessoa p : kPessoas) {
			System.out.println(p);
		}
	}

	
	
	
	
}