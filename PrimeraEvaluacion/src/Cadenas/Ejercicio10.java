/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena1 = null, cadena2 = "";
		boolean cadena_valida=true;
		int i;
		
		
		try{
			do {
				try{
					cadena_valida=true;
					cadena1=(JOptionPane.showInputDialog ("Introduce una cadena: "));
					if (cadena1==null)
						throw new NullPointerException();
					else if (cadena1.equals("") || cadena1.equals(" "))
						throw new NumberFormatException();	
					
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,	"Debe introducir un caracter");
					cadena_valida=false;
					}
				}while(!cadena_valida);
			//Ya tenemos los datos, ahora hacemos el programa...
			
			for (i=cadena1.length();i>0;i--){
				cadena2+=cadena1.charAt(i-1);
			}

			System.out.println("Cadena original: "+cadena1);
			System.out.println("Cadena inversa: "+cadena2);
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}	

	}

}
