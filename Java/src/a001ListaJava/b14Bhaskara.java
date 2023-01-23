package a001ListaJava;

import java.lang.Math.*;
import java.util.Scanner;

public class b14Bhaskara {
	double a, b, c;
	
	public double calcularDelta() {
		return this.b*this.b - 4 * this.a * this.c;
	}
	
	public void raizes(double delta) {
		if(delta > 0) {
			double x1 = (this.b * -1 + Math.pow(delta, 0.5)) / (2*this.a);
			double x2 = (this.b * -1 - Math.pow(delta, 0.5)) / (2*this.a);
			System.out.printf("Raiz 1: %.2f\n", x1);
			System.out.printf("Raiz 2: %.2f\n", x2);
		}else if(delta == 0) {
			double x1 = (this.b * -1)/2*this.a;
			System.out.printf("Raiz 1: %.2f\n", x1);
		}else {
			System.out.println("Não é possivel calcular. Raiz menor que 0");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b14Bhaskara bhask= new b14Bhaskara();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("A: ");
		bhask.a = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("B: ");
		bhask.b = s.nextDouble();
		s = new Scanner(System.in);
		
		System.out.print("C: ");
		bhask.c = s.nextDouble();
		
		double delta = bhask.calcularDelta();
		
		bhask.raizes(delta);
	}

}
