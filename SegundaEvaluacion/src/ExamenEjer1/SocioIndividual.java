package ExamenEjer1;
import static ExamenEjer1.Constantes.*;

public class SocioIndividual extends Socio {

	SocioIndividual(String nombre, String nif, byte numActividades) {
		super(nombre, nif, numActividades);
	}

	public float calcularCuotaBasica() {
		if (numActividades > ACTIVIDADES_INDIVIDUAL)
			return CUOTA_BASICA * (1-DESCUENTO_INDIVIDUAL);
		else
			return CUOTA_BASICA;
	}

	public float calcularCuotaActividades() {
		return numActividades * CUOTA_ACTIVIDAD;
	}
}
