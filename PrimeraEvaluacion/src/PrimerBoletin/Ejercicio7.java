package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, i, resul = 0;
		
		x=Integer.parseInt(JOptionPane.showInputDialog("Primer Numero"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Segundo Numero"));
		
		
		if (x>0){
			for (i=1;i<=y;i++){
					resul+=x;
				}
			System.out.println(x+" + "+y+" = "+resul);	
		}
		else
			System.out.println ("Verifique el numero introducido no sea negativo , recuerde usar numeros enteros positivos.");
		}

	}


