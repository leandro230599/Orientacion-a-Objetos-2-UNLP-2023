package ar.edu.unlp.info.oo2.ejercicio_10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Proyecto {

	private String nombre;
	private LocalDate inicio;
	private LocalDate fin;
	private String objetivo;
	private int integrantes;
	private double monto;
	private int margen;
	private State state;
	
	public String getNombre() {
		return nombre;
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
	
	public double getMonto() {
		return monto;
	}
	
	public int getMargen() {
		return margen;
	}
	
	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}
	
	public State getState() {
		return this.state;
	}
	
	public void changeState(State state) {
		this.state = state;
	}
	
	public void crearProyecto (String nombre, LocalDate inicio, LocalDate fin, String objetivo, int integrantes, double monto) {
		this.nombre = nombre;
		this.inicio = inicio;
		this.fin = fin;
		this.objetivo = objetivo;
		this.integrantes = integrantes;
		this.monto = monto;
		this.margen = 7;
		this.state = new Construccion();
	}
	
	public void aprobarEtapa() {
		this.state.aprobarEtapa(this);
	}
	
	public double costoProyecto() {
		return ((int) ChronoUnit.DAYS.between(this.getInicio(), this.getFin())) * (this.getIntegrantes() * this.getMonto());
	}
	
	public double precioProyecto() {
		return this.costoProyecto() + ((this.getMargen()) * this.costoProyecto() / 100);
	}
	
	public void cambiarMargen(int margen) {
		this.state.cambiarMargen(margen,this);
	}
	
	public void changeMargen(int margen) {
		this.margen = margen;
	}
	
	public void cancelarProyecto() {
		this.state.cancelarProyecto(this);
	}
	
}
