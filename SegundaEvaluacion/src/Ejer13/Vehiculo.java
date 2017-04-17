package Ejer13;
//Sí puede tener descendencia
public abstract class Vehiculo{
	private int peso;
	public final void setPeso(int p){peso=p;} //Este metodo no se puede sobrescribir
	public abstract int getVelocidadActual();
}