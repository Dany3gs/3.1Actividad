package Ejercicio6;

public class DeportivasAMotor extends Barco{
	private int potenciaCV;
	
	public DeportivasAMotor(String matricula, double eslora, int anoFabricacion, int potenciaCV) {
		super(matricula, eslora, anoFabricacion);
		this.potenciaCV = potenciaCV;
	}
	
	public int getPotenciaCV() {
		return potenciaCV;
	}
	
	public void setPotenciaCV(int potenciaCV) {
		this.potenciaCV = potenciaCV;
	}
	
	@Override
	public double calcularModulo(){
		return super.calcularModulo() + potenciaCV;
	}
	
	@Override
	public String toString() {
		return "'Deportivas a motor' " +
				"con una potencia de " + potenciaCV + " CV" +
				", matrícula '" + getMatricula() + '\'' +
				", eslora de " + getEslora() + " metros" +
				", y año de fabricación " + getAnoFabricacion() +
				'.';
	}
}
