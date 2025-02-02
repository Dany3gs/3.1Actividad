package Ejercicio6;

import java.util.Date;

public class Barco {
	private String matricula;
	private double eslora;
	private int anoFabricacion;
	
	public Barco(String matricula, double eslora, int anoFabricacion) {
		this.matricula = matricula;
		this.eslora = eslora;
		this.anoFabricacion = anoFabricacion;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getEslora() {
		return eslora;
	}
	
	public void setEslora(double eslora) {
		this.eslora = eslora;
	}
	
	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
	
	public double calcularModulo(){
		return eslora * 10;
	}
	
	@Override
	public String toString() {
		return "Barco con " +
				"matricula = '" + matricula + '\'' +
				", eslora = " + eslora +
				", anoFabricacion = " + anoFabricacion +
				'}';
	}
}

