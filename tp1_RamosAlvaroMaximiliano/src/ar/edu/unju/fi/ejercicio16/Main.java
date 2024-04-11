package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        System.out.println("Ingrese los nombres de las personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese nombre: ");
            nombres[i] = scanner.nextLine();
        }

        System.out.println("Nombres almacenados en el array:");
        int i = 0;
        while (i < nombres.length) {
            System.out.println(i+" - Nombre " + nombres[i]);
            i++;
        }

        System.out.println("El tamaño del array es: " + nombres.length);
        
        byte indice;
        do {
        	System.out.println("Ingrese el indice del nombre que desea eliminar");
        	indice = scanner.nextByte();
        	if (indice < 0 || indice >= nombres.length) {
        		System.out.println("El indice tiene que estar entre 0 y 5");
        	}
        } while (indice < 0 || indice >= nombres.length);
        
        
        // Eliminar elemento
        for(int j = indice; j < nombres.length - 1; j++) {
        	nombres[j] = nombres[j+1];
        }
        nombres[nombres.length -1 ] = "";
        
        // array modificado
        System.out.println("Array modificado");
        for(int j = 0; j < nombres.length; j++) {
        	System.out.println(j+"- Nombre: " + nombres[j]);
        }
	}

}
