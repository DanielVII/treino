package a001ListaJava;

public class b33ContarLetras {
	char letra;
	int quant;
	
	public b33ContarLetras(final char a, final int b) {
		this.letra = a;
		this.quant = b;
	}
	
	public static void main(String[] args) {
		String palavra = "aloha";
		
		int tamanho = palavra.length();
		
		b33ContarLetras[] bc = new b33ContarLetras[tamanho];
		
		for(int p = 0;p<tamanho;p++) {
			//populando a array com as letras da palavra
			char letra = palavra.charAt(p);
			bc[p] = new b33ContarLetras(letra, 1);
		}
		
		for(int i = 0; i < tamanho; i++) {
			//primeiro loop é usado pra pegar da primeira até a ultima letra
			for(int j = i+1; j < tamanho; j++) {
				//o loop começa no posterior a letra que está sendo analisada
				if(bc[i].letra == bc[j].letra) {
					//se achar alguma letra igual, essa letra vai ser somada e depois apagada da array
					char vazio = ' ';
					bc[i].quant += bc[j].quant; 
					bc[j].letra = vazio;
					bc[j].quant = 0;
				}
		}}
		
		for(int q = 0;q<tamanho;q++) {
			if(bc[q].letra != ' ') {
			System.out.println(bc[q].letra + ": " + bc[q].quant);
		}}
	}

}
