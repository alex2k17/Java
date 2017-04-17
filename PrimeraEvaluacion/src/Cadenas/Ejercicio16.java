/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1[][]=new String[4][4];
		String caracter, resul="", aux1="";
		char carac;
		int i = 0, j = 0, x;
		int menu, submenu, aux;
		
		
		try{
			for (i=0;i<4;i++){
				for (j=0;j<4;j++){
					do{
						cadena1[i][j]=JOptionPane.showInputDialog ("Introduce la palabra en la fila "+(i+1)+" columna "+(j+1)+": ");
					}while(cadena1[i][j].equals(" ") || cadena1[i][j].equals(""));
				}
			}
			
			do {
			JOptionPane.showMessageDialog(null, "Bienvenido a nuestro programa! :D");
			menu=Integer.parseInt(JOptionPane.showInputDialog("MENU\n 1. Impares o pares\n 2. Busqueda\n 3. Salir"));
			if (menu==1){
				do{
				submenu=Integer.parseInt(JOptionPane.showInputDialog("Submenu\n 1. Impares\n 2. Pares\n 3. Salir"));	
				
				if (submenu==1){
					for(i=0;i<4;i++){
						for(j=0;j<4;j++){
							aux=i+j;
							if (aux%2==1)
								System.out.print(" "+cadena1[i][j]);
						}
					}
				}
				else if (submenu==2){
					for(i=0;i<4;i++){
						for(j=0;j<4;j++){
							aux=i+j;
							if (aux%2==0)
								System.out.print(" "+cadena1[i][j]);
						}
					}
				}
				}while(submenu==1 || submenu==2);
			}
				
			else if (menu==2){
				do{
					caracter=JOptionPane.showInputDialog ("Introduce el caracter a buscar: ");
				}while(caracter.matches("[a-z]")==false);
				carac=caracter.charAt(0);
				for (i=0;i<4;i++){
					for(j=0;j<4;j++){
						aux1=cadena1[i][j];
						for (x=0;x<aux1.length();x++){
							if (aux1.charAt(x)==carac){
								resul=aux1.replace(carac, '*');
		                		System.out.println("la palabra "+resul+" en la fila "+(i+1)+" y columna "+(j+1));
							}
						}
					}
				}

			}
	
			}while(menu==1 || menu==2);
		
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}		
		
	}

}
