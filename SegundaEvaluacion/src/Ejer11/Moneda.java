package Ejer11;

public class Moneda extends sorteo {

	
	public void lanzar(){
		posibilidades=(int) (Math.random()*2+1);
		if (posibilidades==1)
			System.out.println("Cara");
		else System.out.println("Cruz");
		
		
	}
	
}
