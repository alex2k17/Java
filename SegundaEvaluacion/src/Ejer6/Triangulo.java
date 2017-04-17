package Ejer6;

public class Triangulo extends Forma {
	
	public Triangulo(String identidad){
		super(identidad);
	}

	public String toString() {
		return String.format("Forma: %s", identidad());
	}

}
