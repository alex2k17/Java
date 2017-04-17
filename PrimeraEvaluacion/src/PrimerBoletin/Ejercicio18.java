package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio18 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0, a1=1, resul, i, numero;
		
		numero=Integer.parseInt(JOptionPane.showInputDialog ("Introduce un numero hacer su Fibonacci"));
		
		if (numero>=0){
			System.out.print("Serie Fibonacci de: "+numero+"\nEs:");
			for (i=0;i<=numero;i++){
				resul=a+a1;
				a=a1;
				a1=resul;
				System.out.print(" "+resul);
			}
		}
		else{System.out.println("La serie fibonacci no permite negativos, por favor verifique que ha introducido un numero entero positivo");}
	}

}
