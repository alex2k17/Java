package ExamenEjer1;

public class Programa {
	public static void main(String[] args) {
		byte i;
		SocioIndividual socio_indv;
		SocioFamiliar socio_fam;

		for (i = 0; i < 9; i++) {
			try {
				switch (i) { //Para no poner un try-catch a cada uno, pongo un try-catch general y utilizo un switch-case.
				case 0:
					System.out.println("----------Pruebas de nif----------");
					// Incorrecto: nif con más de 8 dígitos
					socio_indv = new SocioIndividual("Juan Cabello","279871239X", (byte) 15);
					break;
				case 1:
					// Incorrecto: nif con menos de 8 dígitos
					socio_indv = new SocioIndividual("Juan Cabello","2798712X", (byte) 15);
					break;
				case 2:
					// Incorrecto: nif con letra incorrecta
					socio_indv = new SocioIndividual("Juan Cabello","27987123R", (byte) 15);
					break;
				case 3:
					// Correcto: nif con letra correcta en minúscula
					socio_indv = new SocioIndividual("Juan Cabello","27987123x", (byte) 15);
					System.out.println("Se ha creado el " + socio_indv);
					break;
				case 4:
					// Correcto: nif con letra correcta en mayúscula
					socio_fam = new SocioFamiliar("Laura Perez", "25678902T",(byte) 5, (byte) 3);
					System.out.println("Se ha creado el " + socio_fam);
					break;
				case 5:
					System.out.println("----------Pruebas de socio individual----------");
					// Correcto: socio individual con número de actividades menor de 20
					socio_indv = new SocioIndividual("Juan Cabello","27987123x", (byte) 15);
					System.out.println("El " + socio_indv+ " tiene que pagar este mes "+ socio_indv.calcularCuotaMensual());
					break;
				case 6:
					// Correcto: socio individual con número de actividades mayor de 20
					socio_indv = new SocioIndividual("Alejandro Contreras","28234109E", (byte) 23);
					System.out.println("El " + socio_indv+ " tiene que pagar este mes "+ socio_indv.calcularCuotaMensual());
					break;
				case 7:
					System.out.println("----------Pruebas de socio familiar----------");
					// Incorrecto: socio familiar con número de familiares menor de uno
					socio_fam = new SocioFamiliar("Laura Perez", "25678902T",(byte) 5, (byte) 0);
					break;
				case 8:
					// Correcto: socio familiar con número de familiares mayor o igual a uno
					socio_fam = new SocioFamiliar("Laura Perez", "25678902T",(byte) 5, (byte) 3);
					System.out.println("El " + socio_fam+ " tiene que pagar este mes "+ socio_fam.calcularCuotaMensual());
					break;
				}

			} catch (IllegalArgumentException e) {
				System.out.println("No se ha creado el socio porque el nif no es correcto o el número de familiares es menor de uno");
			}
		}
	}
}
