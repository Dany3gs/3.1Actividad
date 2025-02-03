package Ejercicio3;

public class Persona {
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return  "nombre = '" + nombre + '\'' +
                ", apellido = '" + apellido + '\'' +
                "";
    }

    public boolean esIgual(Persona p) {
        if (this.nombre.equals(p.getNombre()) && this.apellido.equals(p.getApellido())) {
            return true;
        }
        return false;
    }
}
