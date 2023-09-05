package ar.edu.unlp.info.oo2.ejercicio_5;

import java.time.LocalDate;

public interface FileSystem {
	String getNombre();
	LocalDate getFecha();
	int tamanoTotalOcupado();
	Archivo archivoMasGrande();
	Archivo archivoMasNuevo(); 
}
