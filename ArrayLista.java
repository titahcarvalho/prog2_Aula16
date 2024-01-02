package prog2_aula16;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLista {

	public static void main(String[] args) {
		ArrayList<String>bandas = new ArrayList<>();
		bandas.add("Mamonas Assassinas");
		bandas.add("Barão Vermelho");
		bandas.add("Titãs");
		
		//System.out.println(Arrays.toString(bandas.toArray()));
		/*Método 'toString' da classe Arrays retorna um String 
		com os elementos de um Array e método toArray() 
		transforma um ArrayList em Array.*/
		
		System.out.println("índice 0: " + bandas.get(0));
		System.out.println("índice 1: " + bandas.get(1));
		System.out.println("índice 2: " + bandas.get(2));
		
		//bandas.clear();
		
	}

}
