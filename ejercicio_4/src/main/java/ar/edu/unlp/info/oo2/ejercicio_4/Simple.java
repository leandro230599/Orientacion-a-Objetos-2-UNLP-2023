package ar.edu.unlp.info.oo2.ejercicio_4;

public abstract class Simple extends Topografia{

	abstract public Double getProporcionTierra();
	abstract public Double getProporcionAgua();
	
	@Override
	public boolean comparar(Topografia t) {
		return t.compararConSimple(this);
	}
	
	public boolean compararConSimple(Simple t) {
		return this.getClass().equals(t.getClass());
	}
	
}
