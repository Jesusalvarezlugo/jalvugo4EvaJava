package servicios;

import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import dtos.CitaDto;
import dtos.ClienteDto;

/*
 * Clase que contiene la operativa de la aplicacion
 * */
public class OperativaImplementacion implements OperativaInterfaz {
	
	
	
	private long idAutoC(List<ClienteDto> listaAntgCliente)throws Exception {
		
		int tamanioLista=listaAntgCliente.size();
		long idNuevo;
		
		if(tamanioLista>0) {
			
			idNuevo=listaAntgCliente.get(tamanioLista - 1).getId() +1;
		}else {
			idNuevo=1;
		}
		
		return idNuevo;
	}


	@Override
	public void registroCliente(List<ClienteDto> listaClientesAntg,Scanner sc)throws Exception {
		
		String dniCliente;
		String nombreCliente;
		String apellidosCliente;
		long idCliente=idAutoC(listaClientesAntg);
		
		
		System.out.println("Introduzca el Dni del cliente: ");
		dniCliente=sc.next();
		System.out.println("Introduzca el nombre del cliente: ");
		nombreCliente=sc.next();
		System.out.println("Introduzca los apellidos del cliente: ");
		apellidosCliente=sc.next();
		
		ClienteDto cliente= new ClienteDto(idCliente,dniCliente,nombreCliente,apellidosCliente);
		
		cliente.setFechaAltaCliente(LocalDateTime.now());
		
		listaClientesAntg.add(cliente);
		
		
	}
	

	@Override
	
	public void validarCliente(List<ClienteDto> listaAntgCliente,Scanner sc)throws Exception {
		
		ClienteDto clienteVal= new ClienteDto();
		/*ClienteDto clienteVal= new ClienteDto();
		String dniClienteAValidar;
		for(ClienteDto cliente:listaAntgCliente) {
			
			System.out.println(cliente.toString());
		}
		
		System.out.println("Introduzca un dni de la lista para validar el cliente: ");
		dniClienteAValidar=sc.next();
		
		if(dniClienteAValidar==clienteVal.getDniCliente()) {
			
			clienteVal.setClienteVal(true);
		}else {
			
			System.out.println("El cliente no existe.");
		}
		*/
		
		for(int i=0;i<listaAntgCliente.size();i++) {
			
			System.out.println(listaAntgCliente.get(i).toString());
		}
		
		String dniClienteAValidar;
		System.out.println("Introduzca un dni de la lista para validar el cliente: ");
		dniClienteAValidar=sc.next();
		
		for(int i=0;i<listaAntgCliente.size();i++) {
			
			if(dniClienteAValidar==clienteVal.getDniCliente()) {
				
				clienteVal.setClienteVal(true);
				break;
			}
				
				
			
		}
		
		System.out.println("El cliente no existe.");
		
	}


	@Override
	public void solicitarCita(List<CitaDto> listaAntgCitas,Scanner sc)throws Exception {
		
		String fechaCitaS;
		CitaDto cita= new CitaDto();
		String dniCliente;
		ClienteDto cliente= new ClienteDto();
		MenuInterfaz mi = new MenuImplementacion();
		System.out.println("Introduzca el dni del cliente: ");
		dniCliente=sc.next();
		DateTimeFormatter formato= DateTimeFormatter.ofPattern("ddMMyyy HH:mm:ss");
		
		if(dniCliente==cliente.getDniCliente()&&cliente.isClienteVal()==true) {
			
			mi.menuEsp(sc);
			
			System.out.println("Introduzca la fecha y hora que quiere la cita:ddMMyyy HH:mm:ss ");
			fechaCitaS=sc.next();
			
			cita.setFechaCita(LocalDateTime.parse(fechaCitaS,formato));
			cita.setIdCita(idAutoCita(listaAntgCitas));
			cita.setDniClienteCita(cliente.getDniCliente());
			
			listaAntgCitas.add(cita);
			
				
		}
		
	}
	
	private long idAutoCita(List<CitaDto> listaAntgCitas)throws Exception {

		
		int tamanioLista=listaAntgCitas.size();
		long idNuevo;
		
		if(tamanioLista>0) {
			
			idNuevo=listaAntgCitas.get(tamanioLista - 1).getIdCita() +1;
		}else {
			idNuevo=1;
		}
		
		return idNuevo;
	}
	
	public void imprimirCitasMedicas(List<CitaDto> listaAntgCitas,Scanner sc)throws Exception {
		
		try {
			DateTimeFormatter formato= DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaPars;
			String fechaAConsultar;
			
			ClienteDto cliente = new ClienteDto();
			System.out.println("Introduzca la fecha a consultar:");
			fechaAConsultar=sc.next();
			
			fechaPars=LocalDate.parse(fechaAConsultar, formato);
			String nombreFichero="informe-"+fechaPars.format(formato)+".txt";
			FileWriter escritor = new FileWriter(nombreFichero);
			for(CitaDto cita:listaAntgCitas) {
				
				if(fechaPars==cita.getFechaCita().toLocalDate()&&cita.getDniClienteCita()==cliente.getDniCliente()) {
					
					escritor.write(cita.getDniClienteCita()+";"+cliente.getApellidosCliente()+", "+cliente.getNombreCliente()+";"+cita.getEspecialidadCita());
				}
			}
			
			escritor.close();
		}catch(Exception e) {
			System.out.println("Error al escribir en el fichero de imprimir citas");
		}
		
		
	}
	
	

}
