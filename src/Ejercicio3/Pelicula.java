package Ejercicio3;

public class Pelicula {
    private Persona protagonista;
    private Persona director;
    private String titulo;
    private float precio;

    public Pelicula(Persona protagonista, Persona director, String titulo, float precio) {
        this.protagonista = protagonista;
        this.director = director;
        this.titulo = titulo;
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Pelicula{ " +
                "protagonista = " + getProtagonista() +
                ", director = " + getDirector() +
                ", titulo = '" + titulo + '\'' +
                ", precio = " + precio +
                '}';
    }
}
