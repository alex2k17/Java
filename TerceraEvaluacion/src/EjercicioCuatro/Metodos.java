package EjercicioCuatro;

import java.util.LinkedList;

public class Metodos {
	
	public static LinkedList<Byte> NewPile(){
		LinkedList<Byte> Pile = new LinkedList<Byte>();
		System.out.println("Nueva Pila creada.");
		return Pile;
	}
	
	@SuppressWarnings("rawtypes")
	public static void SeePile (LinkedList<Byte> Pile){
		int posicion;
		try{
			posicion=InAndOut.pedirNumero("Introduce la posicion para mostrar el elemento: ");
			System.out.println("Elemento: "+Pile.get(posicion-1));
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void AddElement (LinkedList Pile){
		byte data;
		try{
			data=InAndOut.pedirByte("Introduce el elemento: ");
			Pile.addLast(data);
			System.out.println("Elemento añadido correctamente.");
		}catch (NullPointerException e){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void DelElement (LinkedList Pile){
		if (Pile.isEmpty()){
			System.out.println("No existe ningun Elemento para borrar.");
		}
		else{
		Pile.removeLast();
		System.out.println("Elemento borrado correctamente.");
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void ShowPile (LinkedList Pile){
		System.out.println(Pile);
	}
	

}
