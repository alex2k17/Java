package Examen2;



public class Metodos {
	
	public static void cuadradoRandom(Sorpresa cuadrado[][], int tam){
		int i,numAleatorio1,numAleatorio2;
		for (i=0;i<tam+1;i++){
			numAleatorio1=(int) Math.floor(Math.random()*tam);
			numAleatorio2=(int) Math.floor(Math.random()*tam);
			switch(i){
				case 0:
					cuadrado[numAleatorio1][numAleatorio2]= new Coches("Ferrari", "Rojo", 30, 0);
					break;
				case 1:
					cuadrado[numAleatorio1][numAleatorio2]= new Peluches("Pepe", "azul", PelucheEnum.PEQUEÑO);
					break;
				case 2:
					cuadrado[numAleatorio1][numAleatorio2]= new Coches("BMW", "Amarillo", 100, 0);
					break;
				case 3:
					cuadrado[numAleatorio1][numAleatorio2]= new Peluches("Osito", "Blanco", PelucheEnum.GRANDE);
					break;
				case 4:
					cuadrado[numAleatorio1][numAleatorio2]= new Coches("Cochecito", "Negro", 500, 0);
					break;
				case 5: 
					cuadrado[numAleatorio1][numAleatorio2]= new Chucherias("Gominolas");
					break;
			}
		}
	}
	
	public static void mostrarCuadrado(Sorpresa cuadrado[][], int tam){
		int i, j;
		for(i=0;i<tam;i++){
			for(j=0;j<tam;j++){
				if(cuadrado[i][j]==null){
					System.out.println("la posicion "+i+","+j+" Esta vacia");
				}
				else
					System.out.println(cuadrado[i][j].toString());
			}
		}
	}
	
	public static void Jugar(Sorpresa cuadrado[][], int tam){
		int marchas = 0;
		int posicion1 = 0, posicion2 = 0;
		int preg;
		boolean salir=false;
		posicion1=InAndOut.pedirNumero("Preparado para jugar? introduce la 1º posicion! Tamaño máximo "+tam);
		posicion2=InAndOut.pedirNumero("Introduce la 2º posicion: ");
		if(cuadrado[posicion1][posicion2] instanceof Coches){
			System.out.println("Ha ganado un coche!");
			System.out.println(cuadrado[posicion1][posicion2].toString());
			
			try{
				do{
					preg=InAndOut.pedirNumero("Que desea hacer con el?\n"+
											"1. Arrancarlo\n"+
											"2. Pararlo\n"+
											"3. Subir marcha\n"+
											"4. Bajar marcha\n"+
											"5. Salir.");
					switch(preg){
						case 1:
							((Coches) cuadrado[posicion1][posicion2]).arrancar();
							break;
						case 2:
							((Coches) cuadrado[posicion1][posicion2]).parar();
							break;
						case 3:
							((Coches) cuadrado[posicion1][posicion2]).subir_marcha();
							System.out.println(cuadrado[posicion1][posicion2].toString());
							break;
						case 4:
							((Coches) cuadrado[posicion1][posicion2]).bajar_marcha();
							System.out.println(cuadrado[posicion1][posicion2].toString());
							break;
						case 5:
							salir=true;
							break;
						default:
							System.out.println("Especifica bien.");
					}
				}while(!salir);
			}catch(NullPointerException e){
				
			}
		}
		else if (cuadrado[posicion1][posicion2] instanceof Peluches){
			System.out.println("ha ganado un peluche!");
			System.out.println(cuadrado[posicion1][posicion2].toString());
		}
		else {
			System.out.println("No ha ganado Nada.");
		}
	}
	
}
