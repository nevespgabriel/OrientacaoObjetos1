package lista7ex003;

public class TecnicoAdministrativo extends Funcionario{

	private double adicionalNoturno;
	private Processo processo;
	
	public TecnicoAdministrativo(int registro, String nome, String dataAdmissao, 
			double salarioBase, int numero, String dataCriacao, String descricao,
			double adicionalNoturno) {
		
		super(registro, nome, dataAdmissao, salarioBase);
		this.processo = new Processo(numero, dataCriacao, descricao);
		this.adicionalNoturno = adicionalNoturno;
	}
	
	@Override
	public double calcularSalario() {
		
		return this.salarioBase + this.adicionalNoturno;
	}
	
	@Override
	public void exibirRelatorio() {
			
		super.exibirRelatorio();
		System.out.println("Salário total: R$" + this.calcularSalario());
		processo.imprimirDados();
		System.out.println("============================================================");
	}
}
