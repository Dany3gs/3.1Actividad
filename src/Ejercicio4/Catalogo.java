package Ejercicio4;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Catalogo {
	private Producto[] productos;
	private int cantidadDisponible;

	public Catalogo(int capacidadMaxima) {
		productos = new Producto[capacidadMaxima];
		cantidadDisponible = 0;
	}
	
	public Producto[] getProductos() {
		return productos;
	}
	
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	
	public int getProductosDisponibles() {
		return cantidadDisponible;
	}
	
	public void setProductosDisponibles(int cantidadDisponible) {
		this.cantidadDisponible = cantidadDisponible;
	}
	
	//--> agregar(Producto p), agrega el Producto p al catálogo. Se maneja error si está lleno
	public void agregar(Producto p) {
		if (cantidadDisponible < productos.length) {
			productos[cantidadDisponible++] = p;
		} else {
			throw new IllegalStateException("Catálogo lleno"); // Avisamos en error si está lleno el array
		}
	}
	
	//--> eliminar(Integer id), elimina el producto cuyo identificador único es id.
	public void eliminar(Integer id) {
		for (int i = 0; i < cantidadDisponible; i++) {
			if (productos[i].getID() == id) {
				// Se copia el array y se le asigna una posición menos
				System.arraycopy(productos, i+1, productos, i, cantidadDisponible - i - 1);
				productos[--cantidadDisponible] = null;
				return;
			}
		}
		// Se maneja error si no se encuentra
		throw new NoSuchElementException("ID no encontrado: " + id);
	}
	
	//--> buscar(String titulo), devuelve, contenidos en un Catálogo, a todos los Productos cuyo título es titulo.
	public Catalogo buscar(String titulo) {
		Catalogo resultados = new Catalogo(productos.length);
		for (int i = 0; i < cantidadDisponible; i++) {
			if (productos[i].getTitulo().equalsIgnoreCase(titulo)) {
				System.out.println(productos[i]);
			}
		}
		return resultados;
	}
	
	//--> buscar(Persona p), devuelve, contenidos en un Catálogo, a todos los Productos cuyo autor, director o protagonista,
	//según sea el caso, es p.
	public Catalogo buscar(Persona4 p) {
		Catalogo resultados = new Catalogo(productos.length);
		for (int i = 0; i < cantidadDisponible; i++) {
			if (productos[i].getPersonaAsociada().esIgual(p)) {
				resultados.agregar(productos[i]);
			}
		}
		return resultados;
	}
	
	@Override
	public String toString() {
		return "Catalogo{" +
				"productos=" + Arrays.toString(productos) +
				", cantidadDisponible=" + cantidadDisponible +
				'}';
	}
}
