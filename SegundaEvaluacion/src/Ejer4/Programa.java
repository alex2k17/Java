package Ejer4;

import javax.swing.JOptionPane;

import ES.ES;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ES es = null;
		String nombre = null;
		String ocupacion;
		double sueldo;
		
		try{
			do{
				nombre=es.leeCadena("Introduce el nombre del empleado: ");
				ocupacion="Empleado";
				sueldo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo del empleado: "));
			}while(sueldo<=0);
			Empleado suelempleado = new Empleado (nombre, ocupacion, sueldo);
			
			do{
				nombre=es.leeCadena("Introduce el nombre del encargado: ");
				ocupacion="Encargado";
				sueldo=Double.parseDouble(JOptionPane.showInputDialog("Introduce el sueldo del encargado: "));
			}while(sueldo<=0);
			Encargado sueldencargado = new Encargado (nombre, ocupacion, sueldo);
			
			System.out.println(suelempleado.toString());
			System.out.println(sueldencargado.toString());

			
		}catch (NullPointerException e) {
			System.out.println("Ha cancelado el programa. Gracias por utilizar nuestra aplicacion");
		}
	}

}
