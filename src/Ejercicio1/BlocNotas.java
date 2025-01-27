package Ejercicio1;

import java.util.Arrays;

public class BlocNotas {
    private Nota[] notas;

    public BlocNotas(Nota[] notas) {
        this.notas = notas;
    }

    public Nota[] getNotas() {
        return notas;
    }

    public void setNotas(Nota[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "BlocNotas{" +
                "notas=" + Arrays.toString(notas) +
                '}';
    }

    public String introducirNota() {
        return "Nota: " + Arrays.toString(notas);
    }

    public void listarNotas(){
        for(Nota nota : notas){
            System.out.println(nota);
        }
    }
    public int eliminarNota(){
        int posicion = notas.length - 1;
        notas[posicion] = null;
        return posicion;
    }

    public int cantidadNotas(){
        return notas.length;
    }
}
