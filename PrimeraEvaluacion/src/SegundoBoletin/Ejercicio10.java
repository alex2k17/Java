package SegundoBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */

public class Ejercicio10 {

	public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 
	 int x, y;
  
	 	try {
	 
		x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero entero: "));
	 	y=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero entero: "));
  
	 	System.out.println("Primer numero elegido: "+x);
	 	System.out.println("Segundo numero elegido: "+y);
	 	System.out.println("");
	 	System.out.println ("El MCD es: "+MCD(x,y));
	 	}
	 	catch (NumberFormatException e){
	 		System.out.println ("El valor introducido es decimal o ha cancelado.");
	    }
	 
 	}
 
  	public static int MCD (int x, int y){
  		if (y==0)
  			return x;
  		else{return MCD(y, x%y);}
  	}
}