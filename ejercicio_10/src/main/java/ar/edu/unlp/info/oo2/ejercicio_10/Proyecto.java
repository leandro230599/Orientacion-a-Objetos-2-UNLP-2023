package ar.edu.unlp.info.oo2.ejercicio_10;

import java.time.LocalDate;

public class Proyecto {

	private LocalDate inicio;
	private LocalDate fin;
	private String objetivo;
	private int integrantes;
	private int monto;
	private int margen;
	private State state;
	
	public Proyecto(LocalDate inicio, LocalDate fin, String objetivo, int integrantes, int monto) {
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.integrantes = integrantes;
		this.monto = monto;
		this.margen = 7;
		this.state = new Construccion();
	}
	
	
	public LocalDate getInicio() {
		return inicio;
	}
	
	public LocalDate getFin() {
		return fin;
	}
	
	public String getObjetivo() {
		return objetivo;
	}
	
	public int getIntegrantes() {
		return integrantes;
	}
	
	public int getMonto() {
		return monto;
	}
	
	public int getMargen() {
		return margen;
	}
	
	public void aprobarEtapa() {
		this.state.aprobarEtapa(this);
	}
	
}
