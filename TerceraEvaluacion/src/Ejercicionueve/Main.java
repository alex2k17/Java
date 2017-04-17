package Ejercicionueve;

import java.util.HashSet;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		HashSet<Personas> lista=new HashSet<Personas>();
		boolean salir=false;
		
		try{
			do{
				switch(Menu()){
					case 1:
						lista=Metodos.NewLista();
						break;
					case 2:
						Metodos.AddElement(lista);
						break;
					case 3:
						Metodos.DelElement(lista);
						break;
					case 4:
						for (Personas persona : lista) {
							System.out.println(persona);
							}
						break;
					case 5:
						System.out.println("Adiós");
						salir=true;
						break;
					default:
						System.out.println("ERROR.");
				}
			}while(!salir);
		}catch (NullPointerException e){
			System.out.println("Ha cancelado el programa");
		}
	}

	@SuppressWarnings("unused")
	public static byte Menu (){
		byte opc;
		Object opcion = JOptionPane.showInputDialog(
				null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
				null,  // null para icono defecto
				new Object[] { "1. Nueva lista", "2. Añadir Persona", "3. Eliminar Persona", "4. Consultar lista",
								"5. Salir"}, "1. Nueva lista");
			return opc = Byte.parseByte(((String)opcion).substring(0, 1));
	}
}
