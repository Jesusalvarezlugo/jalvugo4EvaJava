package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.CitaDto;
import dtos.ClienteDto;

/*
 * Interfaz de la operativa de la aplicacion
 * */
public interface OperativaInterfaz {
	
	/*
	 * Metodo para registrar un cliente
	 * */
	public void registroCliente(List<ClienteDto> listaClientesAntg,Scanner sc)throws Exception ;
	
	/*
	 * Metodo para validar un cliente.
	 * 
	 * */
	public void validarCliente(List<ClienteDto> listaAntgCliente,Scanner sc)throws Exception;
	
	/*
	 * Meotodo para solicitar una cita medica
	 * */
	
	public void solicitarCita(List<CitaDto> listaAntgCitas,Scanner sc)throws Exception;
	
	/*
	 * Meotodo que imprime las citas
	 * */
	public void imprimirCitasMedicas(List<CitaDto> listaAntgCitas,Scanner sc)throws Exception;
	

}
