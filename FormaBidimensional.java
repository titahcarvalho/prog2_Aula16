package prog2_aula16;

public abstract class FormaBidimensional {
	private String nome;
	public FormaBidimensional(String nome) {
		this.nome = nome;
	}
	
	public abstract void calculaArea();
	public abstract void calculaPerimetro();
	public String toString() {
		return "Nome:" + this.nome;
	}
}


