package Ejer1;


public class movil extends dispositivo {
	
	protected boolean generacion;
	
	movil(){
		super();
		generacion = false;
	}
	
	movil( String marca, String modelo, int stock, int memoryStick, boolean generacion) {
		super( marca, modelo, stock, memoryStick);
		this.generacion = generacion;
	}
	
	public boolean isGeneracion() {
		return generacion;
	}

	public void setGeneracion(boolean generacion) {
		this.generacion = generacion;
	}
	
	public boolean equals (Object o) {
		boolean igualdad = false;
		
		if ((o != null) && (o instanceof movil)) {
			if (super.equals((movil)o) && generacion == ((movil)o).generacion )
				igualdad = true;
		}
		return igualdad;	
	}
	
/*	 -- código alternativo --
 * 
	public boolean equals (Object o) {	
		return ((o != null) && (o instanceof movil) && (super.equals((movil)o)
				&& generacion == ((movil)o).generacion ) );
	}
	
	*/
	
	public String toString() {
		return (super.toString() + ", generación del móvil: "+ (isGeneracion()? "4G" : "3G") );
	}
}
