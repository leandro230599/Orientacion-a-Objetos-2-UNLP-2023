package ar.edu.unlp.info.oo2.ejercicio_16;

public class Director {
	private ProductoFinanciero builder;
	
	public Director (ProductoFinanciero builder) {
		this.builder = builder;
	}
	
	public void changeBuilder(ProductoFinanciero builder) {
		this.builder = builder;
	}
	
	public double ganancia()
}
