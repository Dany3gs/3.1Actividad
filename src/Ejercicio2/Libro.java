package Ejercicio2;

public class Libro {
    private String autor;
    private String titulo;
    private float precio;

    public Libro(String autor, float precio, String titulo) {
        this.autor = autor;
        this.precio = precio;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
