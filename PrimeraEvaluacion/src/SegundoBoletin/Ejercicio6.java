package SegundoBoletin;

import javax.swing.JOptionPane;


/**
 * @author Alex
 *
 */
public class Ejercicio6 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int numero, i;
		
		try{
			
			numero=Integer.parseInt(JOptionPane.showInputDialog ("Ingrese un numero para su comprobacion perfecta: "));
  
			if (perfecto(numero)==1){
				System.out.println("El numero "+numero+" es perfecto");
				System.out.print("Sus divisores son: ");
				
				for (i=2;i<numero-1;i++){
					if (numero%i==0){
						System.out.print(i);
						System.out.print(" , ");
					}
				}
			}
			else {
				System.out.println("El numero "+numero+" no es perfecto");
			}
		}
		catch (NumberFormatException e) {
			System.out.println ("El valor introducido es decimal.");
		}
		catch (NullPointerException f){
			System.out.println ("Ha cancelado");
		}
	}
	public static int perfecto (int numero){
		int i, suma=1;
		for (i=2;i<numero-1;i++){
			if (numero%i==0){
				suma=suma+i;
             }
		}
		if (suma==numero)
			return 1;
		else
			return 0; 
		}
 	}