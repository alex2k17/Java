package Examen2;


public class Peluches extends Juguetes {
	protected String hablan;
	protected PelucheEnum tam;
	
	Peluches(String nombre, String color, PelucheEnum tam) {
		super(nombre, color);
		this.hablan=hablan();
		this.tam=tam;
	}
	
	public String hablan(){
		String hablan;
		String resul = null;
		boolean salir=true;
		do{
			hablan=InAndOut.pedirDato("El peluche "+nombre+" puede hablar?:\n" +
									"1. Si\n" +
									"2. No");
			if (hablan.equalsIgnoreCase("si") || hablan.equalsIgnoreCase("1")){
				resul="Si";
				salir=true;
			}
			else if (hablan.equalsIgnoreCase("no") || hablan.equalsIgnoreCase("2")){
				resul="No";
				salir=true;
			}
			else {
				System.out.println("Especifica bien.");
			}
		}while(!salir);
		
	return resul;
}
	

	public String toString() {
		return "Peluches [hablan=" + hablan + ", tam=" + tam + ", color="
				+ color + ", nombre=" + nombre + ", Precio="
				+ calcularValor() + "]";
	}

	public int calcularValor() {
		return tam.getPrecio();
	}

}
