package Ejercicio7;

import java.util.Date;

public class Docente implements ServMedico{
	private String rfc;
	private Date fecIngreso;
	private String experiencia;
	
	public Docente() {
	}
	
	public String getRfc() {
		return rfc;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	
	public Date getFecIngreso() {
		return fecIngreso;
	}
	
	public void setFecIngreso(Date fecIngreso) {
		this.fecIngreso = fecIngreso;
	}
	
	public String getExperiencia() {
		return experiencia;
	}
	
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
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
