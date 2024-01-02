package prog2_aula16;

public class Quadrado extends FormaBidimensional{
	private double lado;
	public Quadrado(String nome, double lado)
	{
		super(nome);
		this.lado=lado;
	}
	public void calculaArea() {
		double area = (this.lado * this.lado);
		System.out.println("Área: " + area);
	}
	public void calculaPerimetro() {
		double perimetro = 4*this.lado;
		System.out.println("Perímetro: " + perimetro);
	}
}