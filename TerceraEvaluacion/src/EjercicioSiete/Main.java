package EjercicioSiete;

import java.util.LinkedList;


public class Main {

	
	@SuppressWarnings("rawtypes")
	public static <G>void main(String[] args) {
		byte opcionMenu;
		LinkedList<Caja> lista = new LinkedList<Caja>();
		LinkedList<Caja> listaNumeros = new LinkedList<Caja>();
		boolean salir = false;
		String cadena = null;
		long numero = 0;
				
		while(!salir){
			try {
					opcionMenu = EntradaSalida.pedirNumero("Seleccione una opción\n\n1. Rellenar una lista" +
							" con Cajas que guarden cadenas\n2. Recorrer la lista rellenada en el punto 1" +
							"\n3. Rellenar una lista con Cajas que guarden números de tipo Long" +
							"\n4. Recorrer la lista rellenada en el punto 3\n5. Salir", (byte)5);
					switch (opcionMenu) { 
					case 1:		
						Metodos.rellenarLista(lista, cadena);
						break;
					case 2:	
						Metodos.mostrarLista(lista, cadena);
						break;
					case 3:
						Metodos.rellenarLista(listaNumeros, numero);
						break;
					case 4:	
						Metodos.mostrarLista(listaNumeros, numero);
						break;
					case 5:
						salir = true;
						System.out.println("El programa ha finalizado con éxito.");
						break;
					}
			} catch (NullPointerException e) {
				System.out.println("Ha cancelado el programa.");
				salir = true;
			}
		}
	}

}
