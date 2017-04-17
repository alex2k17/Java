package EjerFecha1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversorFechas {

	
	
	public static String NormalToAmericano(Date fecha){
		
		SimpleDateFormat formato = new SimpleDateFormat("MM-dd-yyyy");
		
		return formato.format(fecha);
		
	}
	
	public static String AmericanoToNormal(Date fecha){
		
		SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
		
		return formato.format(fecha);
	}
	
	
}
