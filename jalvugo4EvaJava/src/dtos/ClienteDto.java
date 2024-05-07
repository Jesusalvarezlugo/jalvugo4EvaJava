package dtos;

import java.time.LocalDateTime;

public class ClienteDto {
	
	//Atributos
	
	long id;
	String dniCliente="aaaaa";
	String nombreCliente="aaaaa";
	String apellidosCliente="aaaaa";
	String nombreCompleto=apellidosCliente+", "+nombreCliente;
	boolean clienteVal=false;
	LocalDateTime fechaAltaCliente;
	
	
	//Getters y Setters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDniCliente() {
		return dniCliente;
	}
	public void setDniCliente(String dniCliente) {
		this.dniCliente = dniCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public boolean isClienteVal() {
		return clienteVal;
	}
	public void setClienteVal(boolean clienteVal) {
		this.clienteVal = clienteVal;
	}
	public LocalDateTime getFechaAltaCliente() {
		return fechaAltaCliente;
	}
	public void setFechaAltaCliente(LocalDateTime fechaAltaCliente) {
		this.fechaAltaCliente = fechaAltaCliente;
	}
	
	//Constructores
	
	public ClienteDto() {
		
	}
	public ClienteDto(long id, String dniCliente, String nombreCliente, String apellidosCliente) {
		super();
		this.id = id;
		this.dniCliente = dniCliente;
		this.nombreCliente=nombreCliente;
		this.apellidosCliente=apellidosCliente;
	}
	
	/*
	 * Metodo toString()
	 * */
	
	@Override
	public String toString() {
		return dniCliente+" - "+apellidosCliente+", "+nombreCliente;
	}

}
