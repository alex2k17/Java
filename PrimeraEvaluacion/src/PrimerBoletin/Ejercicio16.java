/**
 * 
 */
package PrimerBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, descon;
		String resul = "";
		
		  numero=Integer.parseInt(JOptionPane.showInputDialog ("Escriba un numero entero de la cifra que usted quiera"));
		  if (numero>=10){
		   System.out.println("Numero Introducido: "+numero);
		    while (numero>0)
		     {
		     descon=numero%10;
		     resul+=descon+"";
		     numero=numero/10;
		     }
		    System.out.println("Orden Inverso: "+resul);
		  }
		   else{System.out.println("El numero que ha introducido es una cifra o has introducido un numero negativo");}
	}

}
