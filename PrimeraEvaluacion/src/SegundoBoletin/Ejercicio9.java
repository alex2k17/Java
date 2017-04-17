/**
 * 
 */
package SegundoBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, n;
		
		try {
		x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
		n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la potencia: "));
		
		System.out.print(potencia(x,n));
		}
		catch (NumberFormatException e){
		     System.out.println ("El valor introducido es decimal o ha cancelado.");
		    }
	}

	public static int potencia (int x, int n){
		if (n==0){
			return 1;
		}
		else return x*potencia(x, n-1);

	}
	
}
