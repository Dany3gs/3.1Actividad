package Ejercicio2;

public class Pelicula {
    private String titulo;
    private String protagonista;
    private String director;
    private float precio;

    public Pelicula(String director, float precio, String protagonista, String titulo) {
        this.director = director;
        this.precio = precio;
        this.protagonista = protagonista;
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "director='" + director + '\'' +
                ", titulo='" + titulo + '\'' +
                ", protagonista='" + protagonista + '\'' +
                ", precio=" + precio +
                '}';
    }
}
