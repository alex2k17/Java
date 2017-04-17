package SegundoBoletin;
 
/**
 * @author Alex
 *
 */
public class Ejercicio11 {
 
        public static void main(String[] args) {
 
                int numero=30, i;
               
                for (i=0;i<=numero;i++){
                        System.out.print(fibonacci(i)+",");
                }
        }
 
        public static int fibonacci (int fibonacci){
                if (fibonacci<=1){
                        return 1;
                }
                else {return fibonacci(fibonacci-1)+fibonacci(fibonacci-2);}
        }
}
