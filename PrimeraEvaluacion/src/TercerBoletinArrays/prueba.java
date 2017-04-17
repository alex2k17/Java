package TercerBoletinArrays;

import javax.swing.JOptionPane;
 
/**
 *
 */
 
/**
 * @author Raker
 *
 */
public class prueba {
 
        /**
         * @param args
         */
        public static void main(String[] args) {
                // TODO Auto-generated method stub
                String opcion3;
                int opcion,f,c, i,posicion;
                String vector3;
                final int size = 3;
                final int size2 = 10;
                int vector[][]=new int [size][size];
                int sum_fil[]=new int [size];
                int sum_col[]=new int [size];
                char letraposicion;
                char vector2[]=new char [size2];
               
                do{
                        do{
                        opcion=Integer.parseInt(JOptionPane.showInputDialog ("Escriba por favor la operacion que desea realizar: \n1 = Calcular \n2 = LetraPosicion \n3 = Suma de Matrices"));
                        }while(opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4);      
                                if (opcion==1)
                                {
                                        System.out.println("Calculadora");
                                       
                                }
                                else if (opcion==2)
                                {
 
                               
                                        vector3=JOptionPane.showInputDialog("Rellena el Vector");
                                                for (i=0;i<vector3.length();i++)
                                                {
                                                        vector2[i]=vector3.charAt(i);
                                                }
 
                                                letraposicion=JOptionPane.showInputDialog("Introduce el valor que quieras introducir").charAt(0);
                                        posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion en la que quieres introducirlo"));
                                       
                                        for (i=vector2.length-1;i>=posicion;i--){
                                                vector2[i]=vector2[i-1];
                                        }
                                        vector2[i]=letraposicion;
                                       
                                        for (i=0;i<10;i++)
                                        {
                                                System.out.print(vector2[i]);
                                        }
                                }
                                else if (opcion==3)
                                {
                                       
                                        for (f=0;f<size;f++){
                                                for (c=0;c<size;c++)
                                                {
                                                        vector[f][c]=Integer.parseInt(JOptionPane.showInputDialog("Rellena el Vector"+" "+f+" "+c));
                                                        sum_fil[f]+=vector[f][c];
                                                        sum_col[c]+=vector[f][c];
                                                               
                                                }
                                        }
                                        System.out.print("Suma de Filas ");
                                        for (f=0;f<size;f++){
                                                System.out.print(sum_fil[f]+" ");
                                        }
                                        System.out.println("");
                                        System.out.print("Suma de Columna ");
                                        for (c=0;c<size;c++){
                                                System.out.print(sum_col[c]+" ");
                                        }
                                }                              
                                opcion3=(JOptionPane.showInputDialog ("¿Desea Salir?"));
                }while (opcion3.equalsIgnoreCase("NO"));
        }
 
}