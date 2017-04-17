package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio17 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, i, resul = 0;
		
		x=Integer.parseInt(JOptionPane.showInputDialog ("Introduce un numero para la suma"));
		
		System.out.println("Tu numero introducido: "+x);
		System.out.print("Suma: ");
		for (i=1;i<=x;i++){
			resul=resul+i;
			System.out.print(i+"+");
		}
		System.out.println(resul);
		
	}

}
