package Ejer1;


public class ordenador extends producto {
	
	protected float velocidad;
	protected int HDDcapacidad;
	
	ordenador(){	
		super();
		velocidad = 0;
		HDDcapacidad = 0;
	}
	
	ordenador( String marca, String modelo, int stock, float velocidad, int HDDcapacidad) {
		super( marca, modelo, stock);
		this.velocidad = velocidad;
		this.HDDcapacidad = HDDcapacidad;
	}
	
	public boolean equals (Object o) {
		boolean igualdad = false;
		
		if ((o != null) && (o instanceof ordenador)) {
			if (super.equals((ordenador)o) && velocidad == ((ordenador)o).velocidad
											&& HDDcapacidad == ((ordenador)o).HDDcapacidad );
				igualdad = true;
		}
		return igualdad;	
	}
	
	/*	 -- código alternativo --
	 * 
		public boolean equals (Object o) {	
			return ((o != null) && (o instanceof ordenador) && (super.equals((ordenador)o)
				&& velocidad == ((ordenador)o).velocidad && HDDcapacidad == ((ordenador)o).HDDcapacidad) );
		}
		
		*/
	
	public String toString() {
		return (super.toString() + ", velocidad: " + velocidad +
								" Ghz., capaciad del disco duro: " + HDDcapacidad + " GiB");
	}
}
