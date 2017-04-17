/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = null, cadena2 = null, cadenaconct;
		boolean cadena_valida=true;
		
		
		try{
			do {
				try{
					cadena_valida=true;
					cadena1=(JOptionPane.showInputDialog ("Escriba una frase"));
					if (cadena1==null)
						throw new NullPointerException();
					else if (cadena1.equals("") || cadena1.equals(" "))
						throw new NumberFormatException();
					cadena2=(JOptionPane.showInputDialog ("Escribe otra frase"));
					if (cadena2==null)
						throw new NullPointerException();
					else if (cadena2.equals("") || cadena2.equals(" "))
						throw new NumberFormatException();
				
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,	"Debe introducir un caracter");
					cadena_valida=false;
					}
				}while(!cadena_valida);
			//Ya tenemos los datos, ahora hacemos el programa...
			
			cadenaconct=cadena1+cadena2;
			
			System.out.println("Cadena 1 : "+cadena1);
			System.out.println("Cadena 2 : "+cadena2);
			System.out.println("Cadena concatenada: "+cadenaconct);
				
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}

	}

}
