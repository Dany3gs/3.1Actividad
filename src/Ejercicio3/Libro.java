package Ejercicio3;

public class Libro {
    private Persona autor;
    private String titulo;
    private float precio;

    public Libro(Persona autor, String titulo, float precio) {
        this.autor = autor;
        this.titulo = titulo;
        this.precio = precio;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
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
        return "Libro{ " +
                "autor = " + getAutor() +
                ", titulo = '" + titulo + '\'' +
                ", precio = " + precio +
                '}';
    }
}
