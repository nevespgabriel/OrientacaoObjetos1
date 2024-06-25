package lista7ex003;

public class Disciplina {

	private int codigo;
	private String nomeDisciplina;
	private String ementa;
	private int cargaHoraria;
	
	public Disciplina(int codigo, String nomeDisciplina, String ementa, int cargaHoraria) {
		
		this.codigo = codigo;
		this.nomeDisciplina = nomeDisciplina;
		this.ementa = ementa;
		this.cargaHoraria = cargaHoraria;
	}

	public int getCodigo() {
		
		return this.codigo;
	}

	public String getNomeDisciplina() {
		
		return this.nomeDisciplina;
	}

	public String getEmenta() {
		
		return this.ementa;
	}

	public int getCargaHoraria() {
		
		return this.cargaHoraria;
	}
}
