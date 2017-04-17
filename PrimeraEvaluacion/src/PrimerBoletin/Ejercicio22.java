package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fila, numero = 0, espacios, columna;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog ("Introduce un numero para la piramide numerica"));
		
		for (fila=1; fila<numero+1; fila++){
			for (espacios=numero; espacios>fila; espacios--){
					System.out.print ("  ");
				}
			for (columna=1; columna<fila; columna++){
					System.out.print (" "+columna);
				}
			for (columna=fila;columna>1; columna--){
				System.out.print (" "+columna);
				}
			System.out.println (" "+columna);			
		}
	}
}
