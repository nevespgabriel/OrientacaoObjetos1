package aula015.ex003;

public class PessoaJuridica extends Pessoa{
	
	private int numeroFuncionarios;
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	@Override
	public void calcularImposto() {
		double taxa;
		if(numeroFuncionarios > 15) {
			taxa = 0.13;
		} else {
			taxa = 0.18;
		}
		System.out.println("Imposto a ser pago: R$" + taxa * rendaAnual);
	}
}
