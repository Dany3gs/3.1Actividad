package Ejercicio6;

/*6.- En un puerto se alquilan amarres para barcos de distinto tipo. Para cada ALQUILER se guarda el nombre y DNI del
cliente, las fechas inicial y final de alquiler, la posición del amarre y el barco que lo ocupará.

- Un BARCO se caracteriza por su matrícula, su eslora en metros y año de fabricación.

- Un alquiler se calcula multiplicando el número de días de ocupación (incluyendo los días inicial y final) por un
módulo función de cada barco (obtenido simplemente multiplicando por 10 los metros de eslora) y por un valor fijo
(300 euros en la actualidad).

Sin embargo, ahora se pretende diferenciar la información de algunos tipos de barcos:

- Número de mástiles para veleros
- Potencia en CV para embarcaciones deportivas a motor
- Potencia en CV y número de camarotes para yates de lujo.

El módulo de los barcos de un tipo especial se obtiene como el módulo normal más:

- El número de mástiles para veleros
- La potencia en CV para embarcaciones deportivas a motor
- La potencia en CV más el número de camarotes para yates de lujo.*/

import java.time.LocalDate;

public class Main{
	
	public static void main(String[] args) {
		System.out.println();
		
		// Alquiler de un Velero
		Cliente cliente1 = new Cliente("Juan Pérez", "12345678A");
		Barco alquilerVelero = new Velero("VEL123", 20, 2010, 3);
		LocalDate fechaInicial1 = LocalDate.now();
		LocalDate fechaFinal1= fechaInicial1.plusDays(7);
		Alquiler alquiler1 = new Alquiler(cliente1, fechaInicial1, fechaFinal1, 1, alquilerVelero);
		
		System.out.println("-----------------------Alquiler de Velero-------------------------------------");
		System.out.println("El cliente " + cliente1.getNombre());
		System.out.println("Alquila embarcación " + alquilerVelero);
		System.out.println("Por un total de " + alquiler1.diasAlquilados() + " dias");
		System.out.println("Día inicial del alquiler: " + fechaInicial1);
		System.out.println("Día final del alquiler: " + fechaFinal1);
		System.out.println("Costo del alquiler de "+
				cliente1.getNombre()+ " -> " +
				alquiler1.calcularAlquiler() +
				" euros");
		System.out.println("");
		//-------------------------------------------------------------------------------------------------//
		
		// Alquiler de un Yate
		Cliente cliente2 = new Cliente("Pedro Sánchez", "87654321B");
		Barco alquilerYate = new Yate("YA123", 10, 2015, 60, 4);
		LocalDate fechaInicial2 = LocalDate.now();
		LocalDate fechaFinal2= fechaInicial2.plusDays(5);
		Alquiler alquiler2 = new Alquiler(cliente2, fechaInicial2, fechaFinal2, 1, alquilerYate);
		
		System.out.println("-----------------------Alquiler de Yate-------------------------------------");
		System.out.println("El cliente " + cliente2.getNombre());
		System.out.println("Alquila embarcación " + alquilerYate);
		System.out.println("Por un total de " + alquiler2.diasAlquilados() + " dias");
		System.out.println("Día inicial del alquiler: " + fechaInicial2);
		System.out.println("Día final del alquiler: " + fechaFinal2);
		System.out.println("Costo del alquiler de " + cliente2.getNombre()+ " -> " + alquiler2.calcularAlquiler() +
							" euros");
		System.out.println("");
		//-------------------------------------------------------------------------------------------------//
		
		// Alquiler de una Deportiva
		Cliente cliente3 = new Cliente("Daniel Martínez", "8312331B");
		Barco alquilerDeportiva = new DeportivasAMotor("DP133",22, 2020,140);
		LocalDate fechaInicial3 = LocalDate.now();
		LocalDate fechaFinal3= fechaInicial3.plusDays(8);
		Alquiler alquiler3 = new Alquiler(cliente3, fechaInicial3, fechaFinal3, 1, alquilerDeportiva);
		
		System.out.println("-----------------------Alquiler de Deportiva-------------------------------------");
		System.out.println("El cliente " + cliente3.getNombre());
		System.out.println("Alquila embarcación " + alquilerDeportiva);
		System.out.println("Por un total de " + alquiler3.diasAlquilados() + " dias");
		System.out.println("Día inicial del alquiler: " + fechaInicial3);
		System.out.println("Día final del alquiler: " + fechaFinal3);
		System.out.println("Costo del alquiler de " + cliente3.getNombre()+ " -> " + alquiler3.calcularAlquiler() +
				" euros");
		
	}
}



