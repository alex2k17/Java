package Ejer6;

public abstract class Forma {
	protected String identidad;
	
	public Forma(String identidad){
		this.identidad=identidad;
	}
	
	Forma (){
		identidad="Sin identidad";
	}
	
	abstract public String toString ();
	
	public String identidad(){
		return identidad;
		
	}

}
