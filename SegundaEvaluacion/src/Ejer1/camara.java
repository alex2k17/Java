package Ejer1;


public class camara extends dispositivo {
	
	protected boolean tecnologia;
	protected boolean gama;
	
	camara(){
		super();
		tecnologia = false;
		gama = false;
	}
	
	camara( String marca, String modelo, int stock, int memoryStick, boolean tecnologia, boolean gama) {
		super( marca, modelo, stock, memoryStick);
		this.tecnologia = tecnologia;
		this.gama = gama;
	}

	public boolean isTecnologia() {
		return tecnologia;
	}

	public void setTecnologia(boolean tecnologia) {
		this.tecnologia = tecnologia;
	}

	public boolean isGama() {
		return gama;
	}

	public void setGama(boolean gama) {
		this.gama = gama;
	}
	
	public boolean equals (Object o) {
		boolean igualdad = false;
		
		if ((o != null) && (o instanceof camara)) {
			if (super.equals((camara)o) && tecnologia == ((camara)o).tecnologia
											&& gama == ((camara)o).gama )
				igualdad = true;
		}
		return igualdad;	
	}
	
	/*	 -- código alternativo --
	 * 
		public boolean equals (Object o) {	
			return ((o != null) && (o instanceof camara) && (super.equals((camara)o)
					&& tecnologia == ((camara)o).tecnologia && gama == ((camara)o).gama ) );
		}
		
		*/

	public String toString() {
		return (super.toString() + ", tecnología: " + (isTecnologia()? "digital" : "analógica") +
							", gama: " + (isGama()? "reflex" : "compacta") );
	}
}
