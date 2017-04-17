package OrientacionObjetos;

import javax.swing.JOptionPane;

public class AplicacionAlu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Alumno alu;
		
		String nombre;
		String matricula;
		
		double nota1;
		double nota2;
		
		int salir;
		
		try {
			do {
				do {
					nombre = JOptionPane.showInputDialog("Nombre del alumno: ").trim();

				} while (nombre.isEmpty());
				
				do {
					matricula = JOptionPane.showInputDialog("Matricula del alumno: ").trim();
				} while (matricula.isEmpty());
				
				do {
					nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 1º examen: "));
				} while (nota1 < 0);
			
				do {
					nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota del 2º examen: "));
				} while (nota2 < 0);
			
				alu = new Alumno (nombre, matricula, nota1, nota2);
			
				System.out.println(alu.toString());
				
				salir=JOptionPane.showConfirmDialog(null, "¿Desea salir?");
				if (salir==2){
					throw new NullPointerException();
				}
			}while (salir==1);		

		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null,"Ha cancelado nuestra aplicacion. Gracias por utilizar nuestra aplicacion Alumnos!");
		}
		
	}

}
