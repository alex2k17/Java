package Ejer1;


public class portatil extends ordenador {
	
	protected float peso;
	
	portatil (){
		super();
		peso = 0;
	}
	
	portatil( String marca, String modelo, int stock, float velocidad, int HDDcapacidad, float peso) {
		super( marca, modelo, stock, velocidad, HDDcapacidad);
		this.peso = peso;
	}
	
	public boolean equals (Object o) {
		boolean igualdad = false;
		
		if ((o != null) && (o instanceof portatil)) {
			if (super.equals((portatil)o) && peso == ((portatil)o).peso )
				igualdad = true;
		}
		return igualdad;	
	}
	
	/*	 -- código alternativo --
	 * 
		public boolean equals (Object o) {	
			return ((o != null) && (o instanceof portatil) && (super.equals((portatil)o)
						&& peso == ((portatil)o).peso) );
		}
		
		*/
	
	public String toString() {
		return (super.toString() + ", peso: "+ peso+" Kg.");
	}
}
