package Ejer11;

	public class Dado extends sorteo {

		public void lanzar(){
			posibilidades=(int) (Math.random()*6+1);
			System.out.println(posibilidades);	
		}

}
