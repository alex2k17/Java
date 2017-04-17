package OrientacionObjetos;

public class Vehiculo {
	private String modelo;
	private double potencia;
	private String traccion;



	public Vehiculo (String modelo, double potencia){
		this.modelo=modelo;
		this.potencia=potencia;
	
	}
	
	public Vehiculo (String modelo, double potencia, String traccion){
		this(modelo, potencia);
		this.traccion=traccion;
	}

	void setPontencia(double potencia){
		this.potencia=potencia;
	}
	
	double getPotencia(){
		return potencia;
	}

	void setTraccion(String traccion){
		this.traccion=traccion;
	}
	
	String getTraccion(){
		return traccion;
	}
	
	public boolean HaveTraccion() {
		return (traccion != null && !traccion.isEmpty()) ? true : false;
	}
	
	
	public String toString(){
		return String.format(
				"- Modelo: %s\n" +
				"- Potencia del vehiculo: %s\n" +
				"- Traccion del vehiculo: %s\n",
				modelo, getPotencia(), getTraccion());
	}

}