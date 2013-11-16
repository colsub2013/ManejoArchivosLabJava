package com.labJava.manejoArchivos;

/*

	Ejercicio 1: 
	
	. Solventar los problemas de performance y funcionalidad en el archivo: 
	  
	  com.labJava.manejoArchivos.LectoEscrituraArchivos
	  
	  1. Modificar el m�todo 'public void crearYEscribirArchivo(String nombreArchivo){' tal de intercalar
	     la clase BufferedWriter en la forma (BufferedWriter(FileWriter(File))) y utilizar sus m�todos
	     para evitar los saltos de l�nea manuales
	  
	  2. Modificar el m�todo 'public void leerArchivoCreado(String nombreArchivo) {' tal de intercalar tambi�n
	     la clase BufferedReader en la forma BufferedReader(FileReader(File)) tal de evitar usar arrays fijos
	     predefinidos para almacenar el flujo de caracteres le�dos
	     
	Ejercicio 2: Modificar los m�todos 'public void crearYEscribirArchivo(String nombreArchivo){' y 
	'public void leerArchivoCreado(String nombreArchivo) {' tal que el archivo que se crea, se popula y
	luego se lee est� alojado en un directorio con el nombre dado por un segundo argumento a agregar en 
	ambos m�todos. Los m�todos se modificar�an de la forma:
	
	. 'public void crearYEscribirArchivo(String nombreArchivo, String nombreDirectorio) {'
	. 'public void leerArchivoCreado(String nombreArchivo, String nombreDirectorio) {'
	
	Ejercicio 3: Implementar el m�todo:
	
	public boolean isBorrarArchivosYDirectoriosCreados(String nombreArchivo, String nombreDirectorio) {
	
	el cual debe hacer un borrado de todos los archivos y directorios que se hayan creado, escrito y 
	le�do, el cual debe llamarse al pasar un 3er argumento con la clave 'borrar' en el array de Strings
	del m�todo main(...)

*/

public class ManejoArchivosMain {

	public static void main(String[] args) {

		LectoEscrituraArchivos lea = new LectoEscrituraArchivos();
		lea.crearYEscribirArchivo(args[0]);
		
		lea.leerArchivoCreado(args[0]);
		
		if(args.length > 2 && args[2].equals("borrar")) {
			boolean isBorrado = lea.isBorrarArchivosYDirectoriosCreados(args[0], args[1]);
			System.out.println("Archivo borrado: " + isBorrado);
		} else {
			System.out.println("No hay archivos para borrar");
		}

		
	}

}
