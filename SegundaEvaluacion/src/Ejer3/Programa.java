package Ejer3;

import javax.swing.JOptionPane;

public class Programa {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x;
		int y;
		int area;
		String opcion;
		int opc = 0;
		boolean opc_correcta = true;
		
		
		try{
			do{
				opc_correcta=true;
				opcion=JOptionPane.showInputDialog("MENU:\n1. Circulo\n2. Rectangulo\n3. Triangulo\n4. Salir\nIntroduce el numero para la opcion que deseas");
				if (opcion==null) throw new NullPointerException();
				try{
					opc = Integer.parseInt(opcion);
					if(opc<=0)
						opc_correcta=false;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null,	"Debe introducir un número entero positivo");
					opc_correcta=false;
				}
			}while(!opc_correcta);
			
			switch(opc){
				case 1:
					area=0;
					x=0;
					y=Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
					Circulo circu = new Circulo(x, y, area);
					System.out.println("Area: "+circu.calcular_area());
					break;
				case 2:
					area=0;
					x=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
					y=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
					Rectangulo recta = new Rectangulo(x, y, area);
					System.out.println("Area: "+recta.calcular_area());
					break;
				case 3:
					area=0;
					x=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base: "));
					y=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura: "));
					Triangulo trian = new Triangulo(x, y, area);
					System.out.println("Area: "+trian.calcular_area());
					System.out.println("Area: "+trian.calcular_area());
					break;
				case 4:
					System.out.println("Adiós.");
					break;
				default:
					JOptionPane.showMessageDialog(null,	"ERROR.");
					
			}
			
			}catch (NullPointerException e) {
				System.out.println("Ha cancelado el programa. Gracias por utilizar nuestra aplicacion FigurasGeometricas");
			}
		
	}

}
