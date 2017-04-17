package Ejer17;

public class Alfareria extends Producto implements MercanciaFragil{
	
	private boolean esFragil;
	private String embalaje;
	double peso;
	
	Alfareria(double precio,String descripcion,boolean esFragil,String embalaje,double peso){
		super(precio,descripcion);
		this.esFragil=esFragil;
		this.embalaje=embalaje;
		this.peso=peso;
	}
	public boolean getesFragil(){
		return esFragil;
	}
	public String dameEmbalaje() {
		return embalaje;
	}
	public double damePeso() {
		return peso;
	}	
}
