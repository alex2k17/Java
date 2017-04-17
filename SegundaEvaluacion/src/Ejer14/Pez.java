/**Clase pez
*@author Mar�a Jos� Qu�lez
*@version 10/05/2012
*/
package Ejer14;

public class Pez implements Cloneable{
	
	/** nombre del pez*/
	protected String nombre;
	
	/** Metodo que obtiene el nombre del pez
	 * @return el nombre del pez
	 */
	public String getNombre(){
		
		return nombre;
				
	}
	
	/** Metodo que le asigna un nombre al pez
	 * @param nombre nombre del pez
	 */
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	
	
	/**Metodo que clona un pez en otro pez
	 * @return devuelve un objeto de tipo pez */
	
	protected Object clone(){
		try {
			return (super.clone());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			return null;
		}			
	}
	
	/** Metodo que comprueba si dos objetos de la clase pez son iguales
	 * @param objeto parametro a comparar con el objeto 
	 * @return devuelve un valor logico indicando si los dos objetos son iguales (true) o distintos (false)
	 */
	
	public boolean equals (Object objeto){
		boolean resultado;
		if((objeto!=null)&&(objeto instanceof Pez))
			if((((Pez)objeto).nombre).equals(nombre))
				resultado=true;
			else
				resultado=false;
		else
			resultado=false;
		
		return resultado;			
	}
	
	
	
}
