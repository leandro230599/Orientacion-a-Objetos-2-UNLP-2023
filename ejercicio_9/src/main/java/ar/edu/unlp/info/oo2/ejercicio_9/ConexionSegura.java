package ar.edu.unlp.info.oo2.ejercicio_9;

public class ConexionSegura extends Conexion{
	
	private Encriptador encriptador;
	
	public ConexionSegura() {
		this.encriptador = new Encriptador();
	}
	
	public void enviar(String mensaje) {
		String mensajeEncriptado = this.encriptador.encriptar(mensaje);
		super.enviar(mensajeEncriptado);
	}
}
