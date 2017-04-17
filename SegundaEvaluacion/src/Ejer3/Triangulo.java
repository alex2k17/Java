package Ejer3;

public class Triangulo extends FiguraGeometrica {

	public Triangulo (int x, int y, int area){
		super(x, y, area);
	}
	
	public int calcular_area(){
		area=(x*y)/2;
		return area;
	}
	
}
