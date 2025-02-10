package Ejercicio7;

import java.util.Date;

public class Docente implements ServMedico{
	private String rfc;
	private Date fecIngreso;
	private CVitae experiencia;
	
	public Docente() {
	}
	
	public void getRfc() {
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public void getFecIngreso(){
	}
	
	public void setFecIngreso(Date fecIngreso) {
		this.fecIngreso = fecIngreso;
	}
	
	public void setExperiencia(CVitae experiencia) {
		this.experiencia = experiencia;
	}
	
	// Obligatorios si están en clase abstracta y esta clase hereda de ella
	@Override
	public void regProveedor() {
	
	}
	
	@Override
	public void regVigenciaServicio() {
	
	}
	
	@Override
	public void regNSegSO() {
	
	}
}
