package Ejercicio1;

import java.util.Arrays;

public class BlocNotas {
	// Creamos un array de notas con la clase Notas
	private Nota[] notas;

	// Creamos un índice para manipular los métodos según se requiera y tener un total de notas
	private int indice = 0;

	// Método constructor con parámetro capacidad, para darle un tamaño al array al instanciarlo
	public BlocNotas(int capacidad) {
		this.notas = new Nota[capacidad]; // Asignamos al atributo notas (array) el tamaño de "capacidad"
	}

	// Solicitamos como parámetro una nueva Nota, tenemos que comprobar si el tamaño del Array está lleno
	// Utilizamos el atributo índice para esto
	public void introducirNota(Nota nota) {
		if (indice < notas.length) {
			notas[indice] = nota; // Si hay hueco en el array, se coloca en el valor de índice la nueva nota
			indice++;
		} else {
			// Manejar el caso en que el array está lleno
			System.out.println("El bloc de notas está lleno.");
		}
	}

	// Método para imprimir las notas por consola
	public void listarNotas() {
		// Con foreach
		for (Nota nota: Arrays.copyOf(notas, indice)) {
			System.out.println(nota);
		}

		// Con for //
		/*for (int i = 0; i < indice; i++) {
			System.out.println(notas[i]);
		}*/
	}

	/* Método para eliminar una nota, pasamos como parámetro una posición del array que es la que queremos eliminar,
	   verificamos si la posición se encuentra dentro del las notas entre 0 y valor de índice, con el for, desplazamos
	   las notas hacia la izquierda, empezando desde el valor de posición (i = posición), sobreescribiendo la nota a
	   eliminar al hacer que se desplace la siguiente nota una posición a la izquierda (notas[i] = notas[i + 1];)
	 */
	public void eliminarNota(int posicion) {
		if (posicion >= 0 && posicion < indice) {
			for (int i = posicion; i < indice - 1; i++) {

				// Esta es la operación clave. Asigna a la posición actual (i) el valor de la siguiente posición (i + 1).
				// Sobrescribiendo la posición que se desea eliminar.
				notas[i] = notas[i + 1];
			}
			indice--; // Reduce el índice en 1, ya que ahora hay una nota menos en el array
		} else {
			System.out.println("Posición inválida.");
		}
	}

	// Método que solo devuelve el valor del índice
	public int cantidadNotas() {
		return indice;
	}
}
