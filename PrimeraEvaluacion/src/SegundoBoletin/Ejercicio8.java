/**
 * 
 */
package SegundoBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		try {
		numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
		System.out.print(factorial(numero));
		}
		catch (NumberFormatException e){
		     System.out.println ("El valor introducido es decimal o ha cancelado.");
		    }
		
	}

	public static double factorial(int numero){
		if(numero<=1) return 1;
		else return numero*factorial(numero-1);
	}
}
