
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena1 = null, cadena2;
		
		try{
			do {
				cadena1=(JOptionPane.showInputDialog ("Introduce una frase: "));
				if (cadena1==null)
					throw new NullPointerException();
				}while(cadena1.equals(" "));
			}catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
			}
		
			cadena2=cadena1.replaceAll(" ", "");
		
			System.out.println("Cadena original: "+cadena1);
			System.out.println("Cadena sin espacios: "+cadena2);	
	}
}
