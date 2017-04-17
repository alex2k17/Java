package OrientacionObjetos;

import javax.swing.JOptionPane;

public class Persona{
	
	String nombre;
	int edad;
	float altura;
	String ocupacion;
	double sueldo;
	
 	String getNombre(){
 		return nombre;
 	}
 	void setNombre(String nom){
 		nombre=nom;
 	}
 	int getEdad(){
 		return edad;
 	}
 	void setEdad (int eda){
 		edad=eda;
 	}
 	float getAltura(){
 		return altura;
 	}
 	void setAltura (float altu){
 		altura=altu;
 	}
 	String getOcupacion(){
 		return ocupacion;
 	}
 	void setOcupacion(String ocu){
 		ocupacion=ocu;
 	}
 	double getsueldo (){
 		return sueldo;
 	}
 	void setsueldo (double suel){
 		sueldo=suel;
 	}
 	
 	public double sumar_sueldo (Persona a){
		return sueldo+=a.getsueldo();
 	}
 	
 	public void doblar_sueldo (){	
 		sumar_sueldo(this);
 	}
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String elnombre;
		int edad;
		float altura;
		String ocupacion;
		
		elnombre=JOptionPane.showInputDialog ("Introduce el nombre");
		edad=Integer.parseInt(JOptionPane.showInputDialog ("Introduce la edad"));
		altura=Float.parseFloat(JOptionPane.showInputDialog ("Introduce la altura"));
		ocupacion=JOptionPane.showInputDialog ("Introduce la ocupacion");
		
		Persona ejercicio1 = new Persona();
		
		ejercicio1.setNombre(elnombre);
		ejercicio1.setEdad(edad);
		ejercicio1.setAltura(altura);
		ejercicio1.setOcupacion(ocupacion);
		
		System.out.println(ejercicio1.getNombre());
		System.out.println(ejercicio1.getEdad());
		System.out.println(ejercicio1.getAltura());
		System.out.println(ejercicio1.getOcupacion());
		
	}
}
