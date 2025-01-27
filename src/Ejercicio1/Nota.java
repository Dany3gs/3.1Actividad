package Ejercicio1;

public class Nota {
    private int nota;
    private String texto;

    public Nota(int nota, String texto) {
        this.nota = nota;
        this.texto = texto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota=" + nota +
                ", texto='" + texto + '\'' +
                '}';
    }
}
