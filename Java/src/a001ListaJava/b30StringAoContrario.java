package a001ListaJava;

public class b30StringAoContrario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "malhoha kja";
		
		int tamanhoString = s.length();
		int ultimoIndex = tamanhoString - 1;
		
		char[] invert = new char[tamanhoString];
		
		for (int i = 0 ; i < tamanhoString ; i++) {
			invert[i] = s.charAt(ultimoIndex - i);
		}
		
		for (int i = 0 ; i < tamanhoString ; i++) {
			System.out.print(invert[i]);
		}
		
	}

}
