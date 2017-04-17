package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio24 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fila,columna = 1, posicionfil = 1, posicioncol = 1;
		String opcion;
		
		do {
			posicionfil=Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el numero de la posicion de la fila del Alfil"));
			posicioncol=Integer.parseInt(JOptionPane.showInputDialog ("Introduzca el numero de la posicion de la columna del Alfil"));
			
			if ((posicionfil<=0 || posicioncol<=0) || (posicionfil>=9 || posicioncol>=9)){
				System.out.println ("Recuerda el tablero es 8x8, has introducido un numero fuera de rango.");
			}
			else{
				for (fila=1;fila<=8;fila++){
					for (columna=1;columna<=8;columna++){
						if (((fila+columna)==(posicionfil+posicioncol)) || ((fila-columna)==(posicionfil-posicioncol))){
							System.out.print ("* "); 
							}
							else if (((fila+columna)%2)==0) {
								System.out.print ("B ");
								}
								else {System.out.print ("N ");}
					}
				System.out.println ();
				}
			}
			opcion=(JOptionPane.showInputDialog ("¿Desea Salir? s/n"));
	}while (opcion.toUpperCase().equals("n"));

	}

}
