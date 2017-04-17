package ExamenEjer2;

public class Insecto implements PuedeComer,Cloneable {
	private String color;
	private byte numPatas;
	private float pesoGr; 
	private static byte numInsectos=0;
	private final static byte PROPORCION_COMIDA = 2;
	Insecto(String color,byte numPatas,float pesoGr){
		this.color=color;
		this.numPatas=numPatas;
		this.pesoGr=pesoGr;
		numInsectos++;
	}
	public static byte getNumInsectos() {
		return numInsectos;
	}
	public String toString() {
		return "color=" + color + ", numPatas=" + numPatas + ", pesoGr="+ pesoGr;
	}
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			return null; 
		}			
	}
	public boolean equals (Object o){
		boolean resultado;
		if ((o!=null) && (o instanceof Insecto)){
			if (((Insecto)o).color==color && ((Insecto)o).numPatas==numPatas &&
					((Insecto)o).pesoGr==pesoGr)
				resultado=true;
			else
				resultado=false;
		}
		else
			resultado=false; 
		
		return resultado;
	}
	public Object Reproducirse(){
		return clone();
	}
	public void comer(float gramosComida){
		pesoGr+=gramosComida/PROPORCION_COMIDA;
	}
}
