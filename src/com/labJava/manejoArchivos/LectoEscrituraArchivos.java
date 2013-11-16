package com.labJava.manejoArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectoEscrituraArchivos {
	
	public void crearYEscribirArchivo(String nombreArchivo){
		
		try{
			FileWriter fw = new FileWriter(new File(nombreArchivo)); // Crear archivo físicamente
																	 // en raíz del proyecto
			
			fw.write("Lab\nJava\n");	// futuro contenido del archivo
										// SALTOS DE LINEA MANUALES AFECTAN PERFORMANCE -> REMOVER
			
			fw.flush();	// Se garantiza contenido correcto en proceso de streaming
			
			fw.close();	// Se cierra archivo
			
		} catch(Exception ex) {
			ex.printStackTrace();			
		}		
		
	}
	
	public void leerArchivoCreado(String nombreArchivo) {
		
		try {
			
			char[] datosEscrArray = new char[50];	// LOS ARRAYS FIJOS AFECTAN PERFORMANCE -> REMOVER

			int caracteresLeidos = 0;
			
			FileReader isr = new FileReader(new File(nombreArchivo));
			
			caracteresLeidos = isr.read(datosEscrArray);		// Se almacena en datosEscrArray
																// el flujo de caracteres leídos
																// y el método devuelve cantidad de caracteres leídos
			String contenido = "";
			for(char a: datosEscrArray) {
				contenido = contenido + a;
			}
					
			isr.close();	// Se cierra archivo	
			
			System.out.println(this.getClass().toString() + " - Contenido archivo: \n" + contenido);
			
			System.out.println("cantidad de caracteres leidos: " + caracteresLeidos);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	public boolean isBorrarArchivosYDirectoriosCreados(String nombreArchivo, String nombreDirectorio) {
		
		// Implementar código
		
		return false;
		
	}

	
}
