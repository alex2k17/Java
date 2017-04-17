/**
 * 
 */
package TercerBoletinArrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double matriz[][][]=new double [3][3][3];
		int i, j , k;
		double numero = 0;
		int posicionfil = 0, posicioncol=0, posicioncapa=0;
		
		try{
		System.out.println("Tu array: ");
		for (i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					matriz[i][j][k]=Double.parseDouble(JOptionPane.showInputDialog ("Ingrese numeros en el array: "));
					System.out.print(matriz[i][j][k]+" ");
					if (numero<matriz[i][j][k]){
						numero=matriz[i][j][k];
						posicionfil=i;
						posicioncol=j;
						posicioncapa=k;
					}
				}
				System.out.println("");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("El numero mayor es: "+numero);
		System.out.println("Posiciones: "+posicionfil+" "+posicioncol+" "+posicioncapa);
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
		
	}

}
