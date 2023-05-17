package ar.edu.unlp.info.oo2.ejercicio_18;

public interface Builder {
	void agregarPan(double precio);
	void agregarAderezo(double precio);
	void agregarPrincipal(double precio);
	void agregarAdicional(double precio);
	void reset();
	
}
