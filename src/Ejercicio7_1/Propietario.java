package Ejercicio7_1;

public class Propietario {
	private String rfc;
	private String nombre;
	private String direccion;
	private String telefono;
	
	public Propietario() {
	}
	
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	// Indicado en diagrama UML
	public void RegVehiculo(){}
	
	public void ModRegVehiculo(){}
}
