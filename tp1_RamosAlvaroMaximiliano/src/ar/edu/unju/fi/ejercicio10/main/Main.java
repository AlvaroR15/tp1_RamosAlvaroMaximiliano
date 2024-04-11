package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Datos Pizza " + i);
			Integer diametro = null;
			do {
				System.out.println("Ingrese el diametro de la pizza");
				System.out.println("Opciones disponibles (20,30,40)");
				diametro = scanner.nextInt();
			} while(diametro != 20 && diametro != 30 && diametro != 40);
			
			System.out.println("¿Desea agregarle ingredientes especiales?");
			Boolean ingredientesEspeciales = scanner.nextBoolean();
			
			Pizza pizza = new Pizza();
			pizza.setDiametro(diametro);
			pizza.setIngredientesEspeciales(ingredientesEspeciales);
			pizza.calcularPrecio();
			pizza.calcularArea();
			
			pizza.mostarDatos();
		}
	}

}
