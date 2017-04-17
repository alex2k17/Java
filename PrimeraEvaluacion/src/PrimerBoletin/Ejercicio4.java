package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pregunta;
		int horas;
		double preciodia=3, precionoche=4.80, tarifa;
		
		pregunta=JOptionPane.showInputDialog("Turno diurno o nocturno?");
		
		if (pregunta.equalsIgnoreCase("diurno") || pregunta.equalsIgnoreCase("dia")){
			
			horas=Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));
			pregunta=JOptionPane.showInputDialog("Es dia festivo?");
			
			if (pregunta.equalsIgnoreCase("si")){
				tarifa=horas*preciodia+1.20;
				System.out.println("Tarifa: "+tarifa);
			}
			else {
				tarifa=horas*preciodia;
				System.out.println("Tarifa: "+tarifa);
				}
		}
		else if (pregunta.equalsIgnoreCase("nocturno") || pregunta.equalsIgnoreCase("noche")) {
			
			horas=Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas"));
			pregunta=JOptionPane.showInputDialog("Es dia festivo?");
			
			if (pregunta.equalsIgnoreCase("si")){
				tarifa=horas*precionoche+1.80;
				System.out.println("Tarifa: "+tarifa);
			}
			else {
				tarifa=horas*precionoche;
				System.out.println("Tarifa: "+tarifa);
				}
		}
		else {System.out.println("ERROR");}
	
	}

}
