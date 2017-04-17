package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 */
public class Ejercicio2 {

	public static void main(String[] args) {

		int i;
		int vector[]= new int [11];
		
		try{
		System.out.print("Numeros Introducidos: ");
		for (i=1;i<=10;i++){
			vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
			System.out.print(vector[i]+" ");
		}
		
		System.out.println("");
		System.out.print("Pares: ");
		
		for (i=0;i<=10;i++){
			if (vector[i]%2== 0){
				System.out.print(+vector[i]+" ");
			}
		}
		
		System.out.println("");
		System.out.print("Impares: ");
		
		for (i=0;i<=10;i++){
			if (vector[i]%2!=0){
				System.out.print(+vector[i]+" ");
			}
		}
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}

}
