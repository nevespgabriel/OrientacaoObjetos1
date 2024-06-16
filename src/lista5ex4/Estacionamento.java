package lista5ex4;
import java.util.List;
import java.util.ArrayList;

public class Estacionamento {

	private List<Vaga> vagas;
	
	public Estacionamento() {
		
		this.vagas = new ArrayList<Vaga>();
	}
	
	public void adicionarVaga(int numeroVaga) {
		
		Vaga vaga = new Vaga(numeroVaga);
		vagas.add(vaga);
	}
	
	public void alocarVaga(int numeroVaga, String placa, int horaAlocacao) {
		
		for(Vaga vaga : vagas) {
			
			if(vaga.getNumeroVaga() == numeroVaga) {
				
				vaga.alocar(placa, horaAlocacao);
				System.out.println("Vaga alocada com sucesso!");
				return;
			}
		}
		System.out.println("Não foi possível encontrar vaga com o número " + numeroVaga);
	}
	
	public void liberarVaga(int numeroVaga, int horaRetirada) {
		
		for(Vaga vaga : vagas) {
			
			if(vaga.getNumeroVaga() == numeroVaga) {
				
				vaga.liberar(horaRetirada);
				return;
			}
		}
		System.out.println("Não foi possível encontrar vaga com o número " + numeroVaga);
	}
}
