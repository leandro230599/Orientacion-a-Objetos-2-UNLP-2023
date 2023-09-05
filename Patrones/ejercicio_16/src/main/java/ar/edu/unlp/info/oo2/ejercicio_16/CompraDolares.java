package ar.edu.unlp.info.oo2.ejercicio_16;

public class CompraDolares extends ProductoFinanciero {
	private double valorCompra;
	
	public CompraDolares (double valor) {
		this.valorCompra = valor;
	}
	
	public double ganancia(double montoInicial) {
		return montoInicial / this.valorCompra;
	}
}
