package Ejer14;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args){
	Pez p1=new Pez();
	Pez p2=new Pez();
	String nombre;
	
	
	//Pedimos por pantalla el nombre de nuestro pez p1
	nombre=JOptionPane.showInputDialog("Introduce el nombre del pez: ");
	
	p1.setNombre(nombre);
	
	//Clonamos en p2 el pez p1
	p2=(Pez)p1.clone();
	
	//Mostramos la informacion por pantalla
	System.out.println("El nombre del pez original es: "+p1.getNombre()+" y el del pez clonado es: "+p2.getNombre());
	
	System.out.println((p1.equals(p2)?"Los dos peces son iguales":"Los dos peces son distintos"));
	
	}
}
