/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio13v2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String palabra;
		int i = 1, contador = 0;

		
		try {		
			do {
			palabra=JOptionPane.showInputDialog ("Ingrese una frase: ");
			if (palabra==null)
				throw new NullPointerException();
			}while(palabra.equals(" "));
			
			if (palabra.matches("[a-z]")==true)
				contador=contador+1;

			palabra=palabra.trim();	
			while(i<palabra.length()){
				while (i<palabra.length() && palabra.charAt(i)!=' ')
					i++;
					contador++;
				while(i<palabra.length() && palabra.charAt(i)==' ')
					i++;
				}
		
			System.out.println("Palabra: "+palabra);
			System.out.println("Contador de palabras: "+contador);
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}		
		
	}

}
