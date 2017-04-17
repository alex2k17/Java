/**
 * 
 */
package OrientacionObjetos;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class AplicacionVehi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Vehiculo vehi[]= new Vehiculo[15];
		
		String modelo="";
		double potencia=0;
		String traccion="";
		
		//Atributos de la clase Vehiculos
		int i = 0;
		
		try {
			do{
				i++;
				do {
					modelo = JOptionPane.showInputDialog("Modelo del vehiculo: ").trim();
					if (!vehifin(modelo))
						throw new NullPointerException();
				} while (modelo.isEmpty());
				
				do {
					potencia = Integer.parseInt(JOptionPane.showInputDialog("Potencia del vehiculo: "));
				} while (potencia < 0);
				
				do {
					traccion = JOptionPane.showInputDialog("¿El vehiculo tiene traccion a las 4 ruedas?").trim();
				} while (traccion.isEmpty());
				
				System.out.println(MostrarVehi(vehi, modelo, potencia, traccion, i));
			}while (i < 15);

		} catch (NullPointerException e) {
			System.out.println("Ha cancelado el programa. Gracias por utilizar nuestra aplicacion Vehiculos");
		}
	
	}
	
	public static String MostrarVehi (Vehiculo vehi[], String modelo, double potencia, String traccion, int i){
		String MostrarVehi = "";

		if (traccion!= null && !traccion.isEmpty()){
			vehi[i] = new Vehiculo(modelo, potencia, traccion);
		}
		else {vehi[i]= new Vehiculo(modelo, potencia);}
			
		System.out.printf("El vehiculo %s traccion.\n", (vehi[i].HaveTraccion()) ? "no tiene" : "tiene");
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("Vehiculo introducido Numero "+(i)+": ");
		System.out.print(vehi[i].toString());
		return MostrarVehi;
		
	}
	
	public static boolean vehifin (String modelo){
		if (modelo.equalsIgnoreCase("fin"))
			return false;
		else
			return true;
	}

}
