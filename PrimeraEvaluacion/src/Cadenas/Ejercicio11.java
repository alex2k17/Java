/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena1 = null;
		int i, resultado = 0;
		
		
		try{
			do {
				cadena1=(JOptionPane.showInputDialog ("Introduce una cadena: "));
				if (cadena1==null)
					throw new NullPointerException();

			}while(cadena1.equals(" "));
			//Ya tenemos los datos, ahora hacemos el programa...
			
			for (i=0;i<cadena1.length();i++){
				switch(cadena1.charAt(i)){
					case '1':
						resultado+=1;
						break;
					case '2':
						resultado+=2;
						break;
					case '3':
						resultado+=3;
						break;
					case '4':
						resultado+=4;
						break;
					case '5':
						resultado+=5;
						break;
					case '6':
						resultado+=6;
						break;
					case '7':
						resultado+=7;
						break;
					case '8':
						resultado+=8;
						break;
					case '9':
						resultado+=9;
						break;
				}
			}

			System.out.println("Cadena: "+cadena1);
			System.out.println("Suma de la cadena: "+resultado);
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}	
		
	}

}
