package Ejer3;

public class Rectangulo extends FiguraGeometrica {
	
	public Rectangulo (int x, int y, int area){
		super(x, y, area);
	}
	
	public int calcular_area(){
		area=x*y;
		return area;
	}

}
