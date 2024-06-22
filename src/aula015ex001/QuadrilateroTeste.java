package aula015ex001;

public class QuadrilateroTeste {

	public static void main(String[] args) {
		
		Quadrilatero quadrado = new Quadrado(2.0);
		quadrado.calcularArea();
		
		Quadrilatero retangulo = new Retangulo(4.0, 5.0);
		retangulo.calcularArea();
		
		Quadrilatero losango = new Losango(2.0, 3.0);
		losango.calcularArea();
	}
}
