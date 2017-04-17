package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, i, resul;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero para mostrar su tabla de multiplicar"));
		
		for (i=0;i<10;i++){
			resul=x*i;
			System.out.println(x+"*"+i+"="+resul);
			
		}
		
		
	}

}
