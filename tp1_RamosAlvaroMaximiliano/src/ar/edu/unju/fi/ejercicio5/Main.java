package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número del 1 al 9 para mostrar su tabla de multiplicar:");
		Integer numero = scanner.nextInt();
		if (numero < 1 || numero > 9) {
			System.out.println("El número debe estar dentro del rango solicitado.");
		} else {
			for (int i = 0; i < 11; i++) {
				System.out.println(numero + " x " + i + " = " + (numero*i));
			}
		}
		
	}

}
