package TercerBoletinArrays;

import javax.swing.JOptionPane;


public class Ejercicio16 {


	public static void main(String[] args) {
		
		int matriz[][],i,j,sumadp=0,sumadi=0;
		int sumafila[];
		int sumacol[];
		String texto=null;
		boolean magico=true,tam_valido;
		int tam=0;
		
	
		try{
			do {
				tam_valido=true;
				//Petición al usuario del tamaño de la matriz
				texto = JOptionPane.showInputDialog("Introduzca el tamaño de la matriz: ");
				if (texto == null)
					throw new NullPointerException();
				try {
					tam = Integer.parseInt(texto);
					if(tam<=0)
						tam_valido=false;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,	"Debe introducir un número entero positivo");
					tam_valido=false;
				}
			} while (!tam_valido);
			matriz=new int[tam][tam];
			sumafila=new int[tam];
			sumacol=new int[tam];
			//Introducción de datos en la matriz
			for(i=0;i<tam;i++){
				for(j=0;j<tam;j++){
					texto=JOptionPane.showInputDialog("Introduzca un número entero para la posición "+(i+1)+","+(j+1)+":");
					if (texto==null) throw new NullPointerException();
					try{
						matriz[i][j]=Integer.parseInt(texto);
						System.out.print(" "+matriz[i][j]);
						sumafila[i]+=matriz[i][j];//formula para almacenar la suma de cada fila en un array unidimensional
						sumacol[j]+=matriz[i][j];//formula para almacenar la suma de cada columna en un array unidimensional
						if(i==j)  //Compruebo si estoy en la diagonal principal
							sumadp+=matriz[i][j];
						else if(i+j==tam-1) //Compruebo si estoy en la diagonal secundaria
							sumadi+=matriz[i][j];
					}
					catch(NumberFormatException e){
						JOptionPane.showMessageDialog(null, "Debe introducir números enteros para ejecutar correctamente\nel programa.");
						j--;
					}
				}
				System.out.println();
			}
			//Ya tengo todos los datos.Ahora compruebo si es un cuadrado mágico 
			if(sumadp!=sumadi)
				magico=false;
			else{
				for(i=0;i<tam && magico;i++)	
					if(sumafila[i]!=sumadp || sumacol[i]!=sumadp)
						magico=false;
			}
			//Muestro el resultado final por pantalla
			if(magico) System.out.println("Es un cuadrado mágico.");
			else System.out.println("No es un cuadrado mágico.");
	
		}
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}
		
	}

}