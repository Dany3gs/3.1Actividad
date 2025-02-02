package Ejercicio7_1;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Propietario propietario = new Propietario();
		propietario.setRfc("RFC123456");
		propietario.setNombre("Juan Pérez");
		propietario.setDireccion("Calle Falsa 123");
		propietario.setTelefono("555-1234");
		
		Automovil automovil = new Automovil();
		automovil.setMarca("Toyota");
		automovil.setModelo("Corolla");
		automovil.setDuenio(propietario);
		automovil.setCveVehicular("ABC123");
		automovil.setFecVerificacion(new Date());
		
		System.out.println("Propietario: " + propietario.getNombre() + ", RFC: " + propietario.getRfc());
		System.out.println("Automóvil: " +
				automovil.getMarca() +
				" " + automovil.getModelo() +
				", Dueño: " +
				automovil.getDuenio().getNombre());
	}
}
