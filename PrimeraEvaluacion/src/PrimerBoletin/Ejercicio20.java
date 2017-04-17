package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n = 0, numero2=1, fila2 = 0, espacios2, columna2 = 0, fila1, espacios, k;
		  
		  n=Integer.parseInt(JOptionPane.showInputDialog ("Indique el tamaño del rombo"));
		  
		  for (fila1=1;fila1<=n;fila1++){
				for (espacios=n;espacios>=fila1;espacios--){
					System.out.print(" ");
				}
				for(k=1;k<=fila1;k++){
					System.out.print(" *");
				}
				System.out.println("");
		  }
		  for (fila2=1; fila2<=n; fila2++){
			  numero2=(n-fila2);
			  for (espacios2=0; espacios2<=fila2; espacios2++){
				  System.out.print (" ");
			  }
			  for (columna2=1; columna2<=numero2; columna2++){
				  	System.out.print (" *");
			  }
			  System.out.println ("");
		  }
	}
}
