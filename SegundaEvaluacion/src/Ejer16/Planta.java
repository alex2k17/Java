package Ejer16;

public class Planta extends Producto{
	
	private boolean estaRegada;
	
	Planta(double precio,String descripcion,boolean estaRegada){
		super(precio,descripcion);
		this.estaRegada=estaRegada;
	}
	public boolean getestaRegada(){
		return estaRegada;
	}
	
}
