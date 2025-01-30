package Ejercicio1;

import java.util.Arrays;

public class BlocNotas {
	private Nota[] notas;
	private int indice = 0;
	
	public BlocNotas(int capacidad) {
		this.notas = new Nota[capacidad];
	}
	
	public void introducirNota(Nota nota) {
		if (indice < notas.length) {
			notas[indice] = nota;
			indice++;
		} else {
			// Manejar el caso en que el array está lleno
			System.out.println("El bloc de notas está lleno.");
		}
	}
	
	public void listarNotas() {
		// TODO falta sumar NotaAlarma
		for (int i = 0; i < indice; i++) {
			System.out.println(notas[i]);
		}
	}
	
	public void eliminarNota(int posicion) {
		if (posicion >= 0 && posicion < indice) {
			// Desplazar las notas hacia la izquierda
			for (int i = posicion; i < indice - 1; i++) {
				notas[i] = notas[i + 1];
			}
			// Poner null en la última posición para evitar referencias a objetos eliminados
			notas[indice - 1] = null;
			indice--; // Decrementar el índice
		} else {
			System.out.println("Posición inválida.");
		}
	}
	
	public int cantidadNotas() {
		return indice;
	}
}
