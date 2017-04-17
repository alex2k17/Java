/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1;
		boolean espalindromo = false, cadena_valida=false;
		int i, posi;
		
		try{
			do {
				cadena_valida=true;
				cadena1=(JOptionPane.showInputDialog ("Introduce una cadena: "));
				if (cadena1==null)
					throw new NullPointerException();
					
			}while(!cadena_valida);
			
			//Ya tenemos los datos, ahora hacemos el programa...
			cadena1 = cadena1.replace(" ", "");
			posi=cadena1.length()-1;
			
			for (i=0;i<cadena1.length()-1 && (!espalindromo);i++){
				if (cadena1.charAt(i)==cadena1.charAt(posi))
					posi--;
				else 
					espalindromo=true;
			}
			
			if (!espalindromo)
				System.out.println("La palabra "+cadena1+" es palindromo");
			else 
				System.out.println("La palabra "+cadena1+" no es palindromo");

			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}	
	}

}
