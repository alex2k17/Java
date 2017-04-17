package EjerFecha2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Fecha {
	
	static Calendar fecha = Calendar.getInstance();
	
	
	public static Object ObtenerMes (){
		Meses month;
		int i=fecha.get(Calendar.MONTH);
		Meses mes[] = Meses.values(); 
		month=mes[i];
		return month;
	
	}
	
	public static Object ObtenerDia(){
		Dia day;
		int i=fecha.get(Calendar.DAY_OF_WEEK);
		Dia dia[]=Dia.values();
		day=dia[i-1];
		return day;
	}
	
    public static String getHoraActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("k:mm:ss");
        return formateador.format(ahora);
    }
	
	public static void MostrarFecha(){
		System.out.println("Hoy es: "+ObtenerDia().toString().toLowerCase()+" "+Calendar.DATE+"-"+ObtenerMes().toString().toLowerCase()+"-"+fecha.get(Calendar.YEAR)+" a las "+getHoraActual());
		
	}

      
}
