package ar.edu.unlp.info.oo2.ejercicio_16;

public class PlazoFijoRenovable extends ProductoFinanciero{
	private int cantidadDias;
	private double interes;
	
	public PlazoFijoRenovable (int dias, double interes) {
		this.cantidadDias = dias;
		this.interes = interes;
	}

	public double ganancia(double montoInicial) {
		return montoInicial * ((this.interes/100)*this.cantidadDias/365);
	}

}
