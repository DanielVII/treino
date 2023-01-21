package a001ListaJava;

import java.math.*;
import java.util.Scanner;
public class b09AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raio;
		
		System.out.print("Raio: ");
		Scanner s = new Scanner(System.in);
		raio = s.nextDouble();
		
		if (raio <= 0) {
			System.out.println("O raio tem que ser maior que zero.");
		}
		else {
			System.out.printf("Area do circulo: %.2f", Math.PI * raio * raio);
		}
	}

}
