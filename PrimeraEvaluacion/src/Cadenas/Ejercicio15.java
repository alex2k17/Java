/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String frase;
		int i, palabras = 0, pos_espacio = 0, aux = 0;
		
		try{
			do{
				frase=(JOptionPane.showInputDialog ("Introduce una frase: "));
				if (frase==null)
					throw new NullPointerException();
			}while(frase.equals(" "));
			
			frase=frase.trim();
			do{
				if (frase.indexOf(" ", pos_espacio)>0 || frase.length()>0 ) 
					palabras++;
			 		pos_espacio=frase.indexOf(" ", pos_espacio)+1;
			}while(pos_espacio>0);
			//*********************************************************************
	        //Contamos las palabras para el array
		 	String cadena1[]=new String[palabras];
	        pos_espacio=frase.indexOf(" ", 0)+1; //Guardamos en la variable la 1º posicion del 1º espacio
	 
	        if (palabras==1)
	            cadena1[0]=frase;
	        else
	            for(i=0; i<palabras; i++){
	               cadena1[i]=frase.substring(aux, pos_espacio-1);
	               //Introducimos las palabras en el array
	               aux=pos_espacio; //Guardamos la posicion de la siguiente palabra en aux
	               if(frase.indexOf(" ", pos_espacio)!=-1) // Si la frase tiene mas palabras
	            	   pos_espacio=frase.indexOf(" ", pos_espacio+1)+1; //Guardamos en la variable el siguiente espacio
	               else
	            	   pos_espacio=frase.length()+1; //Si no tiene mas palabras, y es la ultima, guardamos la longitud de la cadena +1
	            }
	       
	        	//Mostramos por pantalla.
	        	for(i=0;i<palabras;i++) 
	        		System.out.println(cadena1[i]);
	        	
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}	
		
	}

}
