package prog2_aula16;

public class Circulo extends FormaBidimensional{
	private double raio;
	public Circulo(String nome, double raio)
	{
		super(nome);
		this.raio=raio;
	}
	public void calculaArea() {
		double area = 3.14*(this.raio * this.raio);
		System.out.println("Área: " + area);
	}
	public void calculaPerimetro() {
		double perimetro = 2*3.14*this.raio;
		System.out.println("Perímetro: " + perimetro);
	}
}
