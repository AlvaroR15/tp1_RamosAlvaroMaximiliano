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
		Integer dia, mes, anio;
		
		do {
			System.out.println("Ingrese día de nacimiento");
			dia = scanner.nextInt();
			scanner.nextLine();			
		} while(dia < 1 || dia > 31);
		
		do {
			System.out.println("Ingrese el mes de nacimiento");
			mes = scanner.nextInt()-1;
			scanner.nextLine();
		} while(mes < 0 || mes > 11);
		
		
		Calendar hoy = Calendar.getInstance();
		Integer anioActual = hoy.get(Calendar.YEAR);
		do {
			System.out.println("Ingrese el año de nacimiento");
			anio = scanner.nextInt();
			scanner.nextLine();
		} while (anio > anioActual);
		
		Calendar fecha = new GregorianCalendar(anio,mes,dia);
		return fecha;
	}
}
