package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x;
		String texto;


	texto=JOptionPane.showInputDialog("Escriba un número entero"); //Pide por pantalla un valor
	x=Byte.parseByte(texto);

	if (x<0) {		//Mira si X es menor que 0

		System.out.print("Es Negativo"); }
	
	else if (x>0) {		//Mira si X es un numero positivo
		System.out.print("Es Positivo"); }

	else {			//Mira si X es un 0
		System.out.print("Es un 0"); }
	}
		
		
}


