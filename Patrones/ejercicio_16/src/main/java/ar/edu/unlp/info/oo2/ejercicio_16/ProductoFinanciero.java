package ar.edu.unlp.info.oo2.ejercicio_16;

import java.time.LocalDate;

public abstract class ProductoFinanciero {
	private LocalDate fechaOperacion;
	
	public abstract double ganancia (double montoInicial);
}
