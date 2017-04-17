package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1 = 0, numero2 = 0, numero3 = 0;
		
		numero1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		numero2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
		numero3=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer numero"));
		
		if (numero1<0 || numero2<0 || numero3<0){
			System.out.println("Has introducido un numero negativo o un 0");
		}
		else if (numero1==numero2 && numero1==numero3){
			System.out.println("Hay 3 numeros iguales a: "+numero1);
		}
		else if (numero1==numero2 || numero1==numero3){
			System.out.println("Hay 2 numeros iguales a: "+numero1);
		}
		else if (numero2==numero3){
			System.out.println("Hay 2 numeros iguales a: "+numero2);
		}
		else {System.out.println("Ningun numero se repite");}

	}

}
