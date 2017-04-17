package Ejer6;

public class Cuadrado extends Forma {
	
	
	public Cuadrado (String identidad){
		super(identidad);
	}
	
	public String toString() {
		return String.format("Forma: %s", identidad());
	}

}
