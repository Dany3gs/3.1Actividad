package Ejercicio4;

import Ejercicio3.Persona;

public class Pelicula extends Producto{
	private Ejercicio3.Persona protagonista;
	private Persona director;
	
	public Pelicula(String titulo, float precio, Persona protagonista, Persona director) {
		super(titulo, precio);
		this.protagonista = protagonista;
		this.director = director;
	}
	
	public Persona getProtagonista() {
		return protagonista;
	}
	
	public void setProtagonista(Persona protagonista) {
		this.protagonista = protagonista;
	}
	
	public Persona getDirector() {
		return director;
	}
	
	public void setDirector(Persona director) {
		this.director = director;
	}
	
	@Override
	public String toString() {
		return "Pelicula{" +
				"protagonista=" + protagonista +
				", director=" + director +
				"titulo='" + getTitulo() + '\'' +
				", precio=" + getPrecio() +
				'}';
	}
}
