package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad, numerohijos;
		String sexo;
		
		do{
			edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad"));
		}while(edad<18 || edad>40);

		do{
		   sexo=(JOptionPane.showInputDialog ("Escriba H (Hombre) o M (Mujer)"));
		}while(!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M"));
		
		do{
		  numerohijos=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el Numero de Hijos"));
		}while(numerohijos<0);
		
		  System.out.println("Datos: \n"+"Edad: "+edad+"\nSexo: "+sexo+"\nHijos: "+numerohijos);
	}

}
