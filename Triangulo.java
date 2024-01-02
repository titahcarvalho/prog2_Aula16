package prog2_aula16;

public class Triangulo extends FormaBidimensional{
	private double altura;
	private double ladoA,ladoB,ladoC;
	public Triangulo(String nome, double altura,double ladoA, double ladoB, double ladoC)	{
		super(nome);
		this.altura=altura;
		this.ladoA=ladoA;
		this.ladoB=ladoB;
		this.ladoC=ladoC;
		
	}
	public void calculaArea() {
		double area = (this.ladoA * (this.altura/2));
		System.out.println("Área: " + area);
	}
	public void calculaPerimetro() {
		double perimetro = this.ladoA + this.ladoB + this.ladoC;
		System.out.println("Perímetro: " + perimetro);
	}
}