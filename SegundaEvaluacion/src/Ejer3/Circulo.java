package Ejer3;

public class Circulo extends FiguraGeometrica {

	public Circulo (int x, int y, int area){
		super(x, y, area);
	}
	
	public int calcular_area(){
		y=y*y;
		area=(int) (3.1416*y);
		return area;
	}

}
