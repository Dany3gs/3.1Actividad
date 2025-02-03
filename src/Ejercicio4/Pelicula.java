package Ejercicio4;

public class Pelicula extends Producto{
	private Persona4 protagonista;
	private Persona4 director;
	
	public Pelicula(String titulo, float precio, Persona4 protagonista, Persona4 director) {
		super(titulo, precio);
		this.protagonista = protagonista;
		this.director = director;
	}
	
	public Persona4 getProtagonista() {
		return protagonista;
	}
	
	public void setProtagonista(Persona4 protagonista) {
		this.protagonista = protagonista;
	}
	
	public Persona4 getDirector() {
		return director;
	}
	
	public void setDirector(Persona4 director) {
		this.director = director;
	}

	// Obligado por tener el método en la clase abstracta (Polimorfismo)
	@Override
	public Persona4 getPersonaAsociada() {
		return this.director; // Implementado de método abstracto
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
