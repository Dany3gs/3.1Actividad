package Ejercicio6;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class Alquiler {
	private Cliente cliente;
	//private Cliente DNI;
	private LocalDate fechaInicial;
	private LocalDate fechaFinal;
	private int posicionAmarre;
	private Barco barco;
	
	public Alquiler(Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal, int posicionAmarre, Barco barco) {
		this.cliente = cliente;
		//this.DNI = DNI;
		this.fechaInicial = fechaInicial;
		this.fechaFinal = fechaFinal;
		this.posicionAmarre = posicionAmarre;
		this.barco = barco;
	}
	
	public Cliente getNombre() {
		return cliente;
	}
	
	public void setNombre(Cliente nombre) {
		this.cliente = nombre;
	}
	
		/*public Cliente getDNI() {
			return DNI;
		}
		
		public void setDNI(Cliente DNI) {
			this.DNI = DNI;
		}*/
	
	public LocalDate getFechaInicial() {
		return fechaInicial;
	}
	
	public void setFechaInicial(LocalDate fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	
	public LocalDate getFechaFinal() {
		return fechaFinal;
	}
	
	public void setFechaFinal(LocalDate fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	public int getPosicionAmarre() {
		return posicionAmarre;
	}
	
	public void setPosicionAmarre(int posicionAmarre) {
		this.posicionAmarre = posicionAmarre;
	}
	
	public Barco getBarco() {
		return barco;
	}
	
	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	public double calcularAlquiler() {
		long diasAlquilados = ChronoUnit.DAYS.between(fechaInicial, fechaFinal) + 1; // Incluye días inicial y final
		double modulo = barco.calcularModulo();
		return diasAlquilados * modulo * 300;
	}
	
	public int diasAlquilados() {
		long totalDiasAlquilados = ChronoUnit.DAYS.between(fechaInicial, fechaFinal) + 1;
		return (int) totalDiasAlquilados;
	}
	
	@Override
	public String toString() {
		return "Alquiler{" +
				"nombre=" + cliente +
				//", DNI=" + DNI +
				", fechaInicial=" + fechaInicial +
				", fechaFinal=" + fechaFinal +
				", posicionAmarre=" + posicionAmarre +
				", barco=" + barco +
				'}';
	}
}
