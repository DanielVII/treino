package a001ListaJava;

public class b37Somatorio {
	public static int SomatorioComFor(int start, int end) {
		int resultadoFor = 0;
		if(start<end) {
			for (int i = start ; i <= end ; i++) {
				resultadoFor += i;
			}			
		}else {
			for (int i = start ; i >= end ; i--) {
				resultadoFor += i;
			}
		}
		return resultadoFor;
	}
	
	public static int SomatorioComRecursividade(int start, int end) {
		int resultado = 0;
		
		if(start != end) {
			if(start < end) {
				resultado = start + SomatorioComRecursividade(start+1, end);
			}else {
				resultado = start + SomatorioComRecursividade(start-1, end);
			}
		}else {
			//Ele vai entrar aqui quando start e end forem iguais, ou seja, é o ultimo estagio da soma, ele vai retornar esse ultimo estagio e acabar a parte de empilhar
			resultado = start;
		}
		
		return resultado;
	}
	
	//C: Esse problema é bem mais facilmente resolvido com um loop, basta ver o cod acima. 
	//Claro que os dois tem sua utilidades, mas a recursividade aqui não é o recomendado.
	
	public static void main(String[] args) {
		
		System.out.println(SomatorioComFor(3, 5));
		System.out.println(SomatorioComRecursividade(4, 2));
	}
}
