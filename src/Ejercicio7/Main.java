package Ejercicio7;

/*7.- Codifica los siguientes diagramas de clase y ejecuta en la clase MAIN instanciando los objetos necesarios.
* Ver imagen en Doc
* */

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// Se instancia un objeto y se inicializa de clase Alumno y Docente
		Alumno alumno = new Alumno();
		alumno.setMatricula("A12345");
		alumno.setCarrera("Ingeniería");

		Docente docente = new Docente();
		docente.setRfc("RFC123456");
		docente.setFecIngreso(new Date());

		System.out.println("Alumno: " + alumno.getMatricula() + ", Carrera: " + alumno.getCarrera());
		System.out.println("Docente: " + docente.getRfc() + ", Fecha de Ingreso: " + docente.getFecIngreso());

	}
}
