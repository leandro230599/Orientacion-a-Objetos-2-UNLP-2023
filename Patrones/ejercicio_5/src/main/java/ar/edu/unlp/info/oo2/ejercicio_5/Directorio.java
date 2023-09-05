package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Directorio implements FileSystem{
	
	private List<FileSystem> archivos;
	private String nombre;
	private LocalDate fecha;
/**
* Crea un nuevo Directorio con nombre <nombre> y en la fecha <fecha>.
*/
        public Directorio(String nombre, LocalDate fecha) {
        	this.nombre = nombre;
        	this.fecha = fecha;
        	this.archivos = new ArrayList<FileSystem>();
        }
        
        public void agregar(FileSystem archivo) {
        	this.archivos.add(archivo);        		
        }
       
   	 /**
* Retorna el espacio total ocupado, incluyendo su contenido.
*/
        public int tamanoTotalOcupado() {
        	return 32 + this.archivos.stream().mapToInt(a -> a.tamanoTotalOcupado()).sum();
        }

    	/**
* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
* filesystem contenido por directorio receptor
*/
        public Archivo archivoMasGrande() {
        	return this.archivos.stream().map(a -> a.archivoMasGrande()).max(Comparator.comparingInt(a -> a.tamanoTotalOcupado())).orElse(null);
        }
	 /**
* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
* del filesystem contenido por directorio receptor.
*/
        public Archivo archivoMasNuevo() {
        	return this.archivos.stream().map(a -> a.archivoMasNuevo()).max(Comparator.comparing(a -> a.getFecha())).orElse(null);
        }
        
        public String getNombre() {
        	return this.nombre;
        }
        
        public LocalDate getFecha() {
        	return this.fecha;
        }
        
        
    
}

