package OrientacionObjetos;

import javax.swing.JOptionPane;

public class AplicacionAli {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Alimentos ali;
		
		String descrip;
		String nombre;
		
		int contenlipidos;
		int contenproteinas;
		int contenhidratos;
		
		String animal;
		String vitaminas;
		String minerales;
		

		
		int salir;
		
		try {
			do {
				do {
					descrip=JOptionPane.showInputDialog("Introduce la descripcion del alimento: ").trim();
				} while (descrip.isEmpty());
				
				do {
					nombre=JOptionPane.showInputDialog("Introduce el nombre del alimento: ").trim();
				} while (nombre.isEmpty());
				
				do {
					contenlipidos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el contenido que tiene en lipidos: "));
				} while (contenlipidos < 0);
			
				do {
					contenproteinas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el contenido que tiene de proteinas: "));
				} while (contenproteinas < 0);
				
				do {
					contenhidratos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el contenido que tiene de hidratos: "));
				} while (contenhidratos < 0);
				do {
					animal=JOptionPane.showInputDialog("¿Es de origen animal?").trim();
				} while (animal.isEmpty());
				do {
					JOptionPane.showMessageDialog(null,"Introduce B de bajo, M de medio o A de alto");
					vitaminas=JOptionPane.showInputDialog("Contenido de vitaminas: ").trim();
				} while (vitaminas.isEmpty());
			
				do {
					JOptionPane.showMessageDialog(null,"Introduce B de bajo, M de medio o A de alto");
					minerales=JOptionPane.showInputDialog("Contenido de minerales: ").trim();
				} while (minerales.isEmpty());
			
		
				ali = new Alimentos(descrip, nombre, contenlipidos, contenproteinas, contenhidratos, animal, vitaminas, minerales);
				
				System.out.printf("El alimento %s origen animal.\n", (ali.esAnimal()) ? "es" : "no es");
				System.out.printf("El alimento %s diatetico.\n", (ali.esDietetico(contenlipidos, vitaminas)) ? "es" : "no es");
				System.out.printf("El alimento %s para deportistas.\n", (ali.esRecomendableParaDeportistas(contenlipidos, contenproteinas, contenhidratos)) ? "es recomendado" : "no es recomendando");
				System.out.println();
				System.out.println(ali.toString());
				
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
