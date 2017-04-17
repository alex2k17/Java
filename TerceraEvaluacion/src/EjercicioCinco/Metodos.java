package EjercicioCinco;

import java.util.LinkedList;

public class Metodos {
	
	public static LinkedList<Byte> NewCola(){
		LinkedList<Byte> Cola = new LinkedList<Byte>();
		System.out.println("Nueva Cola creada.");
		return Cola;
	}
	
	@SuppressWarnings("rawtypes")
	public static void SeeCola (LinkedList<Byte> Cola){
		int posicion;
		try{
			posicion=InAndOut.pedirNumero("Introduce la posicion para mostrar el elemento: ");
			System.out.println("Elemento: "+Cola.get(posicion-1));
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void AddElement (LinkedList Cola){
		byte data;
		try{
			data=InAndOut.pedirByte("Introduce el elemento: ");
			Cola.addFirst(data);
			System.out.println("Elemento añadido correctamente.");
		}catch (NullPointerException e){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void DelElement (LinkedList Cola){
		if (Cola.isEmpty()){
			System.out.println("La cola esta vacia.");
		}
		else{
		Cola.removeFirst();
		System.out.println("Elemento borrado correctamente.");
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void ShowCola (LinkedList Cola){
		System.out.println(Cola);
	}
	

}
