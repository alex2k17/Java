package Ejer4;

public class Empleado {

	protected String nombre;
	protected String ocupacion;
	protected double sueldo;
	
	public Empleado (String nombre,String ocupacion, double sueldo){
		this.nombre=nombre;
		this.ocupacion=ocupacion;
		this.sueldo=sueldo;
	}
	
	Empleado (){
		nombre="Sin nombre";
		ocupacion="Sin ocupacion";
		sueldo=0;
	}

	public double calcular_sueldo(){
		return sueldo;
	}
	
	
	public String toString(){
		return String.format(
					"- Nombre: %s\n"+
					"- Ocupacion: %s\n"+
					"- Sueldo: %s\n",nombre, ocupacion, calcular_sueldo());
	}
	
}
