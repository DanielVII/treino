package a001ListaJava;

import java.util.Scanner;

public class b18ChecarSenha {
	public String senha;
	
	public void checarSenhaComWhile() {
		
		String senhaPedida = "";
		
		while (!(senhaPedida.equals(this.senha))) {
			Scanner s = new Scanner(System.in);
			System.out.print("Senha: ");
			senhaPedida = s.next();
		}
	}
	
public void checarSenhaComDoWhile() {
		
		String senhaPedida = "";
		
		 do{
			Scanner s = new Scanner(System.in);
			System.out.print("Senha: ");
			senhaPedida = s.next();
		}while (!(senhaPedida.equals(this.senha)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b18ChecarSenha b = new b18ChecarSenha();
		b.senha = "aloha";
		
		System.out.println("Checando senha com while: ");
		b.checarSenhaComWhile();
		System.out.println("Senha correta!");
		
		System.out.println("Checando senha com do while: ");
		b.checarSenhaComDoWhile();
		System.out.println("Senha correta!");
		
	}

}
