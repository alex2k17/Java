/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String cadena1 = "", espacio=" ";
		int i, resul = 0;
		
		
		try{
			do {
				cadena1=(JOptionPane.showInputDialog ("Introduce una cadena: "));
				if (cadena1==null)
					throw new NullPointerException();

				}while(cadena1.equals(" "));
			//Ya tenemos los datos, ahora hacemos el programa...
			
			cadena1+=" ";
			for (i=0;i<cadena1.length();i++){
				if (cadena1.charAt(i)==espacio.charAt(0)){
					resul++;
				}
				
			}

			System.out.println("Cadena original: "+cadena1);
			System.out.println("Numero de palabras: "+resul);
			
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}		
		
	}

}
