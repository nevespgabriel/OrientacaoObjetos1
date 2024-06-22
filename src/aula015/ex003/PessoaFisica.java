package aula015.ex003;

public class PessoaFisica extends Pessoa{

	private double gastoComSaude;
	
	public PessoaFisica(String nome, double rendaAnual, double gastoComSaude) {
		super(nome, rendaAnual);
		this.gastoComSaude = gastoComSaude;
	}
	
	@Override
	public void calcularImposto(){
		double taxa, imposto;
		if(this.rendaAnual >= 20000) {
			taxa = 0.25;
		}
		else {
			taxa = 0.15;
		}
		imposto = (taxa * this.rendaAnual) - (this.gastoComSaude / 2);
		System.out.println("Imposto a ser pago: R$" + imposto);
	}
}
