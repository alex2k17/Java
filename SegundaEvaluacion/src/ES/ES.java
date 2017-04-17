package ES;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ES {
	private static InputStreamReader isr = new InputStreamReader(System.in);
	private static BufferedReader br = new BufferedReader(isr);
	
	public static int leeEntero(String txt) {
		int num=0;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(txt);
				num = Integer.parseInt(br.readLine());
				salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Debe introducir un numero, por favor.");
				System.out.println();
				salida=false;
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
				salida=false;
			}
			
		}while(salida==false);
		
		return num;
	}
	
	public static int leeEntero(String txt, int min) {
		int num=0;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(txt);
				num = Integer.parseInt(br.readLine());
				if (num<min) {
					System.out.println("ERROR. Debe introducir un numero mayor o igual que "+min+".");
					System.out.println();
					salida=false;
				}
				else salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Debe introducir un numero, por favor.");
				System.out.println();
				salida=false;
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
				salida=false;
			}
		}while(salida==false);
		
		return num;
	}
	
	public static int leeEntero(String txt, int min, int max) {
		int num=0;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(txt);
				num = Integer.parseInt(br.readLine());
				if (num<min || num>max) {
					System.out.println("ERROR. Debe introducir un numero entre "+min+" y "+max+".");
					System.out.println();
					salida=false;
				}
				else salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Debe introducir un numero, por favor.");
				System.out.println();
				salida=false;
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
				salida=false;
			}
		}while(salida==false);
		
		return num;
	}
	
	public static float leeReal(String txt) {
		float num=0;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(txt);
				num = Float.parseFloat(br.readLine());
				salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Debe introducir un numero decimal, por favor.");
				System.out.println();
				salida=false;
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
				salida=false;
			}
		}while(salida==false);
		
		return num;
	}
	
	public static float leeReal(String txt, int min) {
		float num=0;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(txt);
				num = Float.parseFloat(br.readLine());
				if (num<min) {
					System.out.println("ERROR. Debe introducir un numero decimal mayor o igual que "+min+".");
					System.out.println();
					salida=false;
				}
				else salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Debe introducir un numero decimal, por favor.");
				System.out.println();
				salida=false;
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
				salida=false;
			}
		}while(salida==false);
		
		return num;
	}
	
	public static float leeReal(String txt, int min, int max) {
		float num=0;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(txt);
				num = Float.parseFloat(br.readLine());
				if (num<min || num>max) {
					System.out.println("ERROR. Debe introducir un numero decimal entre "+min+" y "+max+".");
					System.out.println();
					salida=false;
				}
				else salida=true;
				
			} catch (NumberFormatException e) {
				System.out.println("ERROR. Debe introducir un numero decimal, por favor.");
				System.out.println();
				salida=false;
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
				salida=false;
			}
		}while(salida==false);
		
		return num;
	}
	
	public static void msg(String mensaje) {
		System.out.print(mensaje);
	}
	
	public static void msgln(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static String leeCadena(String txt) {
		String cad="";
		
		do{
			try {
				
				System.out.print(txt);
				cad = br.readLine();
				if (cad.isEmpty()) {
					System.out.println("ERROR. Debe introducir los datos requeridos.");
					System.out.println();
				}
				
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
			}
		}while(cad.isEmpty());
		
		return cad;
	}
	
	public static boolean leeRespuesta(String pregunta) {
		String respuesta="";
		boolean resp=false;
		boolean salida=false;
		
		do{
			try {
				
				System.out.print(pregunta);
				respuesta = br.readLine();
				if (respuesta.isEmpty()) {
					System.out.println("ERROR. Debe introducir los datos requeridos.");
					System.out.println();
					salida=false;
				}
				else if (respuesta.equalsIgnoreCase("si")) {
					resp=true;
					salida=true;
				}
				else if (respuesta.equalsIgnoreCase("no")) {
					resp=false;
					salida=true;
				}
				else {
					System.out.println("ERROR. Debe introducir 'si' o 'no' para responder correctamente.");
					System.out.println();
					salida=false;
				}
				
			} catch (IOException e) {
				System.out.println("ERROR grave de Entrada/Salida.");
			}
		}while(salida==false);
		
		return resp;
	}
	
}