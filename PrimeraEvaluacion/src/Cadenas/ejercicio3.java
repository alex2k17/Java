/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena = null;
		int i, cuenta = 0;
		boolean cadena_valida;
		
		try{
			do {
				cadena_valida=true;
				cadena=(JOptionPane.showInputDialog ("Escriba una frase"));
				if (cadena==null)
					throw new NullPointerException();
				
			}while(!cadena_valida);
			//Ya tenemos los datos, ahora hacemos el programa...
			cadena=cadena.toLowerCase();
			for (i=0;i<cadena.length();i++)
			if(cadena.charAt(i)=='a' || cadena.charAt(i)=='e' || cadena.charAt(i)=='i' || cadena.charAt(i)=='o' || cadena.charAt(i)=='u')
				cuenta++;
			
			System.out.println("Frase: "+cadena);
			System.out.println("Vocales: "+cuenta);

		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}
	}

}
