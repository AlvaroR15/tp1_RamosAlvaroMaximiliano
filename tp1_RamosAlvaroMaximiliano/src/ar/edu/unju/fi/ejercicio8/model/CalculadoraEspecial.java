package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	private Integer n;
	
	public CalculadoraEspecial() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CalculadoraEspecial(Integer n) {
		this.n = n;
	}



	public Double calcularSumatoria() {
		Double resultado = 0.0;
		for (int k = 1; k <= n; k++) {
			Integer calculo = (k * (k+1)) / 2;
			resultado += Math.pow(calculo, 2);
		}
		return resultado;
	}
	
	public Integer calcularProductoria() {
		Integer resultado = 1;
		for (int k = 1; k <= n; k++) {
			resultado *= k * (k+4);
		}
		return resultado;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}
	
	
}
