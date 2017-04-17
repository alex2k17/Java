package Ejer15;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args){
	
		int opcion;
		
		//
		opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Quieres crear un pez? Pulsa 1\nCualquier otro numero para Salir"));
		
		//Si el usuario introduce un 1 se le pide el nombre del pez, si introduce otro numero finaliza el programa.
		
		while (opcion==1){
			
			Pez p1=new Pez();
			String nombre;
			
			nombre=JOptionPane.showInputDialog("Introduce el nombre del pez");
			p1.setNombre(nombre);
			
			//Mostramos el numero y el nombre del pez creado
			System.out.println("El nombre del pez numero "+Pez.NumPeces()+" es: "+p1.getNombre());
			
			opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Quieres introducir mas peces? Pulsa 1"));
		
		
			}

		System.out.println("El numero de peces es: "+Pez.NumPeces()+"\nHasta la vista");
	}
}
