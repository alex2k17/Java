package Ejer16;
/*
 * Todas las interfaces son abstractas y sus metodos tambien son todos abstractos y publicos (no hace falta poner el modificador abstract, se toma de manera implicita). 
 * Las variables se tienen obligatoriamente que inicializar. 
 * Los metodos son simples prototipos y toda variable se considera una constante estatica (a no ser que se redefina en una clase que implemente esta interfaz, lo cual no tendria mucho sentido).
 */
public interface Mercancia {
	
	
	public double damePrecio();     // Obliga a todas las subclases que implemente esta interface a implementar estos dos metodos
	public String dameDescripcion();
}