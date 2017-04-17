/**
 * 
 */
package SegundoBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
         // TODO Auto-generated method stub
         int numero = 0 , i;
         int res2;
         
         try {
         numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número:"));
         System.out.print(numero+" =");
         
         
         for (i=2;i<100;i++){
        	 if (primo(numero,i) && numero!=1 || numero!=0){
        		 res2=numero%i;
        		 while (res2==0){
        			 numero=numero/i;
        			 System.out.print(" "+i);
        			 System.out.print(" *");
        			 res2=numero%i;
        		 }
        	 }

         }

         }
         catch (NumberFormatException e){
		     System.out.println ("El valor introducido es decimal o ha cancelado.");
		    }

	 }
	 
	 
	 public static boolean primo (int numero, int i) {
         boolean primo = true;
         for (i=2;i<numero;i++){
        	 if (numero%i==0){
        		 primo=false;
             	}
         }
         return primo;
	 }

}
		