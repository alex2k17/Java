package OrientacionObjetos;


import javax.swing.JOptionPane;

public class ApliDVD {
	public static void main(String[] args) {
		DVD dvd;
		
		String nombre = "";
		String nombreOriginal = "";
		String director = "";
		String integrantes = "";
		String genero = "";
		String resumen = "";
		
		int duracion = -1;
		
		try {
			do {
				nombre = JOptionPane.showInputDialog("Nombre");
			} while (nombre.isEmpty());
			
			do {
				nombreOriginal = JOptionPane.showInputDialog("Nombre Original");
			} while (nombreOriginal.isEmpty());
			
			do {
				director = JOptionPane.showInputDialog("Director");
			} while (director.isEmpty());
			
			do {
				integrantes = JOptionPane.showInputDialog("Integrantes");
			} while (integrantes.isEmpty());
			
			do {
				genero = JOptionPane.showInputDialog("Genero");
			} while (genero.isEmpty());
			
			do {
				duracion = Integer.parseInt(JOptionPane.showInputDialog("Duración"));
			} while (duracion < 0);
			
			resumen = JOptionPane.showInputDialog("Resumen").trim();
			
			if (resumen != null && !resumen.isEmpty()) {
				dvd = new DVD(nombre, nombreOriginal, director, integrantes, genero, duracion, resumen);
			} else {
				dvd = new DVD(nombre, nombreOriginal, director, integrantes, genero, duracion);
			}
			
			System.out.printf("La pelicula tiene una duracion de %s.\n", dvd.mostrarDuracion());
			System.out.printf("La pelicula %s resumen.\n", (dvd.hasResumen()) ? "tiene" : "no tiene");
			System.out.printf("La pelicula %s un thriller.\n", (dvd.isThriller()) ? "es" : "no es");
			System.out.println();
			System.out.println("La ficha completa de la película se imprimirá a continuación.");
			System.out.println(dvd.toString());
		} catch (NullPointerException e) {
			System.out.println("Ha cancelado el programa. Gracias por utilizar nuestra aplicación DVDCine");
		}
	}
}