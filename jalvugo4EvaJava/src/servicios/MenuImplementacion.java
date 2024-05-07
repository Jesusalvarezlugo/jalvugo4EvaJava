package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.CitaDto;
import dtos.ClienteDto;

/*
 * Clase que contiene la implimentacion de los menus.
 * 
 * */
public class MenuImplementacion implements MenuInterfaz {

	 
	@Override
	public int mostrarMenuYSeleccionPrin(Scanner sc) throws Exception {
		int opcion;
		
		System.out.println("##############################");
		System.out.println("0. Salir de la aplicacion");
		System.out.println("1. Menu Empleados");
		System.out.println("2. Menu Clientes");
		System.out.println("##############################");
		System.out.println("elija una opcion: ");
		opcion=sc.nextInt();
		return opcion;
	}

	@Override
	public int mostrarMenuYSeleccionEmp(Scanner sc) throws Exception{
		
		int opcionE;
		
		System.out.println("##############################");
		System.out.println("0. Salir de la aplicacion");
		System.out.println("1. Validar nuevo cliente");
		System.out.println("2. Imprimir citas");
		System.out.println("##############################");
		System.out.println("elija una opcion: ");
		opcionE=sc.nextInt();
		return opcionE;
	}

	@Override
	public int mostrarMenuYSeleccionCli( Scanner sc)throws Exception {
		
		int opcionE;
		
		System.out.println("##############################");
		System.out.println("0. Salir de la aplicacion");
		System.out.println("1. Registro de cliente");
		System.out.println("2. solicitud de citas medicas");
		System.out.println("3. consultar citas medicas");
		System.out.println("##############################");
		System.out.println("elija una opcion: ");
		opcionE=sc.nextInt();
		return opcionE;
	}
	@Override
	public int mostrarMenuYSeleccionEsp(Scanner sc)throws Exception {
		
		int opcionEsp;
		
		System.out.println("##############################");
		System.out.println("1. Psicologia");
		System.out.println("2. Traumatologia");
		System.out.println("3. Fisioterapia");
		System.out.println("##############################");
		System.out.println("elija una opcion: ");
		opcionEsp=sc.nextInt();
		return opcionEsp;
	}
	
	
	

	@Override
	public void menuEmp(List<ClienteDto> listaAntgClientes,Scanner sc,List<CitaDto> listaAntgCitas)throws Exception {
		
		OperativaInterfaz oi = new OperativaImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		int opcionE;
		boolean cerrarMenuC=false;
		
		while(!cerrarMenuC) {
			
			opcionE=mostrarMenuYSeleccionEmp(sc);
			
			switch(opcionE) {
			
				case 0:
					System.out.println("[INFO] se volvera al menu principal");
					fi.ficheroLog("[INFO] sevolvera al menu principal");
					cerrarMenuC=true;
					break;
					
				case 1:
					System.out.println("[INFO] Validar nuevo cliente");
					fi.ficheroLog("[INFO] Validar nuevo cliente");
					oi.validarCliente(listaAntgClientes,sc);
					break;
					
				case 2:
					System.out.println("[INFO] Imprimir citas medicas");
					fi.ficheroLog("[INFO] Imprimir citas medicas");
					oi.imprimirCitasMedicas(listaAntgCitas, sc);
					break;
					
				default:
					System.out.println("[ERROR] opcion introducida no valida");
					fi.ficheroLog("[ERROR] opcion introducida no valida");
					
					break;
			}
		}
		
	}
	

	@Override
	public void menuCli(List<ClienteDto> listaAntgClientes,Scanner sc,List<CitaDto> listaAntgCitas) throws Exception {
		
		OperativaInterfaz oi = new OperativaImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		int opcionC;
		boolean cerrarMenuC=false;
		
		while(!cerrarMenuC) {
			
			opcionC=mostrarMenuYSeleccionCli(sc);
			
			switch(opcionC) {
			
				case 0:
					System.out.println("[INFO] se volvera al menu principal");
					fi.ficheroLog("[INFO] sevolvera al menu principal");
					cerrarMenuC=true;
					break;
					
				case 1:
					System.out.println("[INFO] Registro de cliente");
					fi.ficheroLog("[INFO] Registro de clientes");
					oi.registroCliente(listaAntgClientes, sc);
					break;
					
				case 2:
					System.out.println("[INFO] Solicitud de citas medicas");
					fi.ficheroLog("[INFO] Solicitud de citas medicas");
					oi.solicitarCita(listaAntgCitas, sc);
					break;
					
				case 3:
					System.out.println("[INFO] Consultar citas medicas");
					fi.ficheroLog("[INFO] Consultar citas medicas");
					break;
					
				default:
					System.out.println("[ERROR] opcion introducida no valida");
					fi.ficheroLog("[ERROR] opcion introducida no valida");
					break;
			}
		}
		
		
	}
	
	public void menuEsp(Scanner sc)throws Exception {
		
		int opcionEsp;
		CitaDto cita = new CitaDto();
		
		opcionEsp=mostrarMenuYSeleccionEsp(sc);
		
		switch(opcionEsp) {
		
		case 1:
				System.out.println("Psicologia");
				cita.setEspecialidadCita("Psicologia");
			break;
			
		case 2:
			System.out.println("Traumatologia");
			cita.setEspecialidadCita("Traumatologia");
			break;
			
		case 3:
			System.out.println("Fisioterapia");
			cita.setEspecialidadCita("Fisiterapia");
			break;
		
		}
	}

	
	

}
