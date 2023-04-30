package ar.edu.unlp.info.oo2.ejercicio_10;

public abstract class State {
	
	public void aprobarEtapa(Proyecto proyecto) {}
	public void cambiarMargen(int margen, Proyecto proyecto) {}
	public void cancelarProyecto(Proyecto proyecto) {
		proyecto.setObjetivo("(Cancelado)");
		proyecto.changeState(new Cancelado());
	}
}
