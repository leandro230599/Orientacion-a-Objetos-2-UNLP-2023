package ar.edu.unlp.info.oo2.ejercicio_9;

public class Mensajero {
	private Conexion conexion;
	
	public Mensajero () {
		this.conexion = new ConexionSegura();
	}
	
	public void enviar(String mensaje) {
		this.conexion.enviar(mensaje);
	}
}
