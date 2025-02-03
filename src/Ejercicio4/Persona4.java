package Ejercicio4;

public class Persona4 {
	private String nombre;
	private String apellido;
	
	public Persona4(String nombre, String apellido) {
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

	// Se especifica que el método compruebe nombre y apellido
	public boolean esIgual(Persona4 p) {
		return nombre.equals(p.getNombre()) && apellido.equals(p.getApellido());
	}

	@Override
	public String toString() {
		return "Persona{" +
				"nombre='" + nombre + '\'' +
				", apellido='" + apellido + '\'' +
				'}';
	}


}
