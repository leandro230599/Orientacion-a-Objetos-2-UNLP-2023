package ar.edu.unlp.info.oo2.ejercicio_10;

public class Construccion extends State {

	@Override
	public void aprobarEtapa(Proyecto proyecto) {
		if (proyecto.precioProyecto()>0) {
			proyecto.changeState(new Evaluacion());
		} else {
			throw new RuntimeException("No se puede aprobar un proyecto en construccion si su precio es 0");
		}
	}
	
	@Override
	public void cambiarMargen(int margen, Proyecto proyecto) {
		if (margen >= 8 && margen <=10) {
			proyecto.changeMargen(margen);
		}
	}
	
}
