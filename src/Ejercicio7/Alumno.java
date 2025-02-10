package Ejercicio7;

class Alumno implements ServMedico{
	private String matricula;
	private String carrera;
	
	public Alumno() {
	}
	
	public void getMatricula() {
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void getCarrera() {
	}
	
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	// Obligatorios si están en clase abstracta y esta clase hereda de ella
	@Override
	public void regProveedor() {
		// Implementación del método
	}
	
	@Override
	public void regVigenciaServicio() {
		// Implementación del método
	}
	
	@Override
	public void regNSegSO() {
		// Implementación del método
	}
}
