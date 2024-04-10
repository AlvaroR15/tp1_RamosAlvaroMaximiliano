package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		Empleado empleado = generarEmpleado();
		empleado.mostrarDatos();
		empleado.aumentarSalario(4);
		empleado.mostrarDatos();
	}

	public static Empleado generarEmpleado() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el nombre completo del empleado");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese el legajo");
		Integer legajo = scanner.nextInt();
		
		System.out.println("Ingrese el salario");
		Double salario = scanner.nextDouble();
		
		Empleado empleado = new Empleado(nombre,legajo,salario);
		return empleado;
	}
}
