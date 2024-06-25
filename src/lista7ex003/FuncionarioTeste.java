package lista7ex003;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Professor(1, "Marcos Almeida", "17/11/1994", 8900, "Mestre", 321, "Estrutura de dados", "Pilha, listas, filas, árvores, hash", 50);
		Funcionario funcionario2 = new Professor(2, "Simone Barba", "11/09/2000", 6700, 123, "Algoritmos", "Variáveis, if, else, while, for, array", 200);
		Funcionario funcionario3 = new TecnicoAdministrativo(3, "Seu Zé", "18/12/1788", 1200, 300, "19/05/1809", "Processo para exilar os padres", 200);
		
		funcionario1.exibirRelatorio();
		funcionario2.exibirRelatorio();
		funcionario3.exibirRelatorio();
	}
}
