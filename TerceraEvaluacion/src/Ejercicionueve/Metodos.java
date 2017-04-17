package Ejercicionueve;

import java.util.HashSet;
import java.util.LinkedList;

import EjercicioCinco.InAndOut;

public class Metodos {
	
	@SuppressWarnings("rawtypes")
	public static HashSet NewLista(){
		HashSet<Personas> lista=new HashSet<Personas>();
		System.out.println("Nueva lista creada.");
		return lista;
	}
	
	@SuppressWarnings("unchecked")
	public static void AddElement (HashSet<Personas> lista){
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
	public static void DelElement (HashSet<Personas> lista){
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
	public static void ShowList (HashSet<Personas> lista){
		for (Personas Persona : lista) {
			System.out.println(Persona);
		}
	}

}
