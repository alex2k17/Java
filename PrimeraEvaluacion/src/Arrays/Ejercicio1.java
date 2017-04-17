package Arrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		int i;
		int vector[]= new int [11];
		
		try{
			for (i=1;i<=10;i++){
				vector[i]=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el "+i+"º Numero"));
				for (i=0;i<=10;i+=2){
					System.out.print(vector[i]+",");
				}
			}
		}catch(NumberFormatException e){
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}

}
