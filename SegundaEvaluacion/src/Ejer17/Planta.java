package Ejer17;

public class Planta extends Producto implements MercanciaViva{
	
	private boolean estaRegada;
	private boolean hambre;
	
	Planta(double precio,String descripcion,boolean estaRegada,boolean hambre){
		super(precio,descripcion);
		this.estaRegada=estaRegada;
		this.hambre=hambre;
	}
	public boolean getestaRegada(){
		return estaRegada;
	}
	public boolean necesitaComida() {
		return hambre;
	}
	public boolean necesitaRiego() {
		return !estaRegada;
	}
	
}
