/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = null, palabra = null;
		char carac;
		boolean cadena_valida;
		int i, cuenta = 0;
		
		try {
			cadena=(JOptionPane.showInputDialog ("Escriba una frase"));
			if (cadena==null)
				throw new NullPointerException();
			do {
					cadena_valida=true;
				palabra=(JOptionPane.showInputDialog ("Escriba un caracter"));
				if (palabra.matches("[a-z]")==false){
					JOptionPane.showMessageDialog(null, "Escribe solo un caracter");
					cadena_valida=false;
					}
				}while(!cadena_valida);
			//Ya tenemos los datos, ahora hacemos el programa...
			cadena=cadena.toLowerCase();
			carac=palabra.charAt(0);
			for (i=0;i<cadena.length();i++){
				if(cadena.charAt(i)==carac)
					cuenta++;
			}
			
			
			System.out.println("Frase: "+cadena);
			System.out.println("Numero de veces que aparece la vocal en la frase: "+cuenta);


		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}

	}

}
