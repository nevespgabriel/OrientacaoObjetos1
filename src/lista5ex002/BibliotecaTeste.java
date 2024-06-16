package lista5ex002;

public class BibliotecaTeste {

	public static void main(String[] args) {
		
		Biblioteca biblioteca1 = new Biblioteca("Biblioteca UTFPR");
		biblioteca1.cadastrarLivro("Historia da Filosofia", "Neil G.", 2005, "Pensar", 308);
		biblioteca1.cadastrarLivro("A República", "Platão", 305, "Acrópole", 211);
		biblioteca1.emprestarLivro("Sartre", 4);
		biblioteca1.emprestarLivro("Historia da Filosofia", 4);
		biblioteca1.emprestarLivro("A República", 7);
		biblioteca1.devolverLivro("Historia da Filosofia", 11);
		biblioteca1.devolverLivro("A República", 18);
	}
}
