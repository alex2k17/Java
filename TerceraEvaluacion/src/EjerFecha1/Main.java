package EjerFecha1;

import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date fecha = new Date();
		
		System.out.println(ConversorFechas.AmericanoToNormal(fecha));
		System.out.println(ConversorFechas.NormalToAmericano(fecha));
		
		
		
		
	}

}
