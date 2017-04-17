package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, k, n;
		
		n=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el tamaño de la piramide"));
		
		for (i=1;i<=n;i++){
			for (j=n;j>=i;j--){
				System.out.print(" ");
			}
			for(k=1;k<=i;k++){
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}