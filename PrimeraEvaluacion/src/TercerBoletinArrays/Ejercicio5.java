/**
 * 
 */
package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		int vector[]= new int [6];
		int vectorcopi[]= new int [6];
		
		
		try{
		System.out.print("Numeros Introducidos: ");
		for (i=1;i<=5;i++){
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
		System.out.print("Copia: ");
		for (i=5;i>=1;i--){
			vectorcopi[i]=vector[i];
			System.out.print(vectorcopi[i]+" ");
		}
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}

	}

}
