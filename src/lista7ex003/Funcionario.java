package lista7ex003;

public abstract class Funcionario {

	protected int registro;
	protected String nome;
	protected String dataAdmissao;
	protected double salarioBase;
	
	public Funcionario(int registro, String nome, String dataAdmissao, double salarioBase) {

		this.registro = registro;
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salarioBase = salarioBase;
	}	
	
	public abstract double calcularSalario();
	
	public void exibirRelatorio() {
		
		System.out.println("============================================================");
		System.out.println("Registro: " + this.registro);
		System.out.println("Nome: " + this.nome);
		System.out.println("Data de admissão: " + this.dataAdmissao);
	}
}
