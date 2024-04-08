package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número entero: ");
		int numero = scanner.nextInt();
		int resultado = 0;
		if (numero % 2 != 0) {
			resultado = numero * 2;
		} else {
			resultado = numero * 3;
		}
		
		System.out.println("Número: " + resultado);
	}

}
