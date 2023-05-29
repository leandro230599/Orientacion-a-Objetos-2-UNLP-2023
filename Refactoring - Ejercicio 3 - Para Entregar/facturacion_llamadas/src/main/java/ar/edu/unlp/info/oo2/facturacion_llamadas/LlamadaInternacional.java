package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada{

	public LlamadaInternacional(String emisor, String remitente, int duracion) {
		super(emisor, remitente, duracion);
	}

	@Override
	public double getCosto() {
		return 200;
	}

}
