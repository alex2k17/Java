/**
 * 
 */
package PrimerBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, resul = 1, i;
		
		
		x=Integer.parseInt(JOptionPane.showInputDialog ("Escribe un numero entero"));
		
		
		if (x<=0){
			System.out.println("Has introducido un 0 o un numero negativo.");
		}
		else {
			for (i=1;i<=x;i++){
				resul=resul*i;
			}
			
			System.out.println("Resultado: "+resul);
		}
		
	}

}
