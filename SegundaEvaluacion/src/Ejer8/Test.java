package Ejer8;

	public class Test {
		
		public static int dato=0;
		public static int datostatico=0;
		public static void metodo() {
			datostatico++;
		}
		
		public static void metodostatico(){
			datostatico++;
			datostatico++;
		}
		
		public static void main(String [] args){
			dato++;
			datostatico++;
			metodostatico();
			metodo();
	
		}
	}