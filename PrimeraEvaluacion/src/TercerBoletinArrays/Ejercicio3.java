package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int i, resul = 0;
		int vector[]=new int [5];
		
		try {
		System.out.print("Numeros Introducidos: ");
		for (i=1;i<=4;i++){
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
			System.out.print(vector[i]+" ");
			resul+=vector[i];
		}
		System.out.println("");
		System.out.println("Total: "+resul);
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}

}
