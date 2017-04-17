package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pares = 0, impares = 0, valor1, valor2, i;
		
		valor1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Primer valor"));
		valor2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Segundo valor valor"));
		
		for (i=valor1;i<=valor2;i+=2){
			if (valor1%2==0){
				pares=pares+i;
				impares=impares+i+1;
			}
			
			else {
				impares=impares+i;
				pares=pares+i+1;
			}
		}
		
		System.out.println("Pares: "+pares+" Impares: "+impares);
		
		
		
	}

}
