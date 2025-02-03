package Ejercicio4;

public abstract class Producto {
	private String titulo;
	private float precio;
	private int ID;
	private static int contadorId = 0;
	
	public Producto(String titulo, float precio) {
		this.titulo = titulo;
		this.precio = precio;
		this.ID = ++contadorId;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public int getID() {
		return ID;
	}

	// Para poder implementar en cada clase Libro y Película de manera independiente, se crea método abstracto
	public abstract Persona4 getPersonaAsociada();
	
	@Override
	public String toString() {
		return "Producto{" +
				"titulo='" + titulo + '\'' +
				", precio=" + precio +
				", ID=" + ID +
				'}';
	}
}
