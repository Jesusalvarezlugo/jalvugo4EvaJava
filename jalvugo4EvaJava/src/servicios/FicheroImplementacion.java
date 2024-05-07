package servicios;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void ficheroLog(String texto) {
		
		try {
			DateTimeFormatter formato=DateTimeFormatter.ofPattern("ddMMyyyy");
			LocalDate fechaActual=LocalDate.now();
			String nombreFichero="log-"+fechaActual.format(formato)+".txt";
			FileWriter escritor = new FileWriter(nombreFichero);
			escritor.write(texto+"\n");
			
			escritor.close();
		}catch(IOException e) {
			
			System.out.println("Error al escribir en el fichero");
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public void crearFicheroImprimirCitas() {
		
		try {
			DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fechaActual=LocalDate.now();
			String nombreFichero="informe-"+fechaActual.format(formato)+".txt";
			FileWriter escritor = new FileWriter(nombreFichero);
			escritor.write("\n");
			
			escritor.close();
		}catch(IOException e) {
			
			System.out.println("Error al escribir en el fichero");
			System.out.println(e.getMessage());
		}
	}

}
