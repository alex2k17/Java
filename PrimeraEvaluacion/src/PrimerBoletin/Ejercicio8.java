package PrimerBoletin;

import javax.swing.JOptionPane;

public class Ejercicio8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nota = 0, i, total = 0;
		
		for (i=1;i<=10;i++){
			
		nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce la nota del "+i+" Alumno"));
		total+=nota;	
		}
		 nota=total/10;
		
		if (nota<0){
			System.out.println("Has introducido un valor negativo.");
		}
			if (nota==0){
			System.out.println("Deficiente: "+nota);
		}
		else if (nota<=4){
			System.out.println("Insuficiente: "+nota);
		}
		else if (nota>=5 && nota<=6){
			System.out.println("Aprobado: "+nota);
		}
		else if (nota>=7 && nota<=9){
			System.out.println("Notable: "+nota);	
		}
		else if (nota==10){
			System.out.println("Sobresaliente: "+nota);
		}
		else {System.out.println("ERROR");}
	}

}
