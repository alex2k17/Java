package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cadena1 = null;
		String cadena2 = null;
		int cuenta = 0;
		boolean cadena_valida=true;
		
		try{
			do {
				try{
					cadena_valida=true;
					cadena1=(JOptionPane.showInputDialog ("Escriba una frase"));
					if (cadena1==null)
						throw new NullPointerException();
					else if (cadena1.equals("") || cadena1.equals(" "))
						throw new NumberFormatException();
					cadena2=(JOptionPane.showInputDialog ("Cadena a buscar en la frase"));
					if (cadena2==null)
						throw new NullPointerException();
					else if (cadena2.equals("") || cadena2.equals(" "))
						throw new NumberFormatException();
				
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,	"Debe introducir un caracter");
					cadena_valida=false;
					}
				}while(!cadena_valida);
			//Ya tenemos los datos, ahora hacemos el programa...
			
			System.out.println("Frase: "+cadena1);
		    while (cadena1.indexOf(cadena2)>-1){
			      cadena1=cadena1.substring(cadena1.indexOf(cadena2)+cadena2.length());
			      cuenta++; 
			    }
		    	
		    System.out.println("La cadena "+cadena2+" se repite "+cuenta+" veces");
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}
		
	}

}
