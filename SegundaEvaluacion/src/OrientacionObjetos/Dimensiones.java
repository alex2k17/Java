package OrientacionObjetos;

	public class Dimensiones {
		float ancho;
		float alto;
		float fondo;
		
		public Dimensiones(){
			ancho=0;
			alto=0;
			fondo=0;
		}
		
		public Dimensiones(float ancho, float alto, float fondo){
			this.ancho=ancho;
			this.alto=alto;
			this.fondo=fondo;
		}

		public float getAncho() {
			return ancho;
		}
		
		public void setAncho(float ancho) {
			this.ancho = ancho;
		}
		
		public float getAlto() {
			return alto;
		}
		
		public void setAlto(float alto) {
			this.alto = alto;
		}
		
		public float getFondo() {
			return fondo;
		}
		
		public void setFondo(float fondo) {
			this.fondo = fondo;
		}
		
		public float sumaDimensionesX(Dimensiones dimensiones){
			return(ancho+dimensiones.ancho);
		}
		
		public float sumaDimensionesY(Dimensiones dimensiones){
			return(alto+dimensiones.alto); 
		}
		
		public float sumaDimensionesZ(Dimensiones dimensiones){
			return(fondo+dimensiones.fondo);
		}
		
		public float alturaMaximaParaApilar(float alturaMaxima){
			return (alturaMaxima-alto);
		}

		public boolean esPosibleApilar(Dimensiones dimensiones, float alturaMaxima){
			return (alto+dimensiones.alto<=alturaMaxima) ? true : false;
		}
		
		public void voltearDimensionX(){
			float aux;
			aux=alto;
			alto=fondo;
			fondo=aux;
		}

		public void voltearDimensionY(){
			float aux;
			aux=ancho;
			ancho=fondo;
		fondo=aux;
		}

		public void voltearDimensionZ(){
			float aux;
			aux=ancho;
			ancho=alto;
			alto=aux;
		}

		public void esPosibleApilarGiro(Dimensiones dimensiones,float alturaMaxima){
			int i,j;
			Dimensiones p1,p2;
			p1=copiar(this);
			p2=copiar(dimensiones);
			for(i=0;i<3;i++){
				switch(i){
					case 1: p1.voltearDimensionX();
						break;
					case 2: p1.voltearDimensionZ();
						break;
					}
				for(j=0;j<3;j++){
					switch(j){
						case 1: p2.voltearDimensionX();
							break;
						case 2: p2.voltearDimensionZ();
							break;
					}
					if(p1.esPosibleApilar(p2,alturaMaxima))
						p1.imprime_resultado(p2);	
				}
			}
		}
		
		public Dimensiones copiar(Dimensiones dimensiones){
			Dimensiones nuevo=new Dimensiones();
			nuevo.alto=dimensiones.alto;
			nuevo.ancho=dimensiones.ancho;
			nuevo.fondo=dimensiones.fondo;
			return nuevo;
		}
		
		public void imprime_resultado(Dimensiones dimensiones){
			System.out.println("El paquete "+toString()+" se puede apilar con el paquete "+dimensiones.toString());
		}
		
		public String toString(){
			return("Dimensiones X: "+getAncho()+" Y: "+getAlto()+" Z: "+getFondo());
		}	
		
		public static void main(String [] args){
			Dimensiones dimensiones= new Dimensiones (5,7,6);
			Dimensiones dimensiones1= new Dimensiones (4,3,8);
			System.out.println(dimensiones.toString());
			System.out.println(dimensiones1.toString());
			System.out.println("La suma de la dimension X es: "+dimensiones.sumaDimensionesX(dimensiones1));
			System.out.println("La suma de la dimension Y es: "+dimensiones.sumaDimensionesY(dimensiones1));
			System.out.println("La suma de la dimension Z es: "+dimensiones.sumaDimensionesZ(dimensiones1));
			if (dimensiones.esPosibleApilar(dimensiones1,9)==false)
				System.out.println("El paquete no se puede apilar");
			else
				System.out.println("El paquete se puede apilar");
			dimensiones.esPosibleApilarGiro(dimensiones1, 9);
		}
	}