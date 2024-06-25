package lista7ex004;

public class Endereco {

	private String logradouro;
	private int numeroResidencia;
	private String bairro;
	private String cep;
	private String cidade;
	private String uf;
	
	public Endereco(String logradouro, int numeroResidencia, String bairro, String cep, String cidade, String uf) {

		this.logradouro = logradouro;
		this.numeroResidencia = numeroResidencia;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}	
}
