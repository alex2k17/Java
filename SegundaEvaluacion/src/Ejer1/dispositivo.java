package Ejer1;


public class dispositivo extends producto {
	
	protected int memoryStick;
	
	dispositivo(){
		super();
		memoryStick = 0;
	}
	
	dispositivo( String marca, String modelo, int stock, int memoryStick) {
		super( marca, modelo, stock);
		this.memoryStick = memoryStick;
	}
	
	public boolean equals (Object o) {
		boolean igualdad = false;
		
		if ((o != null) && (o instanceof dispositivo)) {
			if (super.equals((dispositivo)o) && memoryStick == ((dispositivo)o).memoryStick )
				igualdad = true;
		}
		return igualdad;	
	}
	
	/*	 -- código alternativo --
	 * 
		public boolean equals (Object o) {	
			return ((o != null) && (o instanceof producto) && (super.equals((producto)o)
					&& memoryStick == ((producto)o).memoryStick) );
		}
		
		*/
	
	public String toString() {
		return (super.toString() + ", tarjeta de memoria: " + memoryStick);
	}
}
