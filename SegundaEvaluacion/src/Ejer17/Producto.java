package Ejer17;

public class Producto implements Mercancia {
	protected double precio;
	protected String descripcion;
	
	Producto(){
		precio=0.0;
		descripcion="Sin descripcion";
	}
	Producto(double precio,String descripcion){
		this.precio=precio;
		this.descripcion=descripcion;
	}
	public double damePrecio(){
		return precio;	
	}
	
	public String dameDescripcion(){
		return descripcion;
	}
}
