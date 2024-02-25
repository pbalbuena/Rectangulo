package main;

import entities.Rectangulo;

public class Main {

	public static void main(String[] args) {
		// Creación de dos objetos Rectangulo
		Rectangulo rectangulo1 = new Rectangulo(5.0, 3.0);
		Rectangulo rectangulo2 = new Rectangulo(7.0, 4.0);

		// Cálculo y muestra del área de cada rectángulo
		System.out.println("Área del rectángulo 1: " + rectangulo1.calcularArea());
		System.out.println("Área del rectángulo 2: " + rectangulo2.calcularArea());

	}

}
