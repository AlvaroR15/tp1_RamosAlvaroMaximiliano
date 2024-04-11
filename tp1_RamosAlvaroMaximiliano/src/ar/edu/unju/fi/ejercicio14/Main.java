package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Integer cantidad = null;
		int j = 0;
		
		do {
			System.out.println("Ingrese un número que este entre el 3 y el 10");
			cantidad = scanner.nextInt();
		} while (cantidad <3 || cantidad > 10);
		
		Integer[] array = new Integer[cantidad];	
		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un número para almacenar en el array");
			array[i] = scanner.nextInt();
			scanner.nextLine();			
		}
		
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("El valor en la posicion "+i+" es " + array[i]);
			suma += array[i];
		}
		
		System.out.println("La suma total es: " + suma);
	}

}
