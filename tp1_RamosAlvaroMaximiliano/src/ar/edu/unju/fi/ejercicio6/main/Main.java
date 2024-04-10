package ar.edu.unju.fi.ejercicio6.main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.model.Persona;

public class Main {

	public static void main(String[] args) {
		generarPersona();
	}
	
	public static void generarPersona() {
		Scanner scanner = new Scanner(System.in);
		Persona persona = null;
		Integer opcion = null;
		do {
			System.out.println("¿Que constructor desea usar?");
			System.out.println("1: Constructor por defecto");
			System.out.println("2: Constructor parametrizado");
			System.out.println("3: Constructor parametrizado sin incluir la provincia (por defecto en Jujuy)");
			opcion = scanner.nextInt();
			if (opcion < 1 || opcion > 3) {
				System.out.println("La opción ingresada no es válida");
			} 
		} while (opcion < 1 || opcion > 3);
		
		
		switch (opcion) {
		case 1: 
			persona = personaUno();
			persona.mostrarDatos();
			break;
		case 2: 
			persona = personaDos();
			persona.mostrarDatos();
			break;
		case 3: 
			persona = personaTres();
			persona.mostrarDatos();
			break;
		}
	}
	
	public static Persona personaUno() {
		Persona usuarioUno = new Persona();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese dni");
		usuarioUno.setDni(scanner.next());
		
		System.out.println("Ingrese nombre");
		scanner.nextLine();
		usuarioUno.setNombre(scanner.nextLine());
		
		LocalDate fecha = pedirFecha();
		usuarioUno.setFechaDeNacimiento(fecha);
		
		System.out.println("Ingresar provincia");
		usuarioUno.setProvincia(scanner.nextLine());
		
		return usuarioUno;
	}
	
	public static Persona personaDos() {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese dni");
		String dni = scanner.next();
		
		System.out.println("Ingrese nombre");
		scanner.nextLine();
		String nombre = scanner.nextLine();
		
		LocalDate fecha = pedirFecha();
		
		System.out.println("Ingresar provincia");
		String provincia = scanner.nextLine();
		
		
		Persona usuarioDos = new Persona(dni,nombre,fecha,provincia);
		return usuarioDos;
	}
	
	public static Persona personaTres() {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese dni");
		String dni = scanner.next();
		
		System.out.println("Ingrese nombre");
		scanner.nextLine();
		String nombre = scanner.nextLine();
		
		LocalDate fecha = pedirFecha();
				
		Persona usuarioTres = new Persona(dni,nombre,fecha);
		return usuarioTres;
	}
	
	
	public static LocalDate pedirFecha() {
		Scanner scanner = new Scanner(System.in);
		LocalDate fechaConfigurada = null;
		Boolean fechaValida = false;
		
		while (!fechaValida) {
			System.out.println("Ingrese fecha de nacimiento de la siguiente manera: " + LocalDate.now());
			String fechaIngresada = scanner.nextLine();
			try {
				fechaConfigurada = LocalDate.parse(fechaIngresada);
				fechaValida = true;
			} catch(Exception error) {
				System.out.println("El formato no es válido. Ingrese la fecha nuevamente.");
			}
		}

		return fechaConfigurada;
	}

}
