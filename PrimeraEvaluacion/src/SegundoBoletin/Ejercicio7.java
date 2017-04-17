package SegundoBoletin;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args){
		
		int x, y;
  
		try {
		x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primero numero entero: "));
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
		int i;
		while (x>0){  
			if (x<y){  
				i=x;
				x=y;
				y=i;
			} 
			x=x-y;
		}
		return y;
	}
  }