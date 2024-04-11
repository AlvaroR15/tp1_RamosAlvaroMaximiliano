package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Integer cantidad;
		do {
			System.out.println("Ingrese un número");
			cantidad = scanner.nextInt();
		} while (cantidad < 5 || cantidad > 10);
		
		String[] array = new String[cantidad];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un nombre para almacenar en el array");
			array[i] = scanner.next();
		}
		
		System.out.println("Array empezando por el indice 0:");
	    for (int i = 0; i < array.length; i++) {
	    	System.out.println("Posición " + i + ": " + array[i]);
	    }

	    System.out.println("Array empezando por el ultimo indice:");
	    for (int i = array.length - 1; i >= 0; i--) {
	    	System.out.println("Posición " + i + ": " + array[i]);
	    }
	}

}
