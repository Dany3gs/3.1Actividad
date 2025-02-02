package Ejercicio6;

public class Cliente {
	private String nombre;
	private String DNI;
	
	public Cliente(String nombre,String DNI) {
		this.nombre = nombre;
		this.DNI = DNI;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	@Override
	public String toString() {
		return "Cliente{" +
				"nombre='" + nombre + '\'' +
				", DNI='" + DNI + '\'' +
				'}';
	}
}
