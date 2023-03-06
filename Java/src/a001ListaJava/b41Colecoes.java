package a001ListaJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class b41Colecoes {

	public static void main(String[] args) {
		//LIST
		/* 
		 * A ArrayList guarda seus valores de forma adjacente na memoria, 
		 * podendo ser consultados por um index. Além disso seu tamanho é dinamico.
		 *
		*/
		List<String> AL = new ArrayList<String>();
		//ArrayList pode ser usado para guardar nome de usuarios
		
		AL.add("Daniel");
		AL.add("Lucian");
		AL.add("Rodolfo");
		
		/*
		 * LinkedList é bem parecido com a arrayList, só que a Linked 
		 * guarda as informações de forma diferente na memoria, não é um index mas sim 
		 * um valor tem uma parte reservada que guarda a localização do proximo.
		 * */
		
		List<String> LL = new LinkedList<String>();
		//LinkedList é otimo pra guarda uma fila, já que cada elemento aponta pro proximo
		
		LL.add("Daniel");
		LL.add("Lucian");
		LL.add("Rodolfo");
		
		/*
		 * Um Vector é uma arrayList com upgrade pra lidar com threads, já que ele tem
		 * o thread safe que deixa apenas uma thread modifica-lo por vez, bloqueando as outras.
		 * Assim evitando problemas de corrida. Além disso, a arraylist aumenta seu espaço com:
		 * tamanho+50%. já o vector faz: tamanho + 100%. O que é otimo se a aplicação tem muita entrada de dados.
		 * */
		
		 List<Double> V = new Vector<Double>(); 
		 
		 //Vector é otimo pra lidar com valores financeiros, já que vai ter só uma thread lidando por vez.
		 
		 V.add(222.2);
		 V.add(5555.5);
		 V.add(3333.3);
		 
	}

}
