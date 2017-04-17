package Ejer1;


public class test {

	
	public static void main(String[] args) {
		
		dispositivo dispositivo = new dispositivo("Zeus", "Olimpus 4", 10, 4);
		sobreMesa sobremesa = new sobreMesa("Intel", "Pentium IV", 1, 3.2f, 320, "BenQ", "1024x768");
		sobreMesa sobremesa2 = new sobreMesa("Intel", "Pentium IV", 1, 3.2f, 320, "BenQ", "1024x768");
		
		System.out.println("¿Son iguales los objetos sobremesa y sobremesa2 ? " + 
							(sobremesa.equals(sobremesa2)?"si" : "no") );
		
		sobreMesa sobremesa3 = (sobreMesa)sobremesa.clone();
	
		System.out.println("¿Y son iguales los objetos sobremesa y sobremesa3 ? " + 
							(sobremesa.equals(sobremesa3)?"si" : "no") );
		
		dispositivo dispositivo2 = (dispositivo)dispositivo.clone();
		
		System.out.println("¿Son iguales los objetos dispositivo y dispositivo2 ? " + 
				(dispositivo.equals(dispositivo2)?"si" : "no") );

	}
}
