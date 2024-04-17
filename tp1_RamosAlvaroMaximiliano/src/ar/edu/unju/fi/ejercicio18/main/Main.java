package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static List<Pais> paises = new ArrayList<>();
	private static List<DestinoTuristico> destinosTuristicos = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		paises.add(new Pais(1, "Argentina"));
		paises.add(new Pais(2, "Mexico"));
		paises.add(new Pais(3, "Brasil"));
		paises.add(new Pais(4, "Estados Unidos"));
		paises.add(new Pais(5, "Canadá"));
		
		
		Integer opcion = null;
		do {
			System.out.println("----MENU DE OPCIONES----");
			System.out.println("1 - Alta de destino turístico");
			System.out.println("2 - Mostrar todos los destinos turísticos.");
			System.out.println("3 - Modificar el país de un destino turístico.");
			System.out.println("4 - Limpiar el ArrayList de destino turísticos.");
			System.out.println("5 - Eliminar un destino turístico");
			System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre.");
			System.out.println("7 - Mostrar todos los países.");
			System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
			System.out.println("9 - Salir.");
			opcion = scanner.nextInt();scanner.nextLine();
	
			switch(opcion) {
			case 1: darAltaDestinoTuristico();break;
			case 2: mostrarDestinosTuristicos();break;
			case 3: modificarPaisDestino();break;
			case 4: limpiarListaDestinosTuristicos();break;
			case 5: eliminarDestinoTuristico();break;
			case 6: mostrarDestinosOrdenados();break;
			case 7: mostrarPaises();break;
			case 8: mostrarDestinosTuristicosPorPais();break;
			case 9: System.out.println("-----FIN DEL PROGRAMA------");break;
			default: System.out.println("La opción ingresada no es válida. Por favor vuelva a intentarlo.");

			}
		} while(opcion != 9);
	}
	
	
	
	
	
	public static void darAltaDestinoTuristico() {
		System.out.println("Ingrese código para el destino turistico:");
		String codigo = scanner.nextLine();
		
		System.out.println("Ingrese el nombre del destino turistico:");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese el precio para el destino turistico");
		Double precio = scanner.nextDouble();scanner.nextLine();
		
			System.out.println("Ingrese el código del país del destino turistico:");
			Integer codigoPais = scanner.nextInt();
			Pais paisEncontrado = buscarPaisPorCodigo(codigoPais);
			
			System.out.println("Ingrese la cantidad de dias:");
			Integer cantidadDias = scanner.nextInt();scanner.nextLine();
			
			
			destinosTuristicos.add(new DestinoTuristico(codigo,nombre,precio,paisEncontrado,cantidadDias));
	}
	
	
	private static void mostrarDestinosTuristicos() {
		System.out.println("Destinos turísticos:");
        destinosTuristicos.forEach(destinos -> System.out.println(destinos));
    }
	
	
	private static void modificarPaisDestino() {
        System.out.print("Ingrese el código del destino turístico a modificar: ");
        String codigoDestino = scanner.nextLine();
        
        DestinoTuristico destinoTuristicoAmodificar = null;
        
        for (DestinoTuristico destino: destinosTuristicos) {
        	if (destino.getCodigo().equals(codigoDestino)) {
        		destinoTuristicoAmodificar = destino;
        		break;
        	}
        }
        
        
        
        if (destinoTuristicoAmodificar != null) {
            System.out.println("Ingrese el nuevo país:");
            String pais = scanner.nextLine();
            
            System.out.print("Ingrese el código del nuevo país: ");
            Integer codigo = scanner.nextInt();
            
            Pais paisModificado = buscarPaisPorCodigo(codigo);
            
            if (paisModificado != null) {
                destinoTuristicoAmodificar.setPais(paisModificado);
                System.out.println("País modificado exitosamente.");
            } else {
                System.out.println("El país no existe en el registro.");
            }
        } else {
            System.out.println("El destino turístico no existe.");
        }
    }
    
	
	public static void limpiarListaDestinosTuristicos() {
		destinosTuristicos.clear();
		System.out.println("Lista de Destinos Turisticos eliminada");
	}
	
	
	public static void eliminarDestinoTuristico() {
	        if (destinosTuristicos.isEmpty()) {
	            System.out.println("No hay destinos turísticos para eliminar.");
	            return;
	        }
	        
	        System.out.println("Ingrese el código del destino turístico a eliminar: ");
	        String codigoDestino = scanner.next();
	        
	        Iterator<DestinoTuristico> iterator = destinosTuristicos.iterator();
	        Boolean destinoEncontrado = false;
	        
	        while (iterator.hasNext()) {
	            DestinoTuristico destino = iterator.next();
	            if (destino.getCodigo().equals(codigoDestino)) {
	                iterator.remove();
	                System.out.println("Destino turístico eliminado.");
	                destinoEncontrado = true;
	                break;
	            }
	        }
	        if (!destinoEncontrado) {
	            System.out.println("El destino turístico no existe en la lista.");
	        }
	    }
	
	public static void mostrarDestinosOrdenados() {
        if (destinosTuristicos.isEmpty()) {
            System.out.println("No hay destinos turísticos para mostrar.");
        } else {
            destinosTuristicos.sort(Comparator.comparing(DestinoTuristico::getNombre));
            destinosTuristicos.forEach(destino -> System.out.println(destino));
        }
    }
	
	
	 public static void mostrarPaises() {
	        paises.forEach(p -> System.out.println(p));
	    }

	
	 public static void mostrarDestinosTuristicosPorPais() {
		 Pais paisEncontrado = null;
		 System.out.println("Ingrese el código del pais");
		 paisEncontrado = buscarPaisPorCodigo(scanner.nextInt());
		 
		 List<DestinoTuristico> destinosPorNacionalidad = new ArrayList<>();
		 if (paisEncontrado == null) {
			 System.out.println("El país no se encuentra registrado");
			 return;
		 } else {
			 for (DestinoTuristico destino: destinosTuristicos) {
				 if (destino.getPais().getNombre().equals(paisEncontrado.getNombre())) {
					 destinosPorNacionalidad.add(new DestinoTuristico(destino.getCodigo(), destino.getNombre(), destino.getPrecio(),destino.getPais(), destino.getCantidadDias()));
				 }
			 }
		 }
		 
		 System.out.println("----Destinos Turisticos Ordenados----");
		 destinosPorNacionalidad.forEach(destino -> System.out.println(destino));
	 }
	
	 

	
	 
	 
	 public static Pais buscarPaisPorCodigo(Integer codigo) {
        for (Pais pais : paises) {
            if (pais.getCodigo() == codigo) {
                return pais;
            }
        }
        return null;
    }
	

}
