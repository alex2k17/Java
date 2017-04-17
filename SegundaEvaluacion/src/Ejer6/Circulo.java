package Ejer6;

public class Circulo extends Forma {
	
	public Circulo (String identidad){
		super(identidad);
	}

	public String toString() {
		return String.format("Forma: %s", identidad());
	}

}
