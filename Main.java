package prog2_aula16;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		ArrayList<FormaBidimensional> figura = new ArrayList<>();
		FormaBidimensional circulo = new Circulo ( "Circulo", 3);
		FormaBidimensional quadrado = new Quadrado ( "Quadrado", 7.5);
		FormaBidimensional triangulo = new Triangulo ( "Triangulo", 3, 5,6,7);
		
		figura.add(triangulo);
		figura.add(quadrado);
		figura.add(circulo);
		for( FormaBidimensional z : figura) {
			System.out.println(z.toString());
			z.calculaArea();
			z.calculaPerimetro();
		}
	}

}
