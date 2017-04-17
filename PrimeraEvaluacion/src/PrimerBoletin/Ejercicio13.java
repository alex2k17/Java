/**
 * 
 */
package PrimerBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, n, resul = 0, i;
		
		x=Integer.parseInt(JOptionPane.showInputDialog ("Escribe un numero entero"));
		n=Integer.parseInt(JOptionPane.showInputDialog ("Escribe a que quieres que se eleve"));
		
		for (i=1;i<=n;i++){
			resul=x*x;
		}
		
		System.out.println("Resultado: "+resul);

	}

}
