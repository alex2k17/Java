package OrientacionObjetos;

public class Alimentos {

	private String descrip;
	private String nombre;
	
	private int contenlipidos;
	private int contenhidratos;
	private int contenproteinas;
	
	private String animal;
	
	private String vitaminas;
	private String minerales;
	
	public Alimentos (String descrip, String nombre){
		this.descrip=descrip;
		this.nombre=nombre;
	}
	
	public Alimentos (String descrip, String nombre, int contenlipidos, int contenhidratos, int contenproteinas, String animal, String vitaminas, String minerales){
		this(descrip, nombre);
		this.contenlipidos=contenlipidos;
		this.contenhidratos=contenhidratos;
		this.contenproteinas=contenproteinas;
		this.animal=animal;
		this.vitaminas=vitaminas;
		this.minerales=minerales;
	}
	
	public boolean esDietetico (int contenlipidos, String vitaminas){
		return (contenlipidos < 0 && !vitaminas.equalsIgnoreCase("b")) ? true: false;
	
	}
	
	
	public String calculaContenidoEnergetico (){
		return ("Contenido energetico del alimento: \n" +
				"- Lipidos: "+contenlipidos*9.4+" Kcal\n" +
				"- Proteinas: "+contenproteinas*5.3+" Kcal\n" +
				"- Hidratos: "+contenhidratos*4.1+" Kcal\n");
	}
	
	public boolean esRecomendableParaDeportistas (int contenlipidos, int contenproteinas, int contenhidratos){
		return (contenlipidos > 30 && contenlipidos <35 && contenproteinas >10 && contenproteinas < 15 && contenhidratos >55 && contenhidratos <65) ? true : false;
	}
	
	public boolean esAnimal (){
		return animal.equalsIgnoreCase("si");
	}
	
	
	public String toString(){
		return String.format(
				"- Descripcion: %s\n"+
				"- Nombre: %s\n"+
				"- Contenido Lipidos: %s\n"+
				"- Contenido Proteinas: %s\n"+
				"- Contenido Hidratos: %s\n"+
				"- Vitaminas: %s\n"+
				"- Minerales: %s\n"+
				"%s",
				descrip, nombre, contenlipidos, contenproteinas, contenhidratos, vitaminas, minerales,
				(calculaContenidoEnergetico()));
	}
}
