package Ejer16;

import javax.swing.JOptionPane;
public class Ejercicio16 {
	
	public static void main(String[] args) {
	int m=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea gestionar?: \n1. Planta \n2. Alfareria"));
	
	switch(m){
		case 1:
			Planta p = new Planta(20.0,"San Pedro",false); 
			dameDatos(p);
			break;
		
		case 2:
			Alfareria a = new Alfareria(30.0,"Vasija",true);
			dameDatos(a);
			break;
			
		default:
			System.out.println("Operacion cancelada a peticion suya.");
		}
	
	}
	
	
	public static void dameDatos(Mercancia producto) {
		System.out.println("Descripcion: " + producto.dameDescripcion()); 
		System.out.println("Precio: " + producto.damePrecio()); 
	}
	
}
