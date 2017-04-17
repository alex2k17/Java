/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String cadena1 = "", cadena2 = "";
		String resul = "";
		int i;
		
		
		try{
			do {
				cadena1=(JOptionPane.showInputDialog ("Introduce una cadena: "));
				if (cadena1==null)
					throw new NullPointerException();
				cadena2=(JOptionPane.showInputDialog ("Introduce el caracter que quieras reemplazar: "));
				if (cadena2==null)
					throw new NullPointerException();
			}while(cadena1.equals(" ") || cadena2.equals(" "));
			//Ya tenemos los datos, ahora hacemos el programa...
			for (i=0;i<cadena1.length();i++){
				if (cadena1.charAt(i)==cadena2.charAt(0))
					resul+="*";
				else {
					resul+=cadena1.charAt(i);
				}
			}

			System.out.println("Cadena original: "+cadena1);
			System.out.println("Resultado: "+resul);
			
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}		
	}

}
