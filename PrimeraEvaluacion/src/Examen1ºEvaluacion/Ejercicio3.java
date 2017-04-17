/**
 * 
 */
package Examen1ºEvaluacion;

/**
 * @author Alex
 *
 */
public class Ejercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double vector[]={5.5, 2.9, 3.3, 5.5};
		int j, i=0;
		j=vector.length;
		

		if(esCapicua(vector,j,i)){
			System.out.println("Es capicua");
		}
		else {
			System.out.println("No es capicua");
		}
		
	}
		
		public static boolean esCapicua(double vector[], int j, int i){
			boolean esCapicua = true;
			
			if (i>j){
				return true;
			}
			else if (vector[i]==vector[j] && esCapicua){
					i++;
					j--;
					esCapicua(vector,j,i);
			}
			
			
			
			return false;
			
		}
			

}
