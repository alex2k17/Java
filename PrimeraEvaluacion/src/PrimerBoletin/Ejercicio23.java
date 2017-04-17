package PrimerBoletin;


public class Ejercicio23 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fila, columna;
			
		for (fila=0;fila<=8;fila++){
			for(columna=0;columna<=8;columna++){
				if (((fila+columna)%2)==0) 
					System.out.print ("B ");
				else 
					System.out.print ("N ");
			}
			System.out.println(" ");
		}
	}
}
