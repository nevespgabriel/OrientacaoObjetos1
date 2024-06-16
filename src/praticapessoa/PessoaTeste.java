package praticapessoa;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", 25, 68.5);
		Pessoa p2 = new Pessoa("Maria", 30, 55.6);
		Pessoa p3 = new Pessoa("José", 32, 62.4);
		
		p1.andar();
		p2.correr();
		p3.falar();
		
		System.out.println(p1);
				
	}
}
