package entities;

//Clase Rectangulo
public class Rectangulo {
	private double base;
	private double altura;

	// Constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// Método para calcular el área del rectángulo
	public double calcularArea() {
		return base * altura;
	}

	// Getters y setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}
