package Ejercicio4;

import Ejercicio3.Persona;

public class Libro extends Producto{
	private Persona autor;
	
	public Libro(String titulo, float precio, Persona autor) {
		super(titulo, precio);
		this.autor = autor;
	}
	
	public Persona getAutor() {
		return autor;
	}
	
	public void setAutor(Persona autor) {
		this.autor = autor;
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
