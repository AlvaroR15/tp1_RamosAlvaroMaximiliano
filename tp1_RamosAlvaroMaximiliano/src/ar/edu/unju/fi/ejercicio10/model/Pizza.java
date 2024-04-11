package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	private Integer diametro;
	private Float precio;
	private Double area;
	private Boolean ingredientesEspeciales;
	private final Integer ESPECIAL_VEINTE = 500;
	private final Integer ESPECIAL_TREINTA = 750;
	private final Integer ESPECIAL_CUARENTA = 1000;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void calcularPrecio() {
        switch (diametro) {
            case 20:
                precio = ingredientesEspeciales ? 4500 + ESPECIAL_VEINTE : 4500f;
                break;
            case 30:
                precio = ingredientesEspeciales ? 4800 + ESPECIAL_TREINTA : 4800f;
                break;
            case 40:
                precio = ingredientesEspeciales ? 5500 + ESPECIAL_CUARENTA : 5500f;
                break;
            default:
                System.out.println("Diámetro no válido");
        }
    }
	
	public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * Math.pow(radio, 2);
    }
	
	public void mostarDatos() {
		System.out.println("---DATOS DE LA PIZZA ORDENADA---");
		System.out.println("Diámetro = " + diametro);
        System.out.println("Ingredientes especiales = " + ingredientesEspeciales);
        System.out.println("Precio Pizza = $" + precio);
        System.out.println("Área de la pizza = " + area);
        System.out.println("--------------------------------");
	}
	
	
	public Integer getDiametro() {
		return diametro;
	}
	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	public Boolean getIngredientesEspeciales() {
		return ingredientesEspeciales;
	}
	public void setIngredientesEspeciales(Boolean ingredientesEspeciales) {
		this.ingredientesEspeciales = ingredientesEspeciales;
	}

	
	
}
