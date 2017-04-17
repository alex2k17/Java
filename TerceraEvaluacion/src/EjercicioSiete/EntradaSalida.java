package EjercicioSiete;

import javax.swing.JOptionPane;

public class EntradaSalida {

	public static byte pedirNumero( String cadena, byte numeroMayor) throws NullPointerException {
		String nombre="";
		int numero=0;
		boolean correcto= false;

		
		while (!correcto){
			try{
				nombre = JOptionPane.showInputDialog(null, cadena, "MENÚ", JOptionPane.QUESTION_MESSAGE);
				if (nombre == null)
					throw new NullPointerException();
				numero = Integer.parseInt(nombre);
				if (numero < 1 || numero > numeroMayor)
					throw new NumberFormatException();
				correcto = true;
			}catch (NumberFormatException o) {
				JOptionPane.showMessageDialog(null, "Por favor, escoge una opción [1-" + numeroMayor + "]",
						"¡Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		return (byte) numero;
	}
	
	
	@SuppressWarnings("unchecked")
	public static <G> G leeNumero(String Mensaje, G tipoNumero) {
		String texto;
		boolean salida = false;
		G valor = null;

		while(!salida){
			try{
				texto = JOptionPane.showInputDialog(null, Mensaje, "MENÚ", JOptionPane.QUESTION_MESSAGE);
			
				if (texto == null)
					throw new NullPointerException();
		
				if (tipoNumero instanceof Byte)
					valor = (G) Byte.valueOf(texto);
				
				else if (tipoNumero instanceof Short)
					valor = (G) Short.valueOf(texto);
				
				else if (tipoNumero instanceof Integer)
					valor = (G) Integer.valueOf(texto);
				
				else if (tipoNumero instanceof Long)
					valor = (G) Long.valueOf(texto);
				
				else if (tipoNumero instanceof Float)
					valor = (G) Float.valueOf(texto);
				
				else if (tipoNumero instanceof Double)
					valor = (G) Double.valueOf(texto);
				
				else
					valor = (G) texto;
				
				salida = true;
			
				}catch(NumberFormatException o){
					if (tipoNumero instanceof Byte)
						JOptionPane.showMessageDialog(null, "Rango de posibles números BYTE [" + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE + "]",
								"¡Error!", JOptionPane.ERROR_MESSAGE);
					else if (tipoNumero instanceof Short)
						JOptionPane.showMessageDialog(null, "Rango de posibles números SHORT [" + Short.MIN_VALUE + " a " + Short.MAX_VALUE + "]",
								"¡Error!", JOptionPane.ERROR_MESSAGE);
					else if (tipoNumero instanceof Integer)
						JOptionPane.showMessageDialog(null, "Rango de posibles números INTEGER [" + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE + "]",
								"¡Error!", JOptionPane.ERROR_MESSAGE);
					else if (tipoNumero instanceof Long)
						JOptionPane.showMessageDialog(null, "Rango de posibles números LONG [" + Long.MIN_VALUE + " a " + Long.MAX_VALUE + "]",
								"¡Error!", JOptionPane.ERROR_MESSAGE);
					else if (tipoNumero instanceof Float)
						JOptionPane.showMessageDialog(null, "Rango de posibles números FLOAT [" + Float.MIN_VALUE + " a " + Float.MAX_VALUE + "]",
								"¡Error!", JOptionPane.ERROR_MESSAGE);
					else
						JOptionPane.showMessageDialog(null, "Rango de posibles números DOUBLE [" + Double.MIN_VALUE + " a " + Double.MAX_VALUE + "]",
								"¡Error!", JOptionPane.ERROR_MESSAGE);
				}
		}
		return valor;
	}

	
}
