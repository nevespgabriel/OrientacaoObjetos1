package lista7ex004;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente socio = new Socio("Gabriel Neves", "06/12/2003", "3027-5193", "Rua do Chocolate", 1010, "Neves", "38290-219", "PG", "PR", "739.872.987-28");
		Filme filme = new Filme("Interstellar", 169, 25);
		
		filme.locarFilme(socio, 25);
		filme.devolverFilme(30);
	}
}
