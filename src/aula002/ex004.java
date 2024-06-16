package aula002;

public class ex004 {
	
	public static void main(String[] args) {
		
		int b=-2, a=1, c=1;
		double delta = (b*b) - (4*a*c);
		double x =  (b - Math.sqrt(delta)) / 2*a;
		System.out.println(x);
	}

}
