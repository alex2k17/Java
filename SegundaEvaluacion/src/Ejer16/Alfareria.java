package Ejer16;

public class Alfareria extends Producto{
	
	private boolean esFragil;
	
	Alfareria(double precio,String descripcion,boolean esFragil){
		super(precio,descripcion);
		this.esFragil=esFragil;
	}
	public boolean getesFragil(){
		return esFragil;
	}	
}
