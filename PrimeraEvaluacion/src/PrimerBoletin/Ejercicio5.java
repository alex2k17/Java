package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int primero=0, segundo=0, tercero=0;
		
		primero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero"));
		segundo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo numero"));
		tercero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tercer numero"));
		
		System.out.println("Orden predeterminprimerodo: "+primero+" "+segundo+" "+tercero);
		
		if (primero<0 || segundo<0 || tercero<0){
			System.out.println("Has introducido un numero negativo o un 0");
		}
		
		else if (primero>=segundo && segundo>=tercero){
			System.out.println ("Orden: "+tercero+" "+segundo+" "+primero); 
			}

		else if (primero>=tercero && tercero>=segundo) {
			System.out.println ("Orden: "+segundo+" "+tercero+" "+primero);
			}

		else if (segundo>=primero && primero>=tercero) {
			System.out.println ("Orden: "+tercero+" "+primero+" "+segundo); 
			}

		else if (segundo>=tercero && tercero>=primero) {
			System.out.println ("Orden: "+primero+" "+tercero+" "+segundo); 
			}

		else if (tercero>=primero && primero>=segundo) {
			System.out.println ("Orden: "+segundo+" "+primero+" "+tercero); 
			}
		
		else if (tercero>=segundo && segundo>=primero) { 
			System.out.println ("Orden: "+primero+" "+segundo+" "+tercero); 
			}
		else {System.out.println("ERROR");}

		}	
	}

