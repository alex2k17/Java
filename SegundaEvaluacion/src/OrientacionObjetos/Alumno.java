package OrientacionObjetos;

public class Alumno {
	
	private String nombre;
	private String matricula;
	
	private double nota1;
	private double nota2;
	
	
	
	public Alumno(String nombre, String matricula, double nota1, double nota2){
		this.nombre=nombre;
		this.matricula=matricula;
		this.nota1=nota1;
		this.nota2=nota2;
	}
	
	
	public void PonNota (double nota1, double nota2){
		
	}
	
	public double dameMedia (double nota1, double nota2){
		double dameMedia=0;
		dameMedia=nota1+nota2;
		return dameMedia/2;
	}
	
	public String toString (){
		return String.format(
				"- Nombre: %s\n"+
				"- Matricula: %s\n"+
				"- Media: %s",
				
				nombre, matricula, dameMedia(nota1, nota2));
	}

}
