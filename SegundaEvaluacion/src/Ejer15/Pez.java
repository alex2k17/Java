/**Clase pez
*@author Maria Jose Quilez
*@version 10/05/2012
*/
package Ejer15;

public class Pez implements Cloneable{
	
	/** nombre del pez*/
	public String nombre;
	static private int numpeces=0;
	
	/**Constructor de la clase pez que incrementa en 1 el numero de peces cada vez que se crea un objeto
	 * de dicha clase
	 */
	public Pez(){
		numpeces++;
	}
	
	/** Metodo que obtiene el nombre del pez
	 * @return el nombre del pez
	 */
	public String getNombre(){
		
		return this.nombre;
				
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
	
	/** Metodo que devuelve el numero total de peces creados
	 * @return numpeces numero de peces creados hasta el momento
	 */
	public static int NumPeces(){
		
		return numpeces;
	}
		
	
	
}
