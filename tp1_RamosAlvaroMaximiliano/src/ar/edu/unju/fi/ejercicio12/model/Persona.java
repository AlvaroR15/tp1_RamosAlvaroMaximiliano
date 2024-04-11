package ar.edu.unju.fi.ejercicio12.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Persona {
	String nombre;
	Calendar fechaDeNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	private String fechaFormateada(Calendar fecha) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fechaDeNacimiento.getTime());
	}
	
	public void mostrarDatos() {
		System.out.println("DATOS DE LA PERSONA");
		System.out.println("Nombre: " + nombre);
		System.out.println("Fecha de nacimiento: " + fechaFormateada(fechaDeNacimiento));
		System.out.println("Edad: " + calcularEdad());
		System.out.println("Signo zodiacal: " + determinarSignoZodiaco());
		System.out.println("Estación del año que nació: " + calcularEstacion());
	}
	
	
	 public Integer calcularEdad() {
	        Calendar hoy = Calendar.getInstance();
	        int edad = hoy.get(Calendar.YEAR) - fechaDeNacimiento.get(Calendar.YEAR);
	        return edad;
	    }

	
	 public String determinarSignoZodiaco() {
		 	int dia = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
		    int mes = fechaDeNacimiento.get(Calendar.MONTH) + 1;

		    if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20))
		        return "Aries";
		    else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20))
		        return "Tauro";
		    else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 21))
		        return "Géminis";
		    else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 23))
		        return "Cáncer";
		    else if ((mes == 7 && dia >= 24) || (mes == 8 && dia <= 23))
		        return "Leo";
		    else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23))
		        return "Virgo";
		    else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23))
		        return "Libra";
		    else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22))
		        return "Escorpio";
		    else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21))
		        return "Sagitario";
		    else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20))
		        return "Capricornio";
		    else
		        return "Acuario";
		}
	 
	 
	    public String calcularEstacion() {
	        int mes = fechaDeNacimiento.get(Calendar.MONTH);

	        switch (mes) {
	        	case Calendar.DECEMBER:
	            case Calendar.JANUARY:
	            case Calendar.FEBRUARY:
	                return "Verano";
	            case Calendar.MARCH:
	            case Calendar.APRIL:
	            case Calendar.MAY:
	                return "Otoño";
	            case Calendar.JUNE:
	            case Calendar.JULY:
	            case Calendar.AUGUST:
	                return "Invierno";
	            case Calendar.SEPTEMBER:
	            case Calendar.OCTOBER:
	            case Calendar.NOVEMBER:
	                return "Primavera";
	            default: return "";
	        }
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Calendar getFechaDeNacimiento() {
			return fechaDeNacimiento;
		}

		public void setFechaDeNacimiento(Calendar fechaDeNacimiento) {
			this.fechaDeNacimiento = fechaDeNacimiento;
		}
	    
	    
}
