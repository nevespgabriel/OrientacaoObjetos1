package lista6ex004;

public class DiaTeste {

	public static void main(String[] args) {
		
		Feriado dia1 = new Feriado();
		Feriado dia2 = new Feriado("Ano novo");
		Feriado dia3 = new Feriado(1, 5, 2024, "Dia do Trabalhador");
		Data dia4 = new Data(12, 2003);
		
		System.out.println(dia1);
		System.out.println(dia2);
		System.out.println(dia3);
		System.out.println(dia4);
	}
}
