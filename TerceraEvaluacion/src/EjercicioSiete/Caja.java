package EjercicioSiete;

public class Caja <G>{
	
	G contenido;
	
	public Caja(){
		
	}
	
	public Caja(G contenido){
		this.contenido = contenido;
	}

	public G getContenido() {
		return contenido;
	}

	public void setContenido(G contenido) {
		this.contenido = contenido;
	}
	
}
