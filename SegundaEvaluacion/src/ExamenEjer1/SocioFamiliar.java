package ExamenEjer1;
import static ExamenEjer1.Constantes.*;

public class SocioFamiliar extends Socio {
	private byte numFamiliares;

	SocioFamiliar(String nombre, String nif, byte numActividades,
			byte numFamiliares) throws IllegalArgumentException {
		super(nombre, nif, numActividades);
		setnumFamiliares(numFamiliares);
	}
	public void setnumFamiliares(byte numFamiliares){
		if(numFamiliares<1)
			throw new IllegalArgumentException();
		else
			this.numFamiliares = numFamiliares;
	}
	public String toString() {
		return super.toString() + ", numFamiliares=" + numFamiliares;
	}
	public float calcularCuotaBasica() {
		return CUOTA_BASICA;
	}
	public float calcularCuotaActividades() {
		return (float) (numActividades * (CUOTA_ACTIVIDAD * (1 - DESCUENTO_FAMILIAR * numFamiliares)));
	}
}
