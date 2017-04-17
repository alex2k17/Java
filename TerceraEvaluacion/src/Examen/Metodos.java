package Examen;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Metodos {
	static int perroscont;
	static int gatoscont;
	static int avescont;
	static int perros;
	static int gatos;
	static int aves;
	
	@SuppressWarnings("rawtypes")
	public static HashMap NewMap(){
		HashMap<String,Animales> Mapa=new HashMap<String,Animales>();
		System.out.println("Nuevo mapa creado.");
		return Mapa;
	}
	
	public static void AddAnimal(HashMap<String,Animales> Mapa){
		String nombre;
		String cuota;
		double cuotamensual;
		Date fecha;
		String clave;
		try{
			clave=GeneraCodigo();
			nombre=InAndOut.pedirDato("Introduce el nombre: ");
			cuota=InAndOut.pedirDato("Introduce la cuota: ");
			cuotamensual=Double.parseDouble(cuota);
			fecha=Fechas();
			Animales animal=new Animales(nombre, cuotamensual, fecha);
			Mapa.put(clave, animal);
			System.out.println("Se ha añadido correctamente.");
		}catch(NullPointerException e){
			
		}
	}
	
	public static void DelAnimal (HashMap<String,Animales> Mapa){
		String data;
			if (Mapa.isEmpty()){
				System.out.println("El Mapa esta vacio.");
			}
			else{
				String clave=InAndOut.pedirDato("Indica la clave del animal que desea eliminar: ");
				if (Mapa.remove(clave)==null){
					System.out.println("La clave no existe");
				}
				else{
					System.out.println("Se ha eliminado correctamente");

					switch(data=clave.substring(0,1)){
						case "P":
							perroscont--;
							break;
						case "G":
							gatoscont--;
							break;
						case "A":
							avescont--;
							break;
					}
				}
				
			}

	}
	
	public static void ShowAnimals (){
		System.out.println("Numero de perros: "+perroscont);
		System.out.println("Numero de gatos: "+gatoscont);
		System.out.println("Numero de aves: "+avescont);
	}
	
	public static void AdelanteMapa (HashMap<String, Animales> Mapa){
		System.out.println(Mapa);
	}
	
	public static void AtrasMapa (HashMap<String,Animales> Mapa){

	}
	
	public static AnimalesEnum TipoAnimal(){
		int clase;
		AnimalesEnum tipo = null;
		
		try{
			clase=InAndOut.pedirNumero("Introduce el tipo de animal:\n 1.Perro\n 2.Gato\n 3.Ave");
			switch (clase){
				case 1:
					tipo=AnimalesEnum.PERRO;
					break;
				case 2:
					tipo=AnimalesEnum.GATO;
					break;
				case 3:
					tipo=AnimalesEnum.AVE;
					break;
			}
			
		}catch(NullPointerException e){
			
		}
		return tipo;
		
	}
	
	public static Date Fechas(){
		String fecha = null;
		Date fechas = null;

		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");

		try{
			try{
				fecha=InAndOut.pedirDato("Introduce la fecha de nacimiento. Formato: dd/mm/yyyy");
				fechas = formatoFecha.parse(fecha);
			}catch(NullPointerException e){
				
			}
			
		}catch(ParseException ex){
			System.out.println("Fecha Incorrecta.");
		}
		return fechas;

			
	}
	
	public static String GeneraCodigo(){
		AnimalesEnum Tipo;
		String clave = null;
		String perro="P", gato="G", ave="A";
		Tipo=TipoAnimal();
		
		if (Tipo==AnimalesEnum.PERRO){
			perroscont++;
			perros++;
			perro+=String.valueOf(perros);
			clave=perro;
		}
		else if (Tipo==AnimalesEnum.GATO){
			gatoscont++;
			gatos++;
			gato+=String.valueOf(gatos);
			clave=gato;
		}
		
		else if (Tipo==AnimalesEnum.AVE){
			avescont++;
			aves++;
			ave+=String.valueOf(aves);
			clave=ave;
		}
		
		return clave;
	}
	
}
