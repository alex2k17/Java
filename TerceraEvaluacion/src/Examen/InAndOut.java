package Examen;

import javax.swing.JOptionPane;

public class InAndOut {

	public static String pedirDato( String cadena) throws NullPointerException {
		String modelo="";
		while( modelo.equals("")) {
		modelo = JOptionPane.showInputDialog(cadena);
		if (modelo == null)
			throw new NullPointerException();
		}
		return modelo;
	}
	
	public static int pedirNumero( String cadena) throws NullPointerException {
		String nombre="";
		int numero=0;
		boolean correcto= false;
		while (!correcto){
			try{
				nombre = JOptionPane.showInputDialog(cadena);
				if (nombre == null)
					throw new NullPointerException();
				numero = Integer.parseInt(nombre);
				correcto = true;
			}catch (NumberFormatException o) {
				JOptionPane.showMessageDialog(null, "Debe de introducir un n√∫mero entero",
						"Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		return numero;
	}
	
	public static boolean pedirBoolean(String cadena) throws NullPointerException {
		String nombre="";
		boolean salir = false;
		boolean respuesta = true;
		
		while( !salir) {
			nombre = JOptionPane.showInputDialog(cadena);
			if (nombre == null)
				throw new NullPointerException();
			else if(nombre.equalsIgnoreCase("si") )
				salir = true;
			else if(nombre.equalsIgnoreCase("no") ) {
				respuesta = false;
				salir = true;
			} else {
				JOptionPane.showMessageDialog(null, "Por favor, escriba SI o NO.",
						"Error!", JOptionPane.ERROR_MESSAGE);
			}
		}
		return respuesta;
	}
		
		public static float pedirAltura() throws NullPointerException {
			String nombre="";
			float numero=0;
			boolean correcto= false;
			while (!correcto){
				try{
					nombre = JOptionPane.showInputDialog("Introduzca una altura");
					numero = Float.parseFloat(nombre);
					correcto = true;
				}catch (NumberFormatException o) {
					JOptionPane.showMessageDialog(null, "Debe de introducir un n√∫mero entero",
							"Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
			return numero;
		}
		
		public static double pedirNota(int num) throws NullPointerException {
			String nombre="";
			double numero=0;
			boolean correcto= false;
			while (!correcto){
				try{
					nombre = JOptionPane.showInputDialog("Por favor, introduzca la nota del ex√°men n¬∫" + num + ":");
					numero = Double.parseDouble(nombre);
					if (numero < 0 || numero > 10)
						throw new NumberFormatException();
					correcto = true;
				}catch (NumberFormatException o) {
					JOptionPane.showMessageDialog(null, "Debe de introducir un n√∫mero entre 0 y 10",
							"Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
			return numero;
		}
		
		public static byte pedirPorcentaje( String deQue) throws NullPointerException {
			String nombre="";
			byte numero=0;
			boolean correcto= false;
			while (!correcto){
				try{
					nombre = JOptionPane.showInputDialog("Por favor, introduzca el porcentaje (en tantos %) de " + deQue + ":");
					if (nombre == null)
						throw new NullPointerException();
					numero = Byte.parseByte(nombre);
					if (numero < 0 || numero > 100)
						throw new NumberFormatException();
					correcto = true;
				}catch (NumberFormatException o) {
					JOptionPane.showMessageDialog(null, "Debe de introducir un n√∫mero entero entre 0 y 100",
							"Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
			return numero;
		}
		
		public static char pedirContenido( String deQue) throws NullPointerException {
			String nombre="";
			char contenido = 'O';
			boolean correcto= false;
			while (!correcto){
				try{
					nombre = JOptionPane.showInputDialog("Por favor, introduzca el contenido en " + deQue + ":");
					if (nombre == null)
						throw new NullPointerException();
					else if(nombre.equalsIgnoreCase("alto") ){
						contenido = 'A';
						correcto = true;
					}
					else if(nombre.equalsIgnoreCase("medio") ){
						contenido = 'M';
						correcto = true;
					}
					else if(nombre.equalsIgnoreCase("bajo") ){
						contenido = 'B';
						correcto = true;
					}else
						throw new NumberFormatException();
				}catch (NumberFormatException o) {
					JOptionPane.showMessageDialog(null, "Debe de introducir el contenido en " + deQue + "\n" +
													"(Escriba Alto, Medio o Bajo)","Error!", JOptionPane.ERROR_MESSAGE);
				}
			}
			return contenido;
		}
		
		public static void Limpiar (){
			int i;
			for(i=0;i<10;i++)
				System.out.println("");
		}
		
		
		@SuppressWarnings("unchecked")
		public static <G> G leerGenerico(String Mensaje, G tipoNumero) {
			String texto;
			boolean salida = false;
			G valor = null;

			while(!salida){
				try{
					texto = JOptionPane.showInputDialog(null, Mensaje, "MENU", JOptionPane.QUESTION_MESSAGE);
				
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
							JOptionPane.showMessageDialog(null, "Rango de posibles numeros BYTE [" + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE + "]",
									"°Error!", JOptionPane.ERROR_MESSAGE);
						else if (tipoNumero instanceof Short)
							JOptionPane.showMessageDialog(null, "Rango de posibles numeros SHORT [" + Short.MIN_VALUE + " a " + Short.MAX_VALUE + "]",
									"°Error!", JOptionPane.ERROR_MESSAGE);
						else if (tipoNumero instanceof Integer)
							JOptionPane.showMessageDialog(null, "Rango de posibles numeros INTEGER [" + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE + "]",
									"°Error!", JOptionPane.ERROR_MESSAGE);
						else if (tipoNumero instanceof Long)
							JOptionPane.showMessageDialog(null, "Rango de posibles numeros LONG [" + Long.MIN_VALUE + " a " + Long.MAX_VALUE + "]",
									"°Error!", JOptionPane.ERROR_MESSAGE);
						else if (tipoNumero instanceof Float)
							JOptionPane.showMessageDialog(null, "Rango de posibles numeros FLOAT [" + Float.MIN_VALUE + " a " + Float.MAX_VALUE + "]",
									"°Error!", JOptionPane.ERROR_MESSAGE);
						else
							JOptionPane.showMessageDialog(null, "Rango de posibles numeros DOUBLE [" + Double.MIN_VALUE + " a " + Double.MAX_VALUE + "]",
									"°Error!", JOptionPane.ERROR_MESSAGE);
					}
			}
			return valor;
		}
}

