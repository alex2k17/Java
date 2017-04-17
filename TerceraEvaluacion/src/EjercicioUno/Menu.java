package EjercicioUno;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Menu {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		byte opcionMenu;
		ArrayList list = new ArrayList();
		Iterator it = null;
		boolean salir = false;
		
		while(!salir){
		// Con JCombobox
			try {
					Object opcion = JOptionPane.showInputDialog(
					null,"Seleccione una opción","MENÚ",JOptionPane.QUESTION_MESSAGE,
					null,  // null para icono defecto
					new Object[] { "1. Nueva lista", "2. Añadir elemento", "3. Mostrar siguiente", "4. Eliminar último mostrado",
				   						"5. Eliminar uno en concreto", "6. Mostrar lista entera", "7. Salir" }, "Nueva lista");
					opcionMenu = Byte.parseByte(((String)opcion).substring(0, 1));
		
					switch (opcionMenu) { //Para no poner un try-catch a cada uno, pongo un try-catch general y utilizo un switch-case.
					case 1:		
						list = MethodsClass.NewList();
						break;
					case 2:	
						MethodsClass.AddElement(list);		
						it=list.iterator();
						break;
					case 3:
						it = MethodsClass.ShowNextElement(list, it);
						break;
					case 4:	
						MethodsClass.RemoveLast(list, it);
						break;
					case 5:	
						MethodsClass.Remove(list);
						it=list.iterator();
						break;
					case 6:	
						MethodsClass.ShowList(list);
						break;
					case 7:
						throw new NullPointerException();
					}
			} catch (NullPointerException e) {
				System.out.println("Ha abandonado el programa.");
				salir = true;
			}
		}
	}
}
