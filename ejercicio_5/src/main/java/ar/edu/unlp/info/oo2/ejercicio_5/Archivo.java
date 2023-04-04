package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public class Archivo implements FileSystem{
	
	private LocalDate fecha;
	private String nombre;
	private int tamano;
    /**
* Crea un nuevo archivo con nombre <nombre>, de <tamano> tamano 
* y en la fecha <fecha>.
    */
    public Archivo (String nombre, LocalDate fecha, int tamano) {
    	this.nombre = nombre;
    	this.fecha = fecha;
    	this.tamano = tamano;
    }
    
	public LocalDate getFecha() {
		return fecha;
	}
	public String getNombre() {
		return nombre;
	}
	public int tamanoTotalOcupado() {
		return tamano;
	}
	
	 public Archivo archivoMasNuevo() {
		 return this;
	 }
	 
	 public Archivo archivoMasGrande() {
		 return this;
	 }

}

