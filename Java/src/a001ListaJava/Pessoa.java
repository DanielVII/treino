package a001ListaJava;

public class Pessoa {
	private String cpf, nome;
	private double peso, altura, imc;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome, 
			String cpf, double peso,
			double altura, int idade,
			char sexo) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setPeso(peso);
		this.setAltura(altura);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setimc();
	}
	
	public Pessoa() {
		
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		if(cpf != null && cpf != "") {
			this.cpf = cpf;
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		if(nome != null && nome != "") {
			this.nome = nome;
		}
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
	}
	
	public double getImc() {
		return this.imc;
	}
	
	public void setimc() {
		if(this.altura > 0 && this.peso > 0) {
			this.imc = (this.peso / (this.altura * this.altura));
		}
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
		}
	}
	
	public char getSexo() {
		return this.sexo;
	}
	
	public void setSexo(char sexo) {
		if(sexo == 'f' || sexo == 'm') {
			this.sexo = sexo;
		}
	}
	
	@Override
	public String toString() {
		return "Pessoa: \n" +
				"    Nome: " + this.getNome() + "\n" +
				"    CPF: " + this.getCpf() + "\n" +
				"    Idade: " + this.getIdade() + "\n" +
				"    Sexo: " + this.getSexo() + "\n" +
				"    Altura: " + this.getAltura() + "\n" +
				"    Peso: " + this.getPeso() + "\n"+
				"    IMC: " + this.getImc() + "\n";
	}	
}
