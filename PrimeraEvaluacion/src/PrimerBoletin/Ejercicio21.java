package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int n = 0, numero2=1, fila = 0, columna = 0, espacios;
		  
		  n=Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el tamaño de la piramide numerica"));
		  
		  for (fila=1; fila<n +1; fila++){
			  numero2=(fila);
			  for (espacios=n;espacios>fila; espacios--){
				  System.out.print (" ");
			  }
			  for (columna=1; columna<=numero2; columna++){
				  System.out.print (" "+columna);
			  }
			  System.out.println (" ");
		  }

	}

}
