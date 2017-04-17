/**
 * 
 */
package Arrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][];
		int i, j;
		int tamfil, tamcol;
		
		tamfil=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el Numero de filas del array: "));
		tamcol=Integer.parseInt(JOptionPane.showInputDialog ("Introduce el Numero de columnas del array: "));
		
		matriz=new int [tamfil][tamcol];
		
		System.out.println("Tu array: ");
		for (i=0;i<tamfil;i++){
			for(j=0;j<tamcol;j++){
				matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog ("Rellena el Array: "));
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println("");
		}
		
		if (esSimetrico(matriz, tamcol, tamfil)){
			System.out.println("Es simetrico");
		}
		else {System.out.println("No es simetrico");}
		
		
	}

	public static boolean esSimetrico (int matriz[][], int tamcol, int tamfil){
		int i, j;
		
		for (i=0;i<tamfil;i++){
			for (j=0;j<tamcol;j++){
				if (matriz[i][j]==matriz[j][i]){
					return true;
				}
			}
		}
		return false;
		
	}
	
}
