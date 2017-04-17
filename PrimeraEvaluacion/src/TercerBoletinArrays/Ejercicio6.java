/**
 * 
 */
package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, sumar = 0, contar = 0;
		int vector[]= new int [5];
		
		try{
		System.out.print("Numeros Introducidos: ");
		for (i=0;i<5;i++){
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
			System.out.print(vector[i]+" ");
		}
		System.out.println("");
		System.out.print("Numeros En las posiciones Impares: ");
		for (i=0;i<5;i+=2){
			if (vector[i]%2==0){
				System.out.print(+vector[i]+" ");
				contar++;
				sumar+=vector[i];
			}
		}
		System.out.println("");
		System.out.println("Numeros Pares: "+contar);
		System.out.println("Suma: "+sumar);
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}
}
