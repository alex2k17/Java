package EjercicioCinco;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Menu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedList<Byte> Cola = new LinkedList<Byte>();
		boolean salir=false;
		
		try{
			do{
				switch(Menu()){
				 case 1:
					 Cola=Metodos.NewCola();
					 break;
				 case 2:
					 Metodos.SeeCola(Cola);
					 break;
				 case 3:
					 Metodos.AddElement(Cola);
					 break;
				 case 4:
					 Metodos.DelElement(Cola);
					 break;
				 case 5:
					 Metodos.ShowCola(Cola);
					 break;
				 case 6:
					 salir=true;
					 System.out.println("Adiós");
				}
			}while (!salir);
		}catch (NullPointerException e){
			System.out.println("Ha abandonado el programa");
		}
	}
	
	public static byte Menu (){
		byte opc;
		Object opcion = JOptionPane.showInputDialog(
				null,"Seleccione una opcion","MENU",JOptionPane.QUESTION_MESSAGE,
				null,  // null para icono defecto
				new Object[] { "1. Nueva Cola", "2. Consultar elemento", "3. Añadir elemento", "4. Elimar elemento",
								"5. Consultar toda la cola", "6. Salir" }, "1. Nueva Cola");
			return opc = Byte.parseByte(((String)opcion).substring(0, 1));
	}

}
