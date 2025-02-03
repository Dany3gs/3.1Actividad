package Ejercicio5;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional(int numerador, int denominador) {
		// Se limita denominador que no pueda ser 0, se aplica encapsulamiento
		if (denominador == 0) {
			throw new IllegalArgumentException("El denominador no puede ser cero");
		}
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public int getNumerador() {
		return numerador;
	}
	
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
	
	public int getDenominador() {
		return denominador;
	}
	
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
	
	// Métodos para las operaciones
	public Racional sumar(Racional otro) {
		int nuevoNumerador = (this.numerador * otro.denominador) + (this.denominador * otro.numerador);
		int nuevoDenominador = this.denominador * otro.denominador;
		return new Racional(nuevoNumerador, nuevoDenominador);
	}
	
	public Racional restar(Racional otro) {
		int nuevoNumerador = (this.numerador * otro.denominador) - (this.denominador * otro.numerador);
		int nuevoDenominador = this.denominador * otro.denominador;
		return new Racional(nuevoNumerador, nuevoDenominador);
	}
	
	public Racional opuesto() {
		// Por convención se debe mantener el denominador en positivo, se indica en método para hacer referencia a su
		// valor en opuesto
		return new Racional(-this.numerador, -this.denominador);
		
		/*Otra forma de hacerlo
 		int numeradorOpuesto = Math.negateExact(this.numerador);
		int denominadorOpuesto = this.denominador;
		return new Racional(numeradorOpuesto, denominadorOpuesto);
		* */
	}
	
	public Racional inverso() {
		int numeradorInverso = this.denominador;
		int denominadorInverso = this.numerador;
		return new Racional(numeradorInverso, denominadorInverso);
	}
	
	@Override
	public String toString() {
		return "Racional{" +
				"numerador=" + numerador +
				", denominador=" + denominador +
				'}';
	}
}
