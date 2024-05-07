package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.CitaDto;
import dtos.ClienteDto;

/*
 * Interfaz que contiene el menu
 * */
public interface MenuInterfaz {
	
	/*
	 * Metodo para el menu principal
	 * Devuelve la opcion seleccionada
	 * */
	
	public int mostrarMenuYSeleccionPrin(Scanner sc) throws Exception;
	
	/*
	 * Metodo para el menu de los empleados
	 * devuelve la opcion seleccionada
	 * */
	
	public int mostrarMenuYSeleccionEmp(Scanner sc) throws Exception;
	
	/*
	 * Metodo para el menu de clientes
	 * devuelve la opcion seleccionada
	 * */
	
	public int mostrarMenuYSeleccionCli(Scanner sc) throws Exception;
	
	
	
	/*
	 * Metodo que contiene la operativa del menu de empleados
	 * */
	public void menuEmp(List<ClienteDto> listaAntgClientes,Scanner sc,List<CitaDto> listaAntgCitas) throws Exception;
	
	/*
	 * Metodo que contiene la operativa del menu de clientes
	 * */
	public void menuCli(List<ClienteDto> listaAntgClientes,Scanner sc,List<CitaDto> listaAntgCitas) throws Exception;
	
	/*
	 * Mostrara el menu de especialidades
	 * devolvera la opcion seleccionada
	 * */
	public int mostrarMenuYSeleccionEsp(Scanner sc) throws Exception;
	
	//Metodo  que contiene la operativa para el menu de especialidades
	
	public void menuEsp(Scanner sc) throws Exception;

}
