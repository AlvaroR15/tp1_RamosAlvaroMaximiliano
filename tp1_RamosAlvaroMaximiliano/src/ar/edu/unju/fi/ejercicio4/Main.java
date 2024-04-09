package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un número para calcular el factorial: ");
		Integer numero = scanner.nextInt();
		Integer i = 1;
		Integer resultado = 1;
		if (numero < 0 || numero > 10) {
			System.out.println("El número tiene que estar dentro del rango númerico de 0 y 10");
		} else {
			while (i <= numero) {
				resultado *= i;
				i++;
			}
			System.out.println("El factorial de " + numero + " es: " + resultado);	
		}
		
	}

}
