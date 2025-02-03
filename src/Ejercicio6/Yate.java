package Ejercicio6;

public class Yate extends Barco{
	private int potenciaCV;
	private int numeroCamarotes;
	
	public Yate(String matricula, double eslora, int anoFabricacion, int potenciaCV, int numeroCamarotes) {
		super(matricula, eslora, anoFabricacion);
		this.potenciaCV = potenciaCV;
		this.numeroCamarotes = numeroCamarotes;
	}
	
	public int getPotenciaCV() {
		return potenciaCV;
	}
	
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	public int getNumeroCamarotes() {
		return numeroCamarotes;
	}
	
	public void setNumeroCamarotes(int numeroCamarotes) {
		this.numeroCamarotes = numeroCamarotes;
	}

	// Cálculo según indica enunciado Polimorfismo por heredar de clase Barco, se indica con super.
	@Override
	public double calcularModulo() {
		return super.calcularModulo() + potenciaCV + numeroCamarotes;
	}
	
	@Override
	public String toString() {
		return "'Yate' " +
				"con una potencia de " + potenciaCV + " CV" +
				", con " + numeroCamarotes + " camarotes" +
				", matrícula '" + getMatricula() + '\'' +
				", eslora de " + getEslora() + " metros" +
				", y año de fabricación " + getAnoFabricacion() +
				'.';
	}
}
