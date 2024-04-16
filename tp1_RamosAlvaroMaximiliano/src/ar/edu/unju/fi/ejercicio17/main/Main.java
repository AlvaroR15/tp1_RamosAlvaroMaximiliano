package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Jugador> jugadores;

	public static void main(String[] args) {
		precargarJugadores();
		Integer opcion = null;
        do {
            System.out.println("----MENU DE OPCIONES----");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores en la lista");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
    		case 1: altaJugador();break;
    		case 2: mostrarDatosDelJugador();break;
    		case 3: ordenarJugadoresPorApellido();break;
    		case 4: modificarJugador();break;
    		case 5: eliminarJugador();break;
    		case 6: mostrarTotalJugadores();break;
    		case 7: mostrarTotalJugadoresPorNacionalidad();break;
    		case 8: break;
    		default: System.out.println("ERROR: La opción ingresada no es válida. Por favor lea las opciones disponibles.");
    		}
        } while (opcion != 8);
		
	}
	
	
	
	
	public static void altaJugador() {
	        System.out.println("Ingrese el nombre del jugador: ");
	        String nombre = scanner.nextLine();
	        
	        System.out.println("Ingrese el apellido del jugador: ");
	        String apellido = scanner.nextLine();
	        
	        System.out.println("Ingrese la fecha de nacimiento del jugador de la siguiente manera: "+LocalDate.now());
	        LocalDate fechaNacimiento = LocalDate.parse(scanner.nextLine());
	        
	        System.out.println("Ingrese la nacionalidad del jugador: (argentino, uruguayo, brasileño, etc)");
	        String nacionalidad = scanner.nextLine();
	        
	        System.out.println("Ingrese la estatura del jugador (en metros): ");
	        Float estatura = scanner.nextFloat();scanner.nextLine();
	        
	        System.out.println("Ingrese el peso del jugador (en kilogramos): ");
	        Float peso = scanner.nextFloat();scanner.nextLine();
	        
	        
	        System.out.println("Ingrese la posición del jugador: ");
	        String posicion = scanner.nextLine();

	        Jugador jugador = new Jugador(nombre,apellido,fechaNacimiento,nacionalidad,estatura,peso,posicion);
	        jugadores.add(jugador);
	    }
	
	
	public static void mostrarDatosDelJugador() {
		String[] nombreYapellidoJugador = pedirNombreYapellido();
        String nombre = nombreYapellidoJugador[0];
        String apellido = nombreYapellidoJugador[1];

        Jugador jugadorEncontrado = null;
        for (Jugador jugador: jugadores) {
        	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
        		jugadorEncontrado = jugador;
        		System.out.println("El jugador que se encontro es: " + jugadorEncontrado.toString());
        		break;
        	}
        }
        if (jugadorEncontrado == null) {
    		System.out.println("El jugador no esta cargado en el registro");
        }
    }
	
	
	public static void ordenarJugadoresPorApellido() {
		jugadores.sort(Comparator.comparing(Jugador::getApellido));
		jugadores.forEach(jugadores -> System.out.println(jugadores));
    }
	
	
	public static void modificarJugador() {
		String[] nombreYapellidoJugador = pedirNombreYapellido();
        String nombre = nombreYapellidoJugador[0];
        String apellido = nombreYapellidoJugador[1];

		Jugador jugadorAmodificar = null;
        
        for (Jugador jugador: jugadores) {
        	if (jugador.getApellido().equals(apellido) && jugador.getNombre().equals(nombre)) {
        		jugadorAmodificar = jugador;
        		break;
        	}
        }
        
        if (jugadorAmodificar != null) {
        	System.out.println("Ingrese el nuevo nombre del jugador: ");
            jugadorAmodificar.setNombre(scanner.nextLine());
            
            System.out.println("Ingrese el nuevo apellido del jugador: ");
            jugadorAmodificar.setApellido(scanner.nextLine());
            
            System.out.println("Ingrese la nueva fecha de nacimiento del jugador de la siguiente manera: "+LocalDate.now());
            jugadorAmodificar.setFechaDeNacimiento(LocalDate.parse(scanner.nextLine()));
            
            System.out.println("Ingrese la nueva nacionalidad del jugador: ");
            jugadorAmodificar.setNacionalidad(scanner.nextLine());
            
            System.out.println("Ingrese la nueva estatura del jugador (en metros): ");
            jugadorAmodificar.setEstatura(scanner.nextFloat());scanner.nextLine();
            
            System.out.println("Ingrese el nuevo peso del jugador (en kilogramos): ");
            jugadorAmodificar.setPeso(scanner.nextFloat());scanner.nextLine();
            
            System.out.println("Ingrese la posición del jugador: ");
            jugadorAmodificar.setPosicion(scanner.nextLine());
            
            System.out.println(jugadorAmodificar.toString());
                
        } else {
    		System.out.println("El jugador no esta cargado en el registro");
        }
        
	}

	
	
	public static void eliminarJugador() {
		String[] nombreYapellidoJugador = pedirNombreYapellido();
        String nombre = nombreYapellidoJugador[0];
        String apellido = nombreYapellidoJugador[1];

        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
        	Jugador jugador = iterator.next();
        	if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
        		iterator.remove();
        		System.out.println("El jugador "+nombre+" "+apellido+" ha sido eliminado de la lista");
        	}
        }
        
	}
	
	
	public static void mostrarTotalJugadores() {
		System.out.println("La cantidad de jugadores en la lista son: " + jugadores.size());
		jugadores.forEach(jugadores -> System.out.println(jugadores));
	}
	
	
	public static void mostrarTotalJugadoresPorNacionalidad() {
		System.out.println("Ingrese la nacionalidad a filtrar");
		String nacionalidad = scanner.nextLine();
		
		Integer total= 0;
		List<Jugador> jugadoresPorNacionalidad = new ArrayList<>();
	    for (Jugador jugador : jugadores) {
	        if (jugador.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
	            jugadoresPorNacionalidad.add(new Jugador(jugador.getNombre(),jugador.getApellido(),jugador.getFechaDeNacimiento(),jugador.getNacionalidad(),jugador.getEstatura(),jugador.getPeso(),jugador.getPosicion()));
	            total++;
	        }
	    }
	    
	    System.out.println("La cantidad de jugadores "+nacionalidad+"s es: "+total);
	    jugadoresPorNacionalidad.forEach(j -> System.out.println(j));
	}

	
	public static String[] pedirNombreYapellido() {
		String[] nombreYApellido = new String[2];
	    System.out.println("Ingrese el nombre del jugador:");
	    nombreYApellido[0] = scanner.nextLine();
	    System.out.println("Ingrese el apellido del jugador:");
	    nombreYApellido[1] = scanner.nextLine();
	    return nombreYApellido;
	}
	
	
	
	public static LocalDate pedirFecha() {

		
		LocalDate fechaConfigurada = null;
		Boolean fechaValida = false;
		
		while (!fechaValida) {
			System.out.println("Ingrese fecha de nacimiento del jugador de la siguiente manera: " + LocalDate.now());
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

	
	public static void precargarJugadores() {
		if (jugadores == null) {
			jugadores = new ArrayList<>();
		}
			
		jugadores.add(new Jugador("Juan Roman","Riquelme", LocalDate.of(1977, 06, 26),"Argentino",1.77f,75.2f,"Medio"));
		jugadores.add(new Jugador("Lionel Andres","Messi", LocalDate.of(1985, 06, 26),"Argentino",1.70f,71.4f,"Delantero"));
		jugadores.add(new Jugador("Emiliano","Martinez", LocalDate.of(1990, 11, 04),"Argentino",1.90f,80f,"Arquero"));

	}
}
