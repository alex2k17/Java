/**
 * 
 */
package SegundoBoletin;

/**
 * @author Alex
 *
 */
public class Ejercicio4B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n;
		
		for(n=0;n<=10000;n++){
			esprimo(n);
		}	
	}
		
		public static int esprimo(int n) {
			int esprimo=0;
			int i, contador=0;
			for(i=1;i<n;i++){
				if (n%i==0) {
					contador++;
				}
			}
				if (contador<=2){
					System.out.print(n);
					System.out.print(",");
				}
			return esprimo;
		}
	}	
