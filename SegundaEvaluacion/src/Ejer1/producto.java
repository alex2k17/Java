package Ejer1;

public class producto implements Cloneable{
	
	protected String marca;
	protected String modelo;
	protected int stock;
	
	producto () {
		marca="Sin marca";
		modelo="Sin modelo";
		stock=0;
	}
	
	producto (String marca, String modelo, int stock) {
		this.marca = marca;
		this.modelo = modelo;
		this.stock = stock;
	}
	
	public boolean equals (Object o) {
		return ((o != null) && (o instanceof producto) && (((producto)o).marca == marca)
				 && (((producto)o).modelo == modelo) && (((producto)o).stock == stock));	
	}
	
	/*   -- código alternativo --
	 * 
	public boolean equals (Object o) {
		boolean igualdad = false;
		
		if ((o != null) && (o instanceof producto)) {
			if (marca == ((producto)o).marca && modelo == ((producto)o).modelo && stock == ((producto)o).stock)
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
		return ("\nProducto: "+ getClass().getSimpleName() + "\nmarca: " + marca + 
						", modelo: " + modelo + ", stock: " + stock + " unidades");
	}
}
