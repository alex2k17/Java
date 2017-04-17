package Ejer3;

public abstract class FiguraGeometrica {
	public int x;
	public int y;
	public int area;
	
	
	FiguraGeometrica (){
		x=0;
		y=0;
		area=0;
	}
	
	
	public FiguraGeometrica(int x, int y, int area){
		this.x=x;
		this.y=y;
		this.area=area;
	}
	
	
	abstract public int calcular_area();
	

}
