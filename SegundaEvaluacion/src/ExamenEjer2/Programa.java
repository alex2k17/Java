package ExamenEjer2;

public class Programa {
	final static byte TAM=10;
	public static void main(String[] args){
		Object miArray[]=new Object[TAM];
		Object miArrayCopia[]=new Object[TAM];
		PuedeReproducirse miArrayInterfaz[]=new PuedeReproducirse[TAM];
		Object miArrayClonados[]=new Object[TAM];		
		
		miArray=apartado1();
		apartado2(miArray);
		apartado3(miArray);
		apartado4(miArray);
		miArrayInterfaz=copiarArrayInterfaz(miArray);//Copio los objetos al array de interfaz para pasarlo por parámetro al método apartado5
		miArrayCopia=copiarArray(miArray); //Para la comprobación del apartado 5, hago una copia de los objetos antes de comer/regar.
		miArrayClonados=apartado5(miArrayInterfaz);
		/* Para demostrar que el método apartado5 ha funcionado bien, hay que comprobar que los insectos
		 *  han comido y que las plantas se han regado. Para ello utilizo miArrayCopia, que tiene los datos
		 *  de los objetos antes de comer/regar. Después, para comprobar que se han reproducido en el array 
		 *  que se retorna, después del método, los dos arrays(miArray y miArrayClonados) contienen lo mismo,
		 *  ya que los arrays se pasan por referencia */ 
		comprobarApartado5(miArrayCopia,miArray,miArrayClonados);
	}	
	public static Object[] apartado1(){
		Object miArray[]=new Object[TAM];
		System.out.println("-----------Apartado1-----------");
		miArray[0]=new Insecto("Negro",(byte)3,100f);
		System.out.println("Se creado el insecto número "+Insecto.getNumInsectos());
		miArray[1]=new Insecto("Rojo",(byte)5,120f);
		System.out.println("Se creado el insecto número "+Insecto.getNumInsectos());
		miArray[2]=new Planta(4f,true);
		System.out.println("Se creado la planta número "+Planta.getNumPlantas());
		miArray[3]=new Planta(3f,false);
		System.out.println("Se creado la planta número "+Planta.getNumPlantas());
		miArray[4]=new Insecto("Amarillo",(byte)4,200f);
		System.out.println("Se creado el insecto número "+Insecto.getNumInsectos());
		miArray[5]=new Insecto("Negro",(byte)3,100f);
		System.out.println("Se creado el insecto número "+Insecto.getNumInsectos());
		miArray[6]=new Insecto("Verde",(byte)2,70.4f);
		System.out.println("Se creado el insecto número "+Insecto.getNumInsectos());
		miArray[7]=new Planta(5.9f,true);
		System.out.println("Se creado la planta número "+Planta.getNumPlantas());
		miArray[8]=new Planta(3f,false);
		System.out.println("Se creado la planta número "+Planta.getNumPlantas());
		miArray[9]=new Insecto("Naranja",(byte)8,65.98f);
		System.out.println("Se creado el insecto número "+Insecto.getNumInsectos());
		return miArray;
	}
	public static void apartado2(Object[] miArray){
		System.out.println("-----------Apartado2-----------");
		/*Como está definido toString en las clases, al hacer el system.out.println del objeto,
		  está llamando al toString, entonces no hace falta poner miArray[i].toString,
		  con poner miArray[i] es suficiente */
		System.out.println("La planta "+miArray[3]+(miArray[3].equals(miArray[8])?" sí":" no")+" es igual a la planta "+miArray[8]);
		System.out.println("La planta "+miArray[2]+(miArray[2].equals(miArray[7])?" sí":" no")+" es igual a la planta "+miArray[7]);
		System.out.println("El insecto "+miArray[0]+(miArray[0].equals(miArray[5])?" sí":" no")+" es igual al insecto "+miArray[5]);
		System.out.println("El insecto "+miArray[6]+(miArray[6].equals(miArray[9])?" sí":" no")+" es igual al insecto "+miArray[9]);
		System.out.println("La planta "+miArray[2]+(miArray[2].equals(miArray[1])?" sí":" no")+" es igual al insecto "+miArray[1]);		
	}
	public static void apartado3(Object[] miArray){
		System.out.println("-----------Apartado3-----------");
		miArray[0]=((Insecto)miArray[9]).clone();
		System.out.println("El insecto "+miArray[0]+" es un clon del insecto "+miArray[9]);
		miArray[3]=((Planta)miArray[7]).clone();
		System.out.println("La planta "+miArray[3]+" es un clon de la planta "+miArray[7]);		
	}
	public static void apartado4(Object[] miArray){
		System.out.println("-----------Apartado4-----------");
		System.out.println("Hasta ahora se han creado "+Planta.getNumPlantas()+" plantas y "+Insecto.getNumInsectos()+" insectos");
	}
	public static PuedeReproducirse[] copiarArrayInterfaz(Object[] miArray){
		byte i;
		PuedeReproducirse miArrayInterfaz[]=new PuedeReproducirse[TAM];
		for(i=0;i<TAM;i++)
			miArrayInterfaz[i]=(PuedeReproducirse)miArray[i];
		return miArrayInterfaz;
	}
	public static Object[] copiarArray(Object[] miArray){
		byte i;
		Object miArrayCopia[]=new Object[TAM];
		for(i=0;i<TAM;i++){
			if(miArray[i] instanceof Insecto)
				miArrayCopia[i]=((Insecto)miArray[i]).clone();
			else if(miArray[i] instanceof Planta)
				miArrayCopia[i]=((Planta)miArray[i]).clone();
		}			
		return miArrayCopia;
	}
	public static Object[] apartado5(PuedeReproducirse[] miArrayInterfaz){
		byte i;
		Object miArrayClonados[]=new Object[TAM];
		for(i=0;i<TAM;i++){
			if(miArrayInterfaz[i] instanceof PuedeComer)
				((PuedeComer)miArrayInterfaz[i]).comer(i);
			else if(miArrayInterfaz[i] instanceof Vegetal)
				((Vegetal)miArrayInterfaz[i]).regar(i);
			miArrayClonados[i]=miArrayInterfaz[i].Reproducirse();
		}
		return miArrayClonados;
	}
	public static void comprobarApartado5(Object[] miArrayCopia,Object[] miArray,Object[] miArrayClonados){
		byte i;
		System.out.println("-----------Apartado5-----------");
		for(i=0;i<TAM;i++){
			System.out.println("Objeto de la posición "+i+" : ");
			System.out.println("Array original: "+miArrayCopia[i]);
			System.out.println("Después de comer/regar: "+miArray[i]);
			System.out.println("Ser reproducido: "+miArrayClonados[i]);
		}
	}
}
