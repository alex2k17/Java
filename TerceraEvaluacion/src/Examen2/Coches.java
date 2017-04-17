package Examen2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Coches extends Juguetes implements CocheControlable {
	public Motor motor;
	int marchas=0;
	Date fecha;
	SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

	Coches(String nombre, String color, int cil, int marchas) {
		super(nombre, color);
		motor=new Motor(cil);
		this.fecha=Fecha();
	}

	public String toString() {
		return "Coches [motor=" + motor.getCilindrada() + ",Marcha="+marchas+", fecha=" + formatoFecha.format(fecha) + ", color="
				+ color + ", nombre=" + nombre + ", Precio="
				+ calcularValor() + "]";
	}

	public Date Fecha(){
		String fech;
		boolean salir = false;
		Calendar FechaFebrero = new GregorianCalendar(2012, Calendar.FEBRUARY, 20);
		Calendar FechaJunio = new GregorianCalendar(2013, Calendar.JUNE, 1);
		Date fecha1 = FechaFebrero.getTime();
		Date fecha2 = FechaJunio.getTime();
		
		do{
			fech=InAndOut.pedirDato("Elige la fecha que desea para el coche "+nombre+" :\n" +
									"1. 20 de febrero de 2012\n" +
									"2. 1 de junio de 2013");
			if (fech.equalsIgnoreCase("1")){
				fecha=fecha1;
				salir=true;
			}
			else if (fech.equalsIgnoreCase("2")){
				fecha=fecha2;
				salir=true;
			}
			else {
				System.out.println("Fecha Incorrecta.");
			}
		}while(!salir);
		
		return fecha;
		
	}
	
	public void arrancar() {
		System.out.println("El coche esta arrancado.");
	}

	public void parar() {
		System.out.println("El coche esta parado.");
	}

	public void subir_marcha() {
		marchas=marchas+1;
	}

	
	public void bajar_marcha() {
		marchas=marchas-1;
	}
	
	
	public int calcularValor() {
		return 10;
	}
	
	public class Motor{ //Clase interna
		public int cilindrada;
		public Motor(int cil) {
			cilindrada=cil;
		}
		public int getCilindrada(){
			return cilindrada;
		}
	}
}
