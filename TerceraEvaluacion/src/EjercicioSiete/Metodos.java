package EjercicioSiete;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Metodos {
	
	@SuppressWarnings("rawtypes")
	public static <G> void rellenarLista (LinkedList<Caja> lista, G contenido){
		byte contador;
		Caja<G> caja = null;
		
		try{
			for (contador = 1; contador < 11; contador++){
				contenido = EntradaSalida.leeNumero("Introduzca el contenido de la caja" +
													"\n\n(Caja número: " + contador + " de 10)", contenido);
			
				caja = new Caja<G>(contenido);
				lista.addLast(caja);
			}
		}catch(NullPointerException o){
			lista.clear();
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <G> void mostrarLista (LinkedList<Caja> lista, G contenido){
		byte contador;
		long sumaTotal = 0;
		Caja<G> caja;
		
		if (lista.isEmpty())
			JOptionPane.showMessageDialog(null, "La lista está vacía", null, JOptionPane.ERROR_MESSAGE);
		else{
			caja = new Caja<G>();
			for (contador = 0; contador < 10; contador++){
				caja = lista.get(contador);
				contenido = (G) caja.getContenido();		
				System.out.println("Contenido de la caja número " + (contador + 1) + ": \""
									+ contenido + "\". Tipo de dato: "
									+ contenido.getClass().getSimpleName());
			
				if (contenido instanceof Long)
					sumaTotal += ((Long) contenido).longValue();
			}
			if (contenido instanceof Long)
				System.out.println("\nLa suma total es: " + sumaTotal);
		}
	}	

}
