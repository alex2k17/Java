/**
 * 
 */
package Cadenas;

import javax.swing.JOptionPane;

/**
 * @author Alex
 *
 */
public class Ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String cadena1 = null, cadenacon = "", numero;
		boolean cadena_valida=true;
		int n = 0, i, acaba;
		
		
		try{
			do {
				cadena_valida=true;
				cadena1=(JOptionPane.showInputDialog ("Introduce una cadena: "));
				if (cadena1==null)
					throw new NullPointerException();
				numero=JOptionPane.showInputDialog ("Introduce el numero de caracteres a copiar: ");
				if (numero==null)
					throw new NullPointerException();
				n = Integer.parseInt(numero);
				if (n<=0){
					JOptionPane.showMessageDialog(null,	"El numero tiene que ser mayor que 0");
					cadena_valida=false;
				}		
			}while(!cadena_valida);
			//Ya tenemos los datos, ahora hacemos el programa...
			
			i=cadena1.length();
			acaba=i-n;
			
			for (i=cadena1.length();i>acaba;i--)
				cadenacon+=cadena1.charAt(i-1);
			
			System.out.println("Cadena 1: "+cadena1);
			System.out.println("Resultado: "+cadenacon);
			
		}catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "Se canceló el programa a petición suya.\nNos vemos!!");
		}	
		
	}

}
