package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persona{
	
	private String cuit;
	private static double descuentoJuridico = 0.15;
	
	public PersonaJuridica(String fullName, String telefono, String cuit) {
		super(fullName, telefono);
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return descuentoJuridico;
	}
}
