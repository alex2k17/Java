package OrientacionObjetos;


public class DVD {
	private String nombre;
	private String nombreOriginal;
	private String director;
	private String integrantes;
	private String genero;
	private String resumen;
	
	private int duracion;
	
	public DVD(String nombre, String nombreOriginal, String director, String integrantes, String genero, int duracion) {
		this.nombre = nombre;
		this.nombreOriginal = nombreOriginal;
		this.director = director;
		this.integrantes = integrantes;
		this.genero = genero;
		this.duracion = duracion;
	}
	
	public DVD(String nombre, String nombreOriginal, String director, String integrantes, String genero, int duracion, String resumen) {
		this(nombre, nombreOriginal, director, integrantes, genero, duracion);
		
		this.resumen = resumen;
	}
	
	public String mostrarDuracion() {
		return String.format("%s min", duracion);
	}
	
	public boolean hasResumen() {
		return (resumen != null && !resumen.isEmpty()) ? true : false;
	}
	
	public boolean isThriller() {
		return genero.equalsIgnoreCase("thriller");
	}
	
	public String toString() {
		return String.format(
				"- Nombre: %s (%s en V.O.)\n" +
				"- Dirigida por %s.\n" +
				"- Protagonizada por %s.\n" +
				"- %s - %s\n" +
				"%s",
				nombre, nombreOriginal, director, integrantes, genero, mostrarDuracion(), (hasResumen()) ? String.format("- Resumen:\n%s.", resumen) : "");
	}
}