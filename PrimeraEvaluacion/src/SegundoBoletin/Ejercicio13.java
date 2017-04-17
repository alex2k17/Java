package SegundoBoletin;

/**
 * @author Alex
 *
 */
public class Ejercicio13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	int numerodiscos=3;

        Hanoi(numerodiscos,1,2,3);
    }

    public static void Hanoi (int numerodiscos, int varilla1,  int varilla2, int varilla3){
    	if(numerodiscos==1){
    		System.out.println("Mover el disco de la varilla "+varilla1+" a la "+varilla3);
    	}
    	else{
    		Hanoi(numerodiscos-1, varilla1, varilla3, varilla2);
    		System.out.println("Mover el disco de la varilla "+varilla1+" a la "+varilla3);
    		Hanoi(numerodiscos-1, varilla2, varilla1, varilla3);
    	}
    }
}