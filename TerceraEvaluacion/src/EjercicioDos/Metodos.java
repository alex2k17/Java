package EjercicioDos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import EjercicioUno.InAndOut;

public class Metodos {
	
	@SuppressWarnings("rawtypes")
	public static ArrayList NewList(){
		ArrayList list = new ArrayList();
		System.out.println("Nueva lista creada.");
		return list;
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void AddElement(ArrayList list){
		String data;
		try{
			data = InAndOut.pedirDato("Por favor, introduzca un nuevo elemento");
			list.add(data);
			System.out.println("Elemento añadido correctamente.");
		}catch(NullPointerException o){
		}
	}
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void AddElementPosicion(ArrayList list){
		int posicion;
		String data;
		try{
			posicion=InAndOut.pedirNumero("Introduce la posicion para añadir el elemento: ");
			data = InAndOut.pedirDato("Por favor, introduzca un nuevo elemento");
			list.add(posicion, data);
			System.out.println("Elemento añadido correctamente.");
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void DelElementPosicion (ArrayList list){
		int posicion;
		try{
			posicion=InAndOut.pedirNumero("Introduce la posicion para eleminar el elemento: ");
			list.remove(posicion);
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void DelEmenent (ArrayList list){
		String data;
		try{
			data=InAndOut.pedirDato("Introduce el elemento que desea eliminar: ");
			list.remove(data);
			System.out.println("Elemento eliminado correctamente.");
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void ModifyElement (ArrayList list){
		int posicion;
		String data;
		try{
			posicion=InAndOut.pedirNumero("Introduce la posicion para modificar el elemento: ");
			data = InAndOut.pedirDato("Introduce el nuevo elemento: ");
			System.out.println("Elemento Antiguo: "+list.set(posicion, data));
			System.out.println("Elemento Nuevo: "+list.get(posicion));
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void ShowElement (ArrayList list){
		int posicion;
		try{
			posicion=InAndOut.pedirNumero("Introduce la posicion para mostrar el elemento: ");
			System.out.println("Elemento: "+list.get(posicion));
		}catch(NullPointerException o){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void ShowList (ArrayList list){
		System.out.println(list);
	}
	
	@SuppressWarnings({ "rawtypes", "unused" })
	public static Iterator ShowList2 (ArrayList list){
		int i;
		String s;
		ListIterator it = list.listIterator(list.size());
		while (it.hasPrevious()){
			s = (String) it.previous();
			System.out.print(" "+s);
		}
		return it;
	}

	@SuppressWarnings("rawtypes")
	public static void SearchElement (ArrayList list){
		String data, s;
		data = InAndOut.pedirDato("Introduce el patron a buscar: ");
		int i;
		System.out.println("Patron utilizado: "+data);
		for (i=0;i<list.size();i++){
			s=(String) list.get(i);
			 while (s.indexOf(data)>-1){
			     s=s.substring(s.indexOf(data)+data.length());
			     System.out.println("Palabra encontrada "+list.get(i)+" En el lugar "+i);
			 }
		}
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void ReplaceElement (ArrayList list){
		int i;
		String data, replace;
		data = InAndOut.pedirDato("Escribe la cadena que quiere reemplazar: ");
		replace = InAndOut.pedirDato("Introduce la cadena por la que quieres reemplazar");
		
		for (i=0;i<list.size();i++){
			String s=(String) list.get(i);
			if (s.matches(data)){
				list.set(i, replace);
				System.out.println("Se han reemplazado "+i+" Elementos");
			}
			else {System.out.println("No se han encontrado elementos.");}
		}
		
	}
}
