package ar.edu.unlp.info.oo2.facturacion_llamadas;

public abstract class Llamada {
	private int duracion;
	private String emisor;
	private String remitente;
	private static double valorFijo = 0.21;

	public Llamada(String emisor, String remitente, int duracion) {
		this.emisor= emisor;
		this.remitente= remitente;
		this.duracion = duracion;
	}
	
	public double getCostoLlamada () {
		return this.duracion * this.getCosto() + (this.duracion * this.getCosto() * this.valorFijo);
	}
	
	public abstract double getCosto();
	
	
	
	
}
