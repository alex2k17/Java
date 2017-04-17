package SegundoBoletin;
 
import javax.swing.JOptionPane;
 
/**
 * @author Alex
 *
 */
public class Ejercicio12 {
 
	public static void main(String[] args) {
 
		int numero=0, i;
               
		try {
		numero=Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el limite para la serie fibonacci: "));
               
		for (i=0;i<=numero;i++){
			System.out.print(fibonacci(i)+",");
			}
		}
		catch (NumberFormatException e){
		     System.out.println ("El valor introducido es decimal o ha cancelado.");
		    }
	}
 
	public static int fibonacci (int fibonacci){
		if (fibonacci<=1){
			return 1;
		}
		else {return fibonacci(fibonacci-1)+fibonacci(fibonacci-2);}
	}
}