package Ejer1;


public class sobreMesa extends ordenador {

	protected monitor monitor;
	
	sobreMesa(){
		super();
		monitor = new monitor();
	}
	
	sobreMesa( String marca, String modelo, int stock, float velocidad, int HDDcapacidad,
					String marca_monitor, String modelo_monitor) {
		super( marca, modelo, stock, velocidad, HDDcapacidad);
		monitor = new monitor(marca_monitor, modelo_monitor);
	}
	
		public boolean equals (Object o) {
			boolean igualdad = false;
			
			if ((o != null) && (o instanceof sobreMesa)) {
				if (super.equals((sobreMesa)o) && monitor.equals(((sobreMesa)o).monitor ) )
					igualdad = true;
			}
			return igualdad;	
		}
		
		public Object clone(){
			sobreMesa miPC=(sobreMesa) super.clone();
			miPC.monitor=(monitor) monitor.clone();
			return miPC;
			}
		
		public String toString() {
			return (super.toString() + monitor);
		}
		

	class monitor implements Cloneable {
		
		private String marca;
		private String resolucion;
		
		monitor () {
			marca = "Sin marca";
			resolucion = "Sin resolución";
		}
		
		monitor( String marca, String resolucion) {
			this.marca = marca;
			this.resolucion = resolucion;
		}
		
		public boolean equals (Object o) {
			return ((o != null) && (o instanceof monitor) && marca == ((monitor)o).marca 
					&& (resolucion == ((monitor)o).resolucion) );
		}
		
		/*   -- código alternativo --
		 * 
		public boolean equals (Object o) {
			boolean igualdad = false;
			
			if ((o != null) && (o instanceof monitor)) {
				if (marca == ((monitor)o).marca && resolucion == ((monitor)o).resolucion )
					igualdad = true;
			}
			return igualdad;	
		}
		*/
		
		public Object clone(){ 
			try{
				return (super.clone());
			}catch(CloneNotSupportedException cnse){
				return null;
			}
		}
		
		public String toString() {
			return ("\n\nProducto: monitor\nmarca: " + marca + ", resolución: " + resolucion + "\n");
		}
	}
}
