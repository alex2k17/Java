
package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char vectorcarac[]=new char [6];
		String vector[]=new String [6];
		int i, posicion;
		char caracter;
		String caracter1;
		
		try{
		System.out.print("Caracteres Introducidos: ");
		for (i=0;i<5;i++){
			vector[i]=JOptionPane.showInputDialog ("Introduce el "+i+"º Caracter");
			vectorcarac[i]=vector[i].charAt(0);
			System.out.print(vectorcarac[i]+" ");
		}
		
		posicion=Integer.parseInt(JOptionPane.showInputDialog ("Introduce la posicion en la que quieres introducir el caracter"));
		
		caracter1=(JOptionPane.showInputDialog ("Introduce el caracter que quieras"));
		caracter=caracter1.charAt(0);
	
		for (i=vectorcarac.length-1;i>=posicion;i--){
			
			vectorcarac[i]=vectorcarac[i-1];
		}
		vectorcarac[i]=caracter;
		System.out.println("");
		System.out.print("Vector Modificado: ");
		for (i=0;i<6;i++){
			System.out.print(vectorcarac[i]+" ");
		}
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
		
	}

}
