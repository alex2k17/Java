package Examen;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Animales> Mapa=new HashMap<String,Animales>();
		boolean salir=false;
		boolean salirsub=false;
		
		try{
			do{
				switch(Menu()){
					case 1:
						Mapa=Metodos.NewMap();
						break;
					case 2:
						Metodos.AddAnimal(Mapa);
						break;
					case 3:
						Metodos.DelAnimal(Mapa);
						break;
					case 4:
						Metodos.ShowAnimals();
						break;
					case 5:
						do{
							switch(Submenu()){
							case 1:
								Metodos.AdelanteMapa(Mapa);
								break;
							case 2:
								Metodos.AtrasMapa(Mapa);
								break;
							case 3:
								salirsub=true;
								break;
							}
						}while(!salirsub);
					case 6:
						break;
					case 7:
						salir=true;
						System.out.println("Adiós");
						break;
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
			null, 
			new Object[] { "1. Nuevo mapa", "2. Añadir animal", "3. Eliminar animal", "4. Numero total de animales",
							"5. Consultar mapa", "6. Sorteo", "7. Salir"}, "1. Nueva mapa");
		return opc = Byte.parseByte(((String)opcion).substring(0, 1));
	}
	
	public static byte Submenu (){
		@SuppressWarnings("unused")
		byte opc;
		Object opcion = JOptionPane.showInputDialog(
			null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
			null, 
			new Object[] { "1. Consultar hacia delante", "2. Consultar hacia atras", "3. Salir"}, "1. Consultar hacia delante");
		return opc = Byte.parseByte(((String)opcion).substring(0, 1));
	}

	
}
