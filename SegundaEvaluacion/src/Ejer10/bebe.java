package Ejer10;

	public class bebe {
		static void pedir(){
			System.out.println(str1 + " , " + str2 + " , " + str3);
		}
		static {
			str2 = "mama pipi";
			str3 = "mama agua";
		}
		bebe() {System.out.println("Nacimiento del bebe"); }
		static String str2,str3,str1 = "papa tengo caca";
		
		
		public static void main(String[] args) {
			System.out.println("El bebe se ha despertado y va a pedir cosas");
			System.out.println("El bebe dice: " + bebe.str1);
			bebe.pedir();
		}
		static bebe bebe1 = new bebe();
		static bebe bebe2 = new bebe();
		static bebe bebe3 = new bebe();
	}