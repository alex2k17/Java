package Examen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Animales {
	
	@Override
	public String toString() {
		return "Animales [nombre=" + nombre + ", cuota=" + cuota + ", fecha="
				+ formatoFecha.format(fecha)+ "]";
	}

	String nombre;
	double cuota;
	Date fecha;
	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MMMMM/yyyy");
	
	public Animales (String nombre, double cuota, Date fecha){
		this.nombre=nombre;
		this.cuota=cuota;
		this.fecha=fecha;
	}
	
	
}
