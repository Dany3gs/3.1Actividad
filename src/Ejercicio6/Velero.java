package Ejercicio6;

import java.util.Date;

public class Velero extends Barco{
	private int numeroMastiles;
	
	public Velero(String matricula, double eslora, int anoFabricacion, int numeroMastiles) {
		super(matricula, eslora, anoFabricacion);
		this.numeroMastiles = numeroMastiles;
	}
	
	public int getNumeroMastiles() {
		return numeroMastiles;
	}
	
	public void setNumeroMastiles(int numeroMastiles) {
		this.numeroMastiles = numeroMastiles;
	}
	
	@Override
	public double calcularModulo(){
		return super.calcularModulo() + numeroMastiles;
	}
	
	@Override
	public String toString() {
		return "'Velero' " +
				"con " + numeroMastiles + " mástiles" +
				", con matrícula '" + getMatricula() + '\'' +
				", eslora de " + getEslora() + " metros" +
				", y año de fabricación " + getAnoFabricacion() +
				'.';
	}
}
