package SegundoBoletin;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  int numero1,numero2;
		   String operacion;
		   
		   try {
		   operacion=JOptionPane.showInputDialog ("Escriba por favor la operacion que desea realizar: +, -, *, /");
		   numero1=Integer.parseInt(JOptionPane.showInputDialog ("Escriba el primer Numero"));
		   numero2=Integer.parseInt(JOptionPane.showInputDialog ("Escriba el segundo Numero"));
		   
		   calculadora(operacion,numero1,numero2);
		   }
		   	catch (NullPointerException e){
		   		System.out.println ("Ha cancelado");
		   	}
		    catch (NumberFormatException e){
		     System.out.println ("El valor introducido es decimal.");
		    }
		   
		 }
		
		   public static int calculadora (String operacion, int numero1, int numero2){
			   int resul=0;
			   int calculadora=0;
			   
			   switch(operacion){
			   	case "+":
			   		resul=numero1+numero2;
			   		System.out.println("Resultado de la suma: "+resul);
			   		break;
			   	case "-":
			   		resul=numero1-numero2;
			   		System.out.println("Resultado de la resta: "+resul);
			   		break;
			   	case "*":
			   		resul=numero1*numero2;
			   		System.out.println("Resultado de la multiplicacion: "+resul);
			   		break;
			   	case "/":
			   		resul=numero1/numero2;
			   		System.out.println("Resultado de la division: "+resul);
			   		break;
			   	default:
			   		System.out.println("ERROR");   
			   }
			   return calculadora;
		  }
}
