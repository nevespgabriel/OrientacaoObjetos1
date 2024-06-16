package praticapessoa;

public class Pessoa {
	String nome;
	int idade;
	double peso;
	
	public Pessoa(String nome, int idade, double peso) {
		
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	
	public void andar() {
		
		System.out.println(nome + " está andando.");
	}
	
	public void correr() {
		
		System.out.println(nome + " está correndo");
	}

	public void falar() {
		
		System.out.println(nome + " está falando");
	}
	
	public String toString() {
		
		return nome + " " + idade + " " + peso;
	}
}
