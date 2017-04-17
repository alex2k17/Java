package EjercicioUno;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class MethodsClass {
	
	public static ArrayList NewList(){
		
		ArrayList lista = new ArrayList();
		System.out.println("Nueva lista creada.");
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public static void AddElement(ArrayList list){
		String data;
		
		try{
			data = InAndOut.pedirDato("Por favor, introduzca un nuevo elemento");
			list.add(data);
			System.out.println("Elemento añadido correctamente.");
		}catch(NullPointerException o){
		}
	}
	
	public static Iterator ShowNextElement(ArrayList list, Iterator it){
		if(it.hasNext()){
			String s=(String)it.next();
			System.out.println(s); 
			}
		return it;
	}
	
	public static void RemoveLast(ArrayList list, Iterator it){
		try{
			it.remove();
			System.out.println("El último elemento mostrado ha sido eliminado correctamente.");
		}catch(IllegalStateException o){
			System.out.println("Primero debe mostrar un elemento");
		}catch(NullPointerException o){
			System.out.println("Primero debe crear una nueva lista");
		}
	}
	
	public static void Remove(ArrayList list){
		String data;
		
		try{
			data = InAndOut.pedirDato("Por favor, introduzca el elemento a borrar");
			if(list.contains(data)){
				list.remove(data);
				System.out.println("Elemento eliminado correctamente.");
			}
			else
				System.out.println("El elemento introducido no está en la lista");
			}catch(NullPointerException o){
			}
	}
	
	public static void ShowList(ArrayList list){
		/*for(Object o:list){
			 System.out.println((String)o);
		}*/
		System.out.println(list);
	}

}
