/**
 * 
 */
package Arrays;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int matriz[][]=new int [4][3];
		int i,j;
		int col[]=new int [3];
		int fila[]=new int [4];
		
		Arrays.fill(col,0);
		Arrays.fill(fila,0);
		
		try{
		System.out.println("Tu array: ");
		for (i=0;i<4;i++){
			for(j=0;j<3;j++){
				matriz[i][j]=Integer.parseInt(JOptionPane.showInputDialog ("Ingrese numeros en el array: "));
				System.out.print(matriz[i][j]+" ");
				col[j]+=matriz[i][j];
				fila[i]+=matriz[i][j];
			}
			System.out.println("");
		}
		
		System.out.println("");
		for (j=0;j<3;j++){
			System.out.println(+j+"º columna: "+col[j]);
		}
		
		System.out.println("");
		for (i=0;i<4;i++){
			System.out.println(+i+"º Fila: "+fila[i]);
		}
		}catch(NumberFormatException e){
			System.out.println("");
			System.out.println("Has cancelado o has introducido un numero decimal");
			}
	}
}
