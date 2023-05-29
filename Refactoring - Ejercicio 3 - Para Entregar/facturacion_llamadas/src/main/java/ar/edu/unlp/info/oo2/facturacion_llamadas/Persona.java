package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	
	private List<Llamada> llamadasRealizadas = new ArrayList<Llamada>();
	private String nombreYapellido;
	private String telefono;
	
	public Persona (String fullName, String telefono) {
		this.nombreYapellido = fullName;
		this.telefono = telefono;
	}
	
	
	public List<Llamada> getLlamadasRealizadas() {
		return llamadasRealizadas;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public double calcularMontoTotalLlamadas() {
		return this.getLlamadasRealizadas().stream()
				.mapToDouble(llamada -> {
								double sinDescuento = llamada.getCostoLlamada();
								return sinDescuento - sinDescuento * this.getDescuento();
							})
				.reduce(0, Double::sum);
	}
	
	public Llamada agregarLlamadaRealizada(Llamada llamada) {
		this.llamadasRealizadas.add(llamada);
		return llamada;
	}

	public abstract double getDescuento();
	
	
}
