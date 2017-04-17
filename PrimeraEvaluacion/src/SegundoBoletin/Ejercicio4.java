/**
 * 
 */
package SegundoBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */

//Escribe un método que determine si un número es primo o no
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int numero = 0;
		 try {
		 numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
		 }
		 catch (NumberFormatException e){
		     System.out.println ("El valor introducido es decimal.");
		    }
		 esprimo(numero);
		 
		}
		 
		public static int esprimo (int numero){
			int esprimo = 0;
			int i, cuenta = 0;
			for(i=1;i!=numero+1;i++){
				if (numero%i==0){
					cuenta++;
				}
			}
			if (cuenta==2){
				System.out.println("El Numero: "+numero+" es primo");
			}
			else {System.out.println("El Numero: "+numero+" no es primo");}
			return esprimo;
		}
	}
		