package a001ListaJava;

import java.util.Scanner;

public class b08CalcularImcComErroNo0 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double altura, peso;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Peso (KG): ");
		peso = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("altura (Metros): ");
		altura = s.nextDouble();
		
		if(altura == 0) {
			System.out.println("Altura não pode ser 0");
		}else {
			System.out.printf("IMC = %.2f", peso/(altura*altura));
		}
	}

}
