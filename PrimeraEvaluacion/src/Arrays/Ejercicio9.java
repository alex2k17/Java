/**
 * 
 */
package Arrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vector[]= new int [5];
		int i, numero, contar = 0;
		
		try{
		System.out.print("Numeros Introducidos: ");
		for (i=0;i<5;i++){
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
			System.out.print(vector[i]+" ");
		}
		
		numero=Integer.parseInt(JOptionPane.showInputDialog ("Elije un numero: "));
		
		System.out.println("");
		System.out.print("Posiciones donde sale el numero "+numero+": ");
		for (i=0;i<5;i++){
			if (vector[i]==numero){
				contar++;
				System.out.print(i+" ");
			}	
		}
		System.out.println("");
		System.out.println("El numero "+numero+" se repito "+contar+" veces");
		
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}

}
