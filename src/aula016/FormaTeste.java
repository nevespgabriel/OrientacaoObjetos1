package aula016;
import java.util.Scanner;

public class FormaTeste {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Forma forma = null;
		int resp;
		
		System.out.println("Escolha o que deseja instanciar:\n[1] Circulo");
		System.out.println("[2] Quadrado\n[3] Retângulo");
		resp = input.nextInt();
		
		switch(resp) {
			case 1:
				forma = new Circulo("Vermelho", 2);
				break;
			case 2:
				forma = new Quadrado("Azul", 2);
				break;
			case 3:
				forma = new Retangulo("Amarelo", 2, 4);
				break;
			default:
				System.out.println("Opção inválida");
		}
		System.out.println("Área = " + forma.calcularArea());
		System.out.println("Perímetro = " + forma.calcularPerimetro());
		
	}
}
