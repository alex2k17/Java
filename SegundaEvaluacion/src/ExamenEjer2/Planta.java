package ExamenEjer2;

public class Planta implements Vegetal, Cloneable {
	private float alturaCm;
	private boolean tieneFlores;
	private static byte numPlantas=0;
	private final static byte PROPORCION_RIEGO=2;
	Planta(float alturaCm,boolean tieneFlores){
		this.alturaCm=alturaCm;
		this.tieneFlores=tieneFlores;
		numPlantas++;
	}
	public static byte getNumPlantas() {
		return numPlantas;
	}
	public float getAlturaCm() {
		return alturaCm;
	}

	public boolean isTieneFlores() {
		return tieneFlores;
	}

	public String toString() {
		return "alturaCm=" + alturaCm + ", "+(tieneFlores?"sí":"no")+" tiene flores";
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
		if ((o!=null) && (o instanceof Planta)){
			if (((Planta)o).alturaCm==alturaCm && ((Planta)o).tieneFlores==tieneFlores)
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
	public void regar(float litrosAgua){
		alturaCm+=litrosAgua*PROPORCION_RIEGO;
	}
}
