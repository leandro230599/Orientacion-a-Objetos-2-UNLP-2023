package ar.edu.unlp.info.oo2.ejercicio_16;

public class CompraPesos extends ProductoFinanciero{
	private double valorCompra;
	
	public CompraPesos(double valor) {
		this.valorCompra = valor;
	}
	
	public double ganancia(double montoInicial) {
		return montoInicial * this.valorCompra;
	}
}
