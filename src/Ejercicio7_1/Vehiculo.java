package Ejercicio7_1;

public class Vehiculo implements regVehicular {
	private Object marca;
	private Object modelo;
	private Propietario duenio;
	private Object cveVehicular;
	
	public Object getMarca() {
		return marca;
	}
	
	public void setMarca(Object marca) {
		this.marca = marca;
	}
	
	public Object getModelo() {
		return modelo;
	}
	
	public void setModelo(Object modelo) {
		this.modelo = modelo;
	}
	
	public Propietario getDuenio() {
		return duenio;
	}
	
	public void setDuenio(Propietario duenio) {
		this.duenio = duenio;
	}
	
	public Object getCveVehicular() {
		return cveVehicular;
	}
	
	public void setCveVehicular(Object cveVehicular) {
		this.cveVehicular = cveVehicular;
	}

	// Obligatorios si están en clase abstracta y esta clase hereda de ella
	@Override
	public double pagoTramite() {
		return 0;
	}
	
	@Override
	public String obtenerCyeY() {
		return "";
	}
}
