package ExamenEjer1;
import static ExamenEjer1.Constantes.*;

public abstract class Socio {
	protected String nombre;
	protected String nif;
	protected byte numActividades = 0;
	
	Socio() {
		this.nombre = "Sin nombre";
		this.nif = "Sin nif";
		this.numActividades = 0;
	}

	Socio(String nombre, String nif, byte numActividades)
			throws IllegalArgumentException {
		this.nombre = nombre;
		this.numActividades = numActividades;
		setNif(nif);
	}

	public void setNif(String nif) {
		char letra;
		nif = nif.toUpperCase(); //Lo paso a mayúsculas por si la letra viene en minúscula
		if (nif.matches("\\d{8}\\w")) {
			letra = CADENA_NIF.charAt(Integer.parseInt(nif.substring(0, TAM))% DIV);
			if (letra != nif.charAt(TAM))
				throw new IllegalArgumentException();
		} else
			throw new IllegalArgumentException();
		this.nif=nif;
	}

	public String toString() {
		return this.getClass().getSimpleName()+" nombre=" + nombre + ",nif=" + nif + ", numActividades="+ numActividades;
	}

	public abstract float calcularCuotaBasica();

	public abstract float calcularCuotaActividades();

	final public float calcularCuotaMensual() {
		return calcularCuotaBasica() + calcularCuotaActividades();
	}
}
