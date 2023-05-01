package ar.edu.unlp.info.oo2.ejercicio_14;

public class FileOO2 implements Component {
	
	private String nombre;
	private String extension;
	private int tamano;
	private String fecha_creacion;
	private String fecha_modificacion;
	private String permisos;
	
	
	
	public FileOO2(String nombre, String extension, int tamano, String fecha_creacion, String fecha_modificacion, String permisos) {
		this.nombre = nombre;
		this.extension = extension;
		this.tamano = tamano;
		this.fecha_creacion = fecha_creacion;
		this.fecha_modificacion = fecha_modificacion;
		this.permisos = permisos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getExtension() {
		return extension;
	}
	public int getTamano() {
		return tamano;
	}
	public String getFecha_creacion() {
		return fecha_creacion;
	}
	public String getFecha_modificacion() {
		return fecha_modificacion;
	}
	public String getPermisos() {
		return permisos;
	}
	
	public String prettyPrint() {
		return "";
	}
	
	
}
