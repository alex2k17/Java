package Examen1�Evaluacion;
import javax.swing.JOptionPane;


public class Ejercicio2 {

	public static void main(String[] args) {
			double vector[]={1.9, 2.9, 3.4, 5.1, 6.2, 7.7, 8.2, 9.4, 10.7, 12.6, 15.2};
			double elemento;
			int posicion=-1; 
			try {
				elemento = peticion_elemento();
				posicion=busqueda(vector,elemento,0,vector.length-1);
				if(posicion==-1)
					JOptionPane.showMessageDialog(null,"El número "+elemento+" no se encuentra en el vector.");
				else
					JOptionPane.showMessageDialog(null,"El número "+elemento+" se encuentra en la posición "+(posicion+1));
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null,"Ha cancelado el programa. Hasta pronto");
			}
	}
	private static double peticion_elemento() throws NullPointerException {
		String texto;
		boolean valido;
		double elemento=0;
		do {
			valido=true; 
			texto = JOptionPane.showInputDialog("Introduzca el número decimal a buscar: ");
			try {
				elemento = Double.parseDouble(texto);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"Introduzca un número decimal");
				valido=false;
			}
		} while (!valido);
		return elemento;
	}
	public static int busqueda(double vector[],double elemento,int pos_ini,int pos_fin){
		int pos_media; 
		int resultado=-1;
		
		if(pos_ini>pos_fin)	//Caso base: cuando la posición inicial es mayor que la final
			resultado=-1;
		else{
			pos_media=(pos_ini+pos_fin)/2; //Busco la posición media
			if(vector[pos_media]==elemento)
				resultado=pos_media;
			else if (vector[pos_media]<elemento) 
			//Si el elemento es mayor que el que está en medio, busco en la mitad superior del vector
				resultado=busqueda(vector,elemento,pos_media+1,pos_fin);
			else
			//Si el elemento es menor que el que está en medio, busco en la mitad inferior del vector
				resultado=busqueda(vector,elemento,pos_ini,pos_media-1);
		}
		return resultado; 
	}
}

