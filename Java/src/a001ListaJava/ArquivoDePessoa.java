package a001ListaJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArquivoDePessoa {
	private String path;
	
	public ArquivoDePessoa(String path) {
		this.path = path;
	}
	
	public void escrever(List<Pessoa> lPessoas) {
		try {
			File file = new File(this.path);
	    	file.delete();
	        file.createNewFile();
	        
			ObjectOutputStream objtO = new ObjectOutputStream(new FileOutputStream(this.path));
			for (Pessoa p : lPessoas) {
				objtO.writeObject(p);
			}
			objtO.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Pessoa> ler(){
		List<Pessoa> lPessoas = new ArrayList<Pessoa>();
		try {
			File file = new File(this.path);
			ObjectInputStream objtIn = new ObjectInputStream(new FileInputStream(file));
			lPessoas = (ArrayList<Pessoa>) objtIn.readObject();
			objtIn.close();
		}catch (IOException e) {
			System.out.println(e.getMessage());
		 }catch (ClassNotFoundException e) {
			 System.out.println(e.getMessage());
		 	}
		return lPessoas;
	}
}
