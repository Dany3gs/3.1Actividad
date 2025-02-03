package Ejercicio4;

public class Libro extends Producto{
	private Persona4 autor;
	
	public Libro(String titulo, float precio, Persona4 autor) {
		super(titulo, precio);
		this.autor = autor;
	}
	
	public Persona4 getAutor() {
		return autor;
	}
	
	public void setAutor(Persona4 autor) {
		this.autor = autor;
	}
	@Override
	public Persona4 getPersonaAsociada() {
		return this.autor; // Implementar método abstracto
	}
	@Override
	public String toString() {
		return "Libro{" +
				"autor=" + autor +
				"titulo='" + getTitulo() + '\'' +
				", precio=" + getPrecio() +
				", ID=" + getID() +
				'}';
	}
}
