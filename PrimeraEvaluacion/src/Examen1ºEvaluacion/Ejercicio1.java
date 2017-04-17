package Examen1�Evaluacion;
import javax.swing.JOptionPane;


public class Ejercicio1 {

	public static void main(String[] args) {
		
		byte n=0;
		byte matriz[][];  	//Matriz introducida para guardar los datos del usuario
		byte diags[][];		/*Matriz para guardar las diagonales. La fila 0 para la diagonal 
				 			principal y la fila 1 para la diagonal secundaria*/
		byte cols[][];		//Matriz para guardar las columnas 
		int salir=0;        //Para controlar cuando desea salir el usuario
		
		try {
			do {
				n = pedir_tam();
				matriz = new byte[n][n];
				cols = new byte[n][n];
				diags = new byte[2][n];
				rellenar_matriz(matriz, cols, diags);
				comprobar_matriz(matriz,"fila");
				comprobar_matriz(cols,"columna");
				comprobar_diagonales(diags);
				salir=JOptionPane.showConfirmDialog(null, "¿Desea salir?");
				//Resultados del showConfirmDialog: Sí:0,No:1,Cancelar:2
				if(salir==2)
					throw new NullPointerException();
			} while (salir==1);
		} catch (NullPointerException e) { //Controlo aquí el botón Cancelar
			JOptionPane.showMessageDialog(null,"Gracias por utilizar nuestra aplicación");
		}	
	}
	private static byte pedir_tam() throws NullPointerException {
		String texto;
		boolean valido;
		byte n=0;
		do {
			valido = true;
			try {
				texto = JOptionPane.showInputDialog("Introduzca el tama�o de la matriz: ");
				if (texto == null) //Si el usuario cancela, el texto se queda a null
					throw new NullPointerException();
				n = Byte.parseByte(texto);
				if(n<=0)
					throw new NumberFormatException();
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null,"No ha introducido bien el tama�o de la matriz");
				valido = false;
			}
		} while (!valido);
		return n;
	}
	public static void rellenar_matriz(byte matriz[][],byte cols[][],byte diags[][]) throws NullPointerException {
		final byte PRINCIPAL=0;
		final byte SECUNDARIA=1;
		String texto;
		byte i,j;
		int tam;
		
		tam=matriz.length;
		for(i=0;i<tam;i++){
			for(j=0;j<tam;j++){
				texto=JOptionPane.showInputDialog("Introduzca un numero entre 0 y 9 para la posicion "+(i+1)+", "+(j+1));
				if(texto==null)	//Ha cancelado el usuario
					throw new NullPointerException();
				try {
					matriz[i][j] = Byte.parseByte(texto);
					if(matriz[i][j]<0 || matriz[i][j]>9)
						throw new NumberFormatException();				
					System.out.print(" "+matriz[i][j]+" ");//Lo saco por consola para tener la matriz 
					cols[j][i]=matriz[i][j]; /* En el array de columnas, guardo las 
								columnas en las filas para facilitar el recorrido después*/
					if(i==j)  //Pertenece a la diagonal principal
						diags[PRINCIPAL][i]=matriz[i][j];
					else if(i+j==tam-1) //Pertenece a la diagonal secundaria
						diags[SECUNDARIA][i]=matriz[i][j];
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,"El numero debe estar comprendido entre 0 y 9");
					j--;
				}
			}
			System.out.println();
		}		
	}
	public static void comprobar_matriz(byte matriz[][],String elemento){
		byte i;
		int tam;
		tam=matriz.length;		
		for(i=0;i<tam;i++)
			if(capicua(matriz[i]))
				System.out.println("La "+elemento+" "+(i+1)+" es capicua");
	}
	public static void comprobar_diagonales(byte diags[][]){
		final byte PRINCIPAL=0;
		final byte SECUNDARIA=1;
		
		if(capicua(diags[PRINCIPAL]))
			System.out.println("La diagonal principal es capicua");
		if(capicua(diags[SECUNDARIA]))
			System.out.println("La diagonal secundaria es capicua");
	}
	public static boolean capicua(byte array[]){
		int i,j;
		boolean capicua=true;
		
		for(i=0,j=array.length-1;i<j && capicua;i++,j--)
			if(array[i]!=array[j])
				capicua=false;
		return capicua;
	}
}