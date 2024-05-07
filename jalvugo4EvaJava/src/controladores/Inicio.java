package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.CitaDto;
import dtos.ClienteDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

/*
 * Clase por la que entra el flujo de la aplicacion
 * */
public class Inicio {

	/*
	 * Clase por la que se llama a los metodos externos
	 * */
	public static void main(String[] args) {
		
		
		int opcionP;
		boolean cerrarMenuP=false;
		List<ClienteDto> listaClientes=new ArrayList<ClienteDto>();
		List<CitaDto> listaCitas=new ArrayList<CitaDto>();
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		Scanner sc = new Scanner(System.in);
		
		
		try {
			while(!cerrarMenuP) {
				
				opcionP=mi.mostrarMenuYSeleccionPrin(sc);
				
				switch(opcionP) {
				
				case 0:
						System.out.println("[INFO] se cerrara la aplicacion");
						fi.ficheroLog("[INFO] se cerrara la aplicacion");
						cerrarMenuP=true;
					break;					
				case 1:
					System.out.println("[INFO] se accedera al menu de empleados");
					fi.ficheroLog("[INFO] se accedera al menu de empleados");
					mi.menuEmp(listaClientes, sc,listaCitas);
					break;
					
				case 2:
					System.out.println("[INFO] se accedera al menu de clientes");
					fi.ficheroLog("[INFO] se accedera al menu de clientes");
					mi.menuCli(listaClientes, sc,listaCitas);
					break;
				}
			}
		}catch(Exception e) {
			
			System.out.println("Error en la aplicacion.");
			System.out.println(e.getMessage());
		}

	}

}
