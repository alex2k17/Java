package Ejer17;

import javax.swing.JOptionPane;
public class Ejercicio17 {
	
	public static void main(String[] args) {
		int m=Integer.parseInt(JOptionPane.showInputDialog("¿Que desea ver?: \n1. Planta \n2. Alfareria"));
	
		switch(m){
			case 1:
				Planta p = new Planta(20.0,"San Pedro",false,true); 
				dameDatos(p);
				break;
		
			case 2:
				Alfareria a = new Alfareria(30.0,"Vasija",true,"Madera",2.0);
				dameDatos(a);
				break;
			
			default:
				System.out.println("Operacion cancelada a peticion suya.");
		}
	
	}
	
	public static void dameDatos(Mercancia producto) {
		System.out.println("Descripcion: " + producto.dameDescripcion()); 
		System.out.println("Precio: " + producto.damePrecio()); 
		if(producto instanceof MercanciaViva){
			System.out.println("Necesita comer: " + (((MercanciaViva)producto).necesitaComida() ? "Si" : "No"));
			System.out.println("Necesita Riego: " + (((MercanciaViva)producto).necesitaRiego() ? "Si" : "No"));
		}
		else if(producto instanceof MercanciaFragil){
			System.out.println("Embalaje: " + ((MercanciaFragil)producto).dameEmbalaje());
			System.out.println("Peso: " + ((MercanciaFragil)producto).damePeso());
		}
	}
	
}