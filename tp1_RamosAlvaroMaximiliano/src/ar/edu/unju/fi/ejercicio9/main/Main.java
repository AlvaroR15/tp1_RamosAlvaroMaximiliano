package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		while (i < 4) {
			System.out.println("Ingrese nombre del producto " + i);
			String nombre = scanner.nextLine();
			
			System.out.println("Ingrese código del producto " + i);
			String codigo = scanner.nextLine();
			
			System.out.println("Ingrese el precio del producto " + i);
			Double precio = scanner.nextDouble();
			
			Integer descuento;
			
			do {
				System.out.println("Ingrese el descuento para el producto: ");
				descuento = scanner.nextInt();
				scanner.nextLine();
				if (descuento < 0 || descuento > 50) {
					System.out.println("El descuento no puede ser mayor de 50 o menor que 0");
				}
				} while(descuento > 50 || descuento < 0);
				
			
			Producto producto = new Producto(nombre,codigo,precio,descuento);
			System.out.println("Datos del producto: "+ producto.toString());
			System.out.println("Producto con descuento: " +  producto.calcularDescuento());
			i++;
		}
	}

}
