package Examen2;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		final int tam=4;
		boolean salir=false;
		Sorpresa cuadrado[][]=new Sorpresa[tam][tam];
		
		try{
			do {
				switch(Menu()){
				case 1:
					Metodos.cuadradoRandom(cuadrado, tam);
					break;
				case 2:
					Metodos.mostrarCuadrado(cuadrado, tam);
					break;
				case 3:
					Metodos.Jugar(cuadrado, tam);
				case 4:
					salir=true;
					break;
				}
		
			}while(!salir);
		}catch(NullPointerException e){
			System.out.println("Ha cancelado el programa.");
		}
	
	}
	
	public static byte Menu (){
		byte opc;
		Object opcion = JOptionPane.showInputDialog(
			null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
			null, 
			new Object[] { "1. Rellena Cuadrado", "2. Mostrar Cuadrado", "3. Jugar", "4. Salir"}, "1. Rellena Cuadrado");
		return opc = Byte.parseByte(((String)opcion).substring(0, 1));
	}
}
