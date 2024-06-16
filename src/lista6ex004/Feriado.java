package lista6ex004;

public class Feriado extends Data{

	private String descricao;
	
	public Feriado() {
		
		this("Feriado");
	}
	
	public Feriado(String descricao) {
		
		super(1);
		this.descricao = descricao;
	}
	
	public Feriado(int dia, int mes, int ano, String descricao) {
		super(dia, mes, ano);
		this.descricao = descricao;
	}
	
	public String toString() {
		
		return (super.toString() + " - " + this.descricao); 
	}
}
