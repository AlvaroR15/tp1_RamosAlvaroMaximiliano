package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;



public class Main {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Persona persona = new Persona();

		 System.out.println("Ingrese el nombre de la persona:");
		 persona.setNombre(scanner.nextLine());
		 
		 persona.setFechaDeNacimiento(pedirFecha());
		 
		 persona.mostrarDatos();
		 
	}

	public static Calendar pedirFecha() {
		System.out.println("Ingrese día de nacimiento");
		Integer dia = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Ingrese el mes de nacimiento");
		Integer mes = scanner.nextInt()-1;
		scanner.nextLine();
		
		System.out.println("Ingrese el año de nacimiento");
		Integer anio = scanner.nextInt();
		scanner.nextLine();
		
		Calendar fecha = new GregorianCalendar(anio,mes,dia);
		return fecha;
	}
}
