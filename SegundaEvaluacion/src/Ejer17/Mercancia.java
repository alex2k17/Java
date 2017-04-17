package Ejer17;
/*
 * Todas las interfaces son abstractas y sus m�todos tambi�n son todos abstractos y p�blicos (no hace falta poner el modificador abstract, se toma de manera impl�cita). 
 * Las variables se tienen obligatoriamente que inicializar. 
 * Los m�todos son simples prototipos y toda variable se considera una constante est�tica (a no ser que se redefina en una clase que implemente esta interfaz, lo cual no tendr�a mucho sentido).
 */
public interface Mercancia {
	
	public double damePrecio();     
	public String dameDescripcion();
}