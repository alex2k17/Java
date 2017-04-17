package Ejer4;

public class Encargado extends Empleado {
	
	public Encargado (String nombre, String ocupacion, double sueldo){
		super(nombre, ocupacion, sueldo);
	}
	
	public double calcular_sueldo(){
		return sueldo+=sueldo*10/100;
	}
	
	public String toString(){
		return String.format(
				"- Nombre: %s\n"+
				"- Ocupacion: %s\n"+
				"- Sueldo: %s\n",nombre, ocupacion, calcular_sueldo());
	}
}
