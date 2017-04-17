package EjercicioDos;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Menu {

	/**
	 * @param args
	 */
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		byte opcionprin = 0, opcion2 = 0, opcion3=0;
		ArrayList list = new ArrayList();
		Iterator it = null;
		boolean salir = false, salirsub=false;
		
		try{
			do{
			opcionprin=MenuPrin(opcionprin);
				
				switch(opcionprin){
					case 1:
						Metodos.ShowList2(list);
						break;
					case 2:
						while (!salirsub){
							opcion2=MenuSecun(opcion2);
							switch(opcion2){
								case 1:
									InAndOut.Limpiar();
									Metodos.AddElement(list);
									break;
								case 2:
									InAndOut.Limpiar();
									Metodos.AddElementPosicion(list);
									break;
								case 3:
									InAndOut.Limpiar();
									salirsub=true;
									break;
							}
						}
						break;
					case 3:
						opcion3=MenuTerc(opcion3);
						switch(opcion3){
							case 1:
								InAndOut.Limpiar();
								Metodos.DelElementPosicion(list);
								break;
							case 2:
								InAndOut.Limpiar();
								Metodos.DelEmenent(list);
								break;
						}
						break;
					case 4:
						InAndOut.Limpiar();
						Metodos.ModifyElement(list);
						break;
					case 5:
						InAndOut.Limpiar();
						Metodos.ShowElement(list);
						break;
					case 6:
						InAndOut.Limpiar();
						System.out.println("Bye bye.");
						salir=true;
						break;
					default:
						InAndOut.Limpiar();
						System.out.println("ERROR.");
						salir=true;
				}
			
			}while(!salir);
		}catch(NullPointerException o){
			InAndOut.Limpiar();
			System.out.println("Ha abandonado el programa.");
			salir = true;
		}
	}

	
	public static byte MenuPrin (byte opcionprin) throws NullPointerException{
		Object opcion = JOptionPane.showInputDialog(
			null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
			null,  // null para icono defecto
			new Object[] { "1. Nueva lista", "2. Añadir elemento", "3. Eliminar Elemento", "4. Modificar Elemento",
							"5. Consultar elemento", "6. Salir" }, "Nueva lista");
		return opcionprin = Byte.parseByte(((String)opcion).substring(0, 1));
	}
	
	public static byte MenuSecun (byte opcion2)throws NullPointerException{
		Object opcion = JOptionPane.showInputDialog(
				null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
				null,  // null para icono defecto
				new Object[] { "2.1 Añadir un Elemento", "2.2 Añadir un elemento en una posicion", "2.3 Salir"}, "Añadir un Elemento");
			return opcion2 = Byte.parseByte(((String)opcion).substring(2, 3));
	}
	
	public static byte MenuTerc (byte opcion3)throws NullPointerException{
		Object opcion = JOptionPane.showInputDialog(
				null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
				null,  // null para icono defecto
				new Object[] { "3.1 Eliminar por posicion", "3.2 Eliminar por contenido",}, "Eliminar por posicion");
			return opcion3 = Byte.parseByte(((String)opcion).substring(2, 3));
	}
	
}
