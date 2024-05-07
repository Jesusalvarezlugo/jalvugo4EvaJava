package dtos;

import java.time.LocalDateTime;

/*
 * Clase de la entidad citas
 * */
public class CitaDto {
	
	//Atributos
	
	long idCita;
	String especialidadCita="aaaaa";
	LocalDateTime fechaCita;
	String dniClienteCita="aaaaa";
	
	//Getters y Setters
	
	public long getIdCita() {
		return idCita;
	}
	public void setIdCita(long idCita) {
		this.idCita = idCita;
	}
	public String getEspecialidadCita() {
		return especialidadCita;
	}
	public void setEspecialidadCita(String especialidadCita) {
		this.especialidadCita = especialidadCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public String getDniClienteCita() {
		return dniClienteCita;
	}
	public void setDniClienteCita(String dniClienteCita) {
		this.dniClienteCita = dniClienteCita;
	}

}
