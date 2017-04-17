package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dias;
		double distancia, precio, descuento;
		
		distancia=Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia del viaje"));
		dias=Integer.parseInt(JOptionPane.showInputDialog("Introduce los dias de estancia"));
		
		precio=distancia*0.35;
		System.out.println("Tu distancia a recorrer: "+distancia);
		System.out.println("Dias de estancia:"+dias);
		System.out.println("------------------------------");
		System.out.println("Precio: "+precio);
		
		if (distancia>1000 && dias>7){
			descuento=precio*30/100;
			System.out.println("Tienes un Descuento de "+descuento);
		}
	}

}
