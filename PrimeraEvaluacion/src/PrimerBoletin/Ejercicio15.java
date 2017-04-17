/**
 * 
 */
package PrimerBoletin;

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

		  int numero, desconposicion, resul = 0;
		  String resfinal;
		  
		  
		  numero=Integer.parseInt(JOptionPane.showInputDialog ("Escriba un numero de tres cifras"));
		  
		 if  (numero>=100 && numero<=999) {
			 
		   resul=numero%10; //Descomponemos el numero y cojemos el ultimo numero
		   resfinal=resul+"";
		   //----
		   //Guardamos el ultimo numero en resfinal.
		   desconposicion=numero/10; //Quitamos el ultimo numero dividiendo por 10 para poder cojer el 2
		   
		   
		   resul=desconposicion%10; //Volvemos a cojer el ultimo numero
		   resfinal+=resul+"";
		    //----
		    //Guardamos el ultimo numero en resfinal.
		   desconposicion=desconposicion/10;  //Volvemos a quitar el ultimo numero diviendo por 10
		   
		   
		   resul=desconposicion%10; 
		   resfinal+=resul+"";
		    //----
		    //Guardamos el ultimo numero en resfinal.
		    
		    System.out.println ("El numero introducido: "+numero+"\nOrden inverso: "+resfinal);
		 }
		 else{System.out.println ("El numero que ha introducido no es un numero de 3 cifras");}

	}

}
