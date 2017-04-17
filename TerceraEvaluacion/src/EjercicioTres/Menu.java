package EjercicioTres;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Menu {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		boolean salir = false;
		
		try{
			do {
				switch (Menu()){
					case 1:
						Metodos.ShowList(list);
						break;
					case 2:
						Metodos.ShowList2(list);
						break;
					case 3:
						Metodos.SearchElement(list);
						break;
					case 4:
						Metodos.ReplaceElement(list);
						break;
					case 5:
						Metodos.AddElement(list);
						break;
					case 6:
						System.out.println("Hasta pronto!");
						salir=true;
				}
			}while(!salir);
		
		}catch(NullPointerException e){
			System.out.println("Ha cancelado el programa");
		}
	}	
	
	@SuppressWarnings("unused")
	public static byte Menu () throws NullPointerException{
		byte opc;
		Object opcion = JOptionPane.showInputDialog(
				null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
				null,  // null para icono defecto
				new Object[] { "1. Mostrar lista", "2. Mostrar lista al reves", "3. Buscar cadena por patron", "4. Reemplazar cadena",
								"5. Añadir Cadena", "6. Salir" }, "5. Añadir Cadena");
			return opc = Byte.parseByte(((String)opcion).substring(0, 1));
	}

}
