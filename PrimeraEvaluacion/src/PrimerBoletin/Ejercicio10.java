package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, resul = 0;
		String signo;
		
		signo=JOptionPane.showInputDialog("Introduce la operacion *, +, -, /");
		x=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Primer valor de la operacion"));
		y=Integer.parseInt(JOptionPane.showInputDialog("Introduce el Segundo valor de la operacion"));
		
		switch(signo){
		case "+":
			resul=x+y;
			break;
		case "-":
			resul=x-y;
			break;
		case "*":
			resul=x*y;
			break;
		case "/":
			resul=x/y;
			break;
		}
		
		
		System.out.println(x+""+signo+""+y+"="+resul);

	}

}
