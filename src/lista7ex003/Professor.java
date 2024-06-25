package lista7ex003;

public class Professor extends Funcionario{
	
	private String titulacao;
	private double gratificacaoPorTitulacao;
	private Disciplina disciplina;
	
	public Professor(int registro, String nome, String dataAdmissao, 
			double salarioBase, String titulacao, int codigo, String nomeDisciplina, 
			String ementa, int cargaHoraria) {
		
		super(registro, nome, dataAdmissao, salarioBase);
		this.titulacao = titulacao;
		this.disciplina = new Disciplina(codigo, nomeDisciplina, ementa, cargaHoraria);
		if(this.titulacao == "Mestre") {
			this.gratificacaoPorTitulacao = 1000;
		} else if(this.titulacao == "Doutor") {
			this.gratificacaoPorTitulacao = 2000;
		}
	}
	
	public Professor(int registro, String nome, String dataAdmissao, 
			double salarioBase, int codigo, String nomeDisciplina, 
			String ementa, int cargaHoraria) {
		
		super(registro, nome, dataAdmissao, salarioBase);
		this.gratificacaoPorTitulacao = 0;
		this.disciplina = new Disciplina(codigo, nomeDisciplina, ementa, cargaHoraria);
	}
	
	@Override
	public double calcularSalario() {
		
		return this.salarioBase + this.gratificacaoPorTitulacao;
	}
	
	@Override
	public void exibirRelatorio() {
		
		super.exibirRelatorio();
		if(this.titulacao != null) {
			System.out.println("Titulação: " + this.titulacao);
		}
		System.out.println("Salário total: R$" + this.calcularSalario());
		System.out.println("Código da disciplina: " + disciplina.getCodigo());
		System.out.println("Nome da disciplina: " + disciplina.getNomeDisciplina());
		System.out.println("Ementa da disciplina: " + disciplina.getEmenta());
		System.out.println("Carga horária da disciplina: " + disciplina.getCargaHoraria());
		System.out.println("============================================================");
	}
}
