package Ejercicio4;

import java.util.Arrays;

public class Catalogo {
	private Producto[] productos;
	private int cantidadDisponible;
	
	public Catalogo(Producto[] productos, int cantidadDisponible) {
		this.productos = productos;
		this.cantidadDisponible = 0;
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
	
	//--> agregar(Producto p), agrega el Producto p al catálogo. //TODO: creo que ok
	public void agregarProducto(Producto producto) {
		if (cantidadDisponible < productos.length) {
			productos[cantidadDisponible] = producto;
			cantidadDisponible++;
		}
	}
	
	//--> eliminar(Integer id), elimina el producto cuyo identificador único es id.
	public void eliminarProducto(int id) {
		// TODO pendiente ver como implementar
	}
	
	//--> buscar(String titulo), devuelve, contenidos en un Catálogo, a todos los Productos cuyo título es titulo.
	//TODO: con esto bastaría? o hay que limitar más o duplicar array por si hay duplicados?
	public String buscarTitulo(String titulo) {
		if (titulo == null) {
			return "Título no válido";
		}
		for (int i = 0; i < cantidadDisponible; i++) {
			if (titulo.equals(productos[i].getTitulo())) { //TODO: sería necesario "productos[i] != null &&" en el if?
				return productos[i].getTitulo();
			}
		}
	return "Titulo no encontrado";
	}
	
	//--> buscar(Persona p), devuelve, contenidos en un Catálogo, a todos los Productos cuyo autor, director o protagonista,
	//según sea el caso, es p.
	public void buscarPersona(Persona p) {
	
	}
	
	@Override
	public String toString() {
		return "Catalogo{" +
				"productos=" + Arrays.toString(productos) +
				", cantidadDisponible=" + cantidadDisponible +
				'}';
	}
}
