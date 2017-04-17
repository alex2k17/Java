package EjercicioDiez;

import java.util.LinkedHashSet;
import EjercicioCinco.InAndOut;

public class Metodos {
	
	@SuppressWarnings("rawtypes")
	public static LinkedHashSet NewLista(){
		LinkedHashSet<Personas> lista=new LinkedHashSet<Personas>();
		System.out.println("Nueva lista creada.");
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public static void AddElement (LinkedHashSet<Personas> lista){
		String nombre;
		int edad;
		try{
			nombre=InAndOut.pedirDato("Introduce el nombre: ");
			edad=InAndOut.pedirNumero("Introduce la edad: ");
			Personas Persona=new Personas(nombre, edad);
			lista.add(Persona);
			System.out.println("Persona añadida correctamente.");
		}catch (NullPointerException e){
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void DelElement (LinkedHashSet<Personas> lista){
		if (lista.isEmpty()){
			System.out.println("La lista esta vacia.");
		}
		else{
			String data=InAndOut.pedirDato("Indica la persona que quieres eliminar: ");
			lista.remove(data);
			System.out.println("Persona borrada correctamente.");
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void ShowList (LinkedHashSet<Personas> lista){
		for (Personas Persona : lista) {
			System.out.println(Persona);
		}
	}

}
