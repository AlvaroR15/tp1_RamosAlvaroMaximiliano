package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] array = new Integer[8];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Ingrese un número entero para la posición "+i+" del array");
			array[i] = scanner.nextInt();
			scanner.nextLine();
		}
		
		for (int j = 0; j < array.length; j++) {
			System.out.println("El número en la posicion "+j+" es " + array[j]);
		}
	}

}
