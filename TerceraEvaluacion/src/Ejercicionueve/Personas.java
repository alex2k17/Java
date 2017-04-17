package Ejercicionueve;

public class Personas {

	String nombre;
	int edad;
	
	public Personas (String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public boolean equals(Object obj) {
		if((obj!=null)&&(obj instanceof Personas)){
			Personas a=(Personas) obj;
			return a.nombre.equals(nombre) && a.edad==edad;
		}
		else return false;
	}
	
	
	public int hashCode() {
		return nombre.hashCode()+(int)edad;
		}
	
}
