package Ejer6;

public class Rombo extends Forma{
	
	public Rombo (String identidad){
		super(identidad);
	}
	
	public String toString() {
		return String.format("Forma: %s", identidad());
	}

}
