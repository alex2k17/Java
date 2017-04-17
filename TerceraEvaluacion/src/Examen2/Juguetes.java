package Examen2;

public abstract class Juguetes extends Sorpresa {
	protected String color;
	Juguetes(String nombre, String color) {
		super(nombre);
		this.color=color;
	}
	
	public abstract int calcularValor();

}
