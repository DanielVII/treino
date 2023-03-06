package a001ListaJava;

import java.util.HashMap;
import java.util.Map;

public class b34ContarPalavras {
	
	public Map<String, Integer> hashMap = new HashMap<String, Integer>();
	
	public void ContarPalavras(String frase) {
		String[] palavras = frase.split(" ");
		
		for(String palavra : palavras) {
			if(this.hashMap.containsKey(palavra)) {
				Integer quantVelha = this.hashMap.get(palavra);
				
				this.hashMap.put(palavra, quantVelha + 1);
			}else {
				hashMap.put(palavra, 1);
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b34ContarPalavras b = new b34ContarPalavras();
		b.ContarPalavras("tres tres tres um dois dois");
		
		System.out.println(b.hashMap);
	}

}
