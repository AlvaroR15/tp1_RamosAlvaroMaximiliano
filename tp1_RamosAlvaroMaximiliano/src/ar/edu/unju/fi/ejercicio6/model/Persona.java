package ar.edu.unju.fi.ejercicio6.model;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String provincia;
	
	public Persona() {}

	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento, String provincia) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = provincia;
	}
	
	
	
	public Persona(String dni, String nombre, LocalDate fechaDeNacimiento) {
		this.dni = dni;
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.provincia = "Jujuy";
	}

	public Integer calcularEdad() {
		LocalDate hoy = LocalDate.now();
		return hoy.getYear() - fechaDeNacimiento.getYear();
	}
	
	public Boolean verificarEdad() {
		return this.calcularEdad() >= 18;
	}
	
	
	public void mostrarDatos() {
		System.out.println("Datos de la persona: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("Dni: " + dni);
		System.out.println("Fecha de nacimiento: " + fechaDeNacimiento);
		System.out.println("Provincia: " + provincia);
		if (verificarEdad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona es menor de edad");
		}
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fecha) {
		this.fechaDeNacimiento = fecha;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	
}
