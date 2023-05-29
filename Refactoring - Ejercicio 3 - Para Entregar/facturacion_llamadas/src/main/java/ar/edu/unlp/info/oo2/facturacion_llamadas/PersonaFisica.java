package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persona{
	
	private String documento;
	private static double descuentoFisico = 0;

	public PersonaFisica(String fullName, String telefono,String documento) {
		super(fullName, telefono);
		this.documento = documento;
	}

	@Override
	public double getDescuento() {
		return descuentoFisico;
	}
}
