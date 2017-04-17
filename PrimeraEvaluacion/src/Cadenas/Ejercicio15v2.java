/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio15v2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena, frase = "";
		int i = 1, numpalabras = 0;
		int prin = 0, aux=0, pos_espacio=0;
		
		try {		
			do {
			cadena=JOptionPane.showInputDialog ("Ingrese una frase: ");
			if (cadena==null)
				throw new NullPointerException();
			}while(cadena.equals(" "));
			
			if (cadena.matches("[a-z]")==true)
				numpalabras=numpalabras+1;

			cadena=cadena.trim();	
			while(i<cadena.length()){
				while (i<cadena.length() && cadena.charAt(i)!=' ')
					i++;
					numpalabras++;
			 		frase+=cadena.substring(prin, i);
			 		frase+=" ";
				while(i<cadena.length() && cadena.charAt(i)==' ')
					i++;
					prin=i;
				}
			frase=frase.trim();
		 	String cadena1[]=new String[numpalabras];
	        pos_espacio=frase.indexOf(" ", 0)+1; //Guardamos en la variable la 1º posicion del 1º espacio
	 
	        if (numpalabras==1)
	            cadena1[0]=frase;
	        else
	            for(i=0; i<numpalabras; i++){
	               cadena1[i]=frase.substring(aux, pos_espacio-1);
	               //Introducimos las palabras en el array
	               aux=pos_espacio; //Guardamos la posicion de la siguiente palabra en aux
	               if(frase.indexOf(" ", pos_espacio)!=-1) // Si la frase tiene mas palabras
	            	   pos_espacio=frase.indexOf(" ", pos_espacio+1)+1; //Guardamos en la variable el siguiente espacio
	               else
	            	   pos_espacio=frase.length()+1; //Si no tiene mas palabras, y es la ultima, guardamos la longitud de la cadena +1
	            }
	       
	        	//Mostramos por pantalla.
	        	for(i=0;i<numpalabras;i++) 
	        		System.out.println(cadena1[i]);

		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}		

	}

}
