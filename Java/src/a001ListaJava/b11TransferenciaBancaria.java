package a001ListaJava;

public class b11TransferenciaBancaria {
	public double saldo;
	
	public void Transferir(b11TransferenciaBancaria conta, double valor) {
		if (valor > this.saldo) {
			System.out.println("O valor transferido é maior que o saldo da conta");
		}else {
			this.saldo -= valor;
			conta.saldo += valor;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b11TransferenciaBancaria c1 = new b11TransferenciaBancaria();
		b11TransferenciaBancaria c2 = new b11TransferenciaBancaria();
		
		c1.saldo = 100;
		c2.saldo = 100;
		double valorATransferir = 100;
		
		System.out.printf("A primeira conta, que tem: %.2f, quer transferir %.2f\n", c1.saldo, valorATransferir);
		c1.Transferir(c2, valorATransferir);
		System.out.printf("Saldo conta 1: %.2f\n", c1.saldo);
		System.out.printf("Saldo conta 2: %.2f\n", c2.saldo);
		
	}

}
