package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	private String nombre;
	private Integer legajo;
	private Double salario;
	private Double SALARIO_MINIMO = 210000.00;
	private Double AUMENTO_POR_MERITOS = 20000.00;
	
	public Empleado(String nombre, Integer legajo, Double salario) {
		this.nombre = nombre;
		this.legajo = legajo;
		this.salario = salario >= SALARIO_MINIMO? salario : SALARIO_MINIMO;
	}
	
	public void mostrarDatos() {
		System.out.println("DATOS DEL EMPLEADO");
		System.out.println("Nombre: " + nombre);
		System.out.println("Legajo: " + legajo);
		System.out.println("Salario: " + salario);
	}
	
	public Double aumentarSalario(Integer cantidadMeritos) {
		for (int i = 0; i < cantidadMeritos; i++) {
			salario += AUMENTO_POR_MERITOS;
		}
		return salario;
	}
	
	
}
