package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i, impares = 0;
		int vector[]= new int [6];
		
		try{
		System.out.print("Numeros Introducidos: ");
		for (i=1;i<=5;i++){
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
			System.out.print(vector[i]+" ");
		}
		
		System.out.println("");
		System.out.print("Impares: ");
		for (i=0;i<=5;i++){
			if (vector[i]%2!=0){
				System.out.print(+vector[i]+" ");
				impares+=vector[i];
			}

		}
		System.out.println("");
		System.out.println("Suma: "+impares);
		
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}

}
